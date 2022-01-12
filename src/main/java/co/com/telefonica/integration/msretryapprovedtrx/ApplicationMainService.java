package co.com.telefonica.integration.msretryapprovedtrx;

import co.com.telefonica.integration.msretryapprovedtrx.bean.DateBean;
import co.com.telefonica.integration.msretryapprovedtrx.service.ClasificationStatusService;
import io.quarkus.runtime.QuarkusApplication;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import java.util.Date;

public class ApplicationMainService implements QuarkusApplication {

    private static final Logger LOG = Logger.getLogger(ApplicationMainService.class);

    @Inject
    ClasificationStatusService clasificationStatusService;

    @Override
    public int run(String... args) throws Exception {
        LOG.info("Inicia ejecucion del servicio ms-retry-approved-trx ");
        Date beginDate = new Date();
        try {
            clasificationStatusService.Approved();
        } catch (Exception e) {
            return 1;
        }
        Date endDate = new Date();
        LOG.info("Finaliza ejecución del servicio ms-retry-approved-trx | Duration: " + DateBean.calculateDate(beginDate, endDate));
        return 0;
    }

}
