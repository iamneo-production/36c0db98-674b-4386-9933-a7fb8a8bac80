package model;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
//@Table(name="blood_donor_model")
public class BloodDonorModel {
@Id
	private String id;
//	@Column(name = "donor_email")
	private String donorEmail;
//	@Column(name = "blood_group")
	private String bloodGroup;
//	@Column(name = "ph_level")
	private String PHlevel;
//	@Column(name = "blood_pressure")
	private String bloodPressure;
	private boolean active;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDonorEmail() {
		return donorEmail;
	}

	public void setDonorEmail(String donorEmail) {
		this.donorEmail = donorEmail;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	

	public String getPHlevel() {
		return PHlevel;
	}

	public void setPHlevel(String pHlevel) {
		PHlevel = pHlevel;
	}

	public String getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
