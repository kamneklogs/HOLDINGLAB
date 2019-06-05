package model;

public class MProducts{

	private String sanitaryR;
	private boolean status;
	private String expiration;
	private String modality;

	public MProducts(String sanitaryR, boolean status, String expiration, String modality) {
		super();
		this.sanitaryR = sanitaryR;
		this.status = status;
		this.expiration = expiration;
		this.modality = modality;
	}

	public String getSanitaryR() {
		return sanitaryR;
	}

	public void setSanitaryR(String sanitaryR) {
		this.sanitaryR = sanitaryR;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public String getModality() {
		return modality;
	}

	public void setModality(String modality) {
		this.modality = modality;
	}

}
