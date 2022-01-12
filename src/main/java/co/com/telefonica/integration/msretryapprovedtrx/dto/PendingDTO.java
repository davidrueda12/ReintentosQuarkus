package co.com.telefonica.integration.msretryapprovedtrx.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Red Hat
 *
 */
public class PendingDTO {

	@JsonProperty(value = "dataid")
	private String dataID;
	
	@JsonProperty(value = "statusMP")
	private String statusMP;
	
	@JsonProperty(value = "jsonsolicitud")
	private String jsonSolicitud;
	
	@JsonProperty(value = "statuslegacy")
	private String statusLegacy;
	
	@JsonProperty(value = "reintentos")
	private Integer reintentos;

	public String getDataID() {
		return dataID;
	}

	public void setDataID(String dataID) {
		this.dataID = dataID;
	}

	public String getStatusMP() {
		return statusMP;
	}

	public void setStatusMP(String statusMP) {
		this.statusMP = statusMP;
	}

	public String getJsonSolicitud() {
		return jsonSolicitud;
	}

	public void setJsonSolicitud(String jsonSolicitud) {
		this.jsonSolicitud = jsonSolicitud;
	}

	public String getStatusLegacy() {
		return statusLegacy;
	}

	public void setStatusLegacy(String statusLegacy) {
		this.statusLegacy = statusLegacy;
	}

	public Integer getReintentos() {
		return reintentos;
	}

	public void setReintentos(Integer reintentos) {
		this.reintentos = reintentos;
	}

}
