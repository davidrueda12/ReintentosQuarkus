package co.com.telefonica.integration.msretryapprovedtrx.rest.client;

import co.com.telefonica.integration.msretryapprovedtrx.dto.ResponseDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author Red Hat
 *
 */
@Path("/customer/v1")
@RegisterRestClient(configKey = "apply-recharge-api")
public interface MsApplyRechargeSyncService {

	@POST
	@Path("/rechargesCatalog/retryTrx")
	ResponseDTO Approved();
}
