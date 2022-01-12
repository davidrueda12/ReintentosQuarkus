package co.com.telefonica.integration.msretryapprovedtrx.rest.client;

import co.com.telefonica.integration.msretryapprovedtrx.dto.ResponseDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
@RegisterRestClient(configKey = "")
public interface MsRetryRechargueTRXService {

    @GET
    @Path("/rechargesCatalog/retryTrx")
    ResponseDTO processRechargesPending();
}
