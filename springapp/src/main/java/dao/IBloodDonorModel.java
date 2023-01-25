package dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.BloodDonorModel;

public interface IBloodDonorModel extends JpaRepository<BloodDonorModel, String> {
	
	 
//	  @Query(value="SELECT * FROM blood_donor_model WHERE blood_group=?"
//	  ,nativeQuery=true) 
//	  public BloodDonorModel findByDonorGroup(String
//	  bloodGroup);
	  
	//@Query(value="SELECT * FROM blood_donor_model WHERE blood_group=?",nativeQuery=true)
//	public BloodDonorModel findByBloodGroup(String bloodGroup);
	
	@Query(value="SELECT * FROM blood_donor_model WHERE id=?",nativeQuery=true)
	public BloodDonorModel findByDonorId(String id);
	
}