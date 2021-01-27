package coffeeSalesSystem.entities.concretes;

public class EdevletValidation {
	private String turkishRepublicIdentificationNo;
	private String citizenName;
	private String citizenSurname;
	private String citizenBirthDate;

	public EdevletValidation(String turkishRepublicIdentificationNo, String citizenName, String citizenSurname,
			String citizenBirthDate) {
		this.turkishRepublicIdentificationNo = turkishRepublicIdentificationNo;
		this.citizenName = citizenName;
		this.citizenSurname = citizenSurname;
		this.citizenBirthDate = citizenBirthDate;
	}

	public String getTurkishRepublicIdentificationNo() {
		return turkishRepublicIdentificationNo;
	}

	public void setTurkishRepublicIdentificationNo(String turkishRepublicIdentificationNo) {
		this.turkishRepublicIdentificationNo = turkishRepublicIdentificationNo;
	}

	public String getCitizenName() {
		return citizenName;
	}

	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}

	public String getCitizenSurname() {
		return citizenSurname;
	}

	public void setCitizenSurname(String citizenSurname) {
		this.citizenSurname = citizenSurname;
	}

	public String getCitizenBirthDate() {
		return citizenBirthDate;
	}

	public void setCitizenBirthDate(String citizenBirthDate) {
		this.citizenBirthDate = citizenBirthDate;
	}

}
