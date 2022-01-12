package co.com.telefonica.integration.msretryapprovedtrx.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 
 * @author Red Hat
 *
 */
public class ResponseDTO {

	@JsonProperty("listPending")
	private List<PendingDTO> listPending;

	public List<PendingDTO> getListPending() {
		return listPending;
	}

	public void setListPending(List<PendingDTO> listPending) {
		this.listPending = listPending;
	}

}
