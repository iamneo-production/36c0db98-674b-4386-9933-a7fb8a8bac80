package model;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
//@Table(name="blood_bank_model")
public class BloodBankModel {
	@Id
//	@Column(name = "blood_bank_id")
	private String bloodBankId;
//	@Column(name = "blood_group")
	private String bloodGroup;
//	@Column(name = "blood_pressure")
	private String bloodPressure;
//	@Column(name = "PH_level")
	private String PHLevel;
	private int quantity;

	public String getBloodBankId() {
		return bloodBankId;
	}

	public void setBloodBankId(String bloodBankId) {
		this.bloodBankId = bloodBankId;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public String getPHLevel() {
		return PHLevel;
	}

	public void setPHLevel(String pHLevel) {
		PHLevel = pHLevel;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
