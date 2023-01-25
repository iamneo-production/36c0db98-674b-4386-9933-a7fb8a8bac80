package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.BloodBankModel;
import model.BloodDonorModel;

public interface IBloodBankModel extends JpaRepository<BloodBankModel, String>{

	@Query(value="SELECT * FROM blood_bank_model WHERE blood_bank_id=?",nativeQuery=true)
	public BloodBankModel findBySampleId(String bloodBankId);
}
