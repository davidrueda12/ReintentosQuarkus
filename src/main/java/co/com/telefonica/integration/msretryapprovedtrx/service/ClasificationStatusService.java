package co.com.telefonica.integration.msretryapprovedtrx.service;

import co.com.telefonica.integration.msretryapprovedtrx.bean.DateBean;
import co.com.telefonica.integration.msretryapprovedtrx.dto.PendingDTO;
import co.com.telefonica.integration.msretryapprovedtrx.rest.client.MsRetryRechargueTRXService;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ProcessingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ApplicationScoped
public class ClasificationStatusService {

    private static final Logger LOG = Logger.getLogger(ClasificationStatusService.class);

    @RestClient
    MsRetryRechargueTRXService msRetryRechargueTRXService;

    public List<PendingDTO> Approved() {
        Date beginDate = new Date();
        LOG.info("Inicio del filtrado de los procesos pendientes");
        try {
            Date endDate = new Date();
            List<PendingDTO> listApproved = (List<PendingDTO>) msRetryRechargueTRXService.processRechargesPending();
            List<PendingDTO> response = new ArrayList<>();
            for (PendingDTO pending : listApproved) {
                if (pending.getStatusMP() == "aprobado") {
                    response.add(pending);
                } else {
                    continue;
                }
            }
            LOG.info("consumo exitoso del servicio ms-approved-trx | Duration: " + DateBean.calculateDate(beginDate, endDate));
            return response;
        } catch (ProcessingException e){
            LOG.error("Error consumiendo el servicio de filtro de recargas pendientes | Exception: " + e.getClass() + " - " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
