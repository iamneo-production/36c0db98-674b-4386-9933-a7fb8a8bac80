package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dao.IBloodBankModel;
import dao.IBloodDonorModel;
import model.BloodBankModel;
import model.BloodDonorModel;



@RestController

public class AdminController {

	@Autowired
	IBloodDonorModel donor;
	
	@Autowired
	IBloodBankModel bank;
	
	@GetMapping("/donor")
	public List<BloodDonorModel> viewDonor() {
		return donor.findAll();
	}
	
	@GetMapping("/sample")
	public List<BloodBankModel> viewSample() {
		return bank.findAll();
	}
	
	@PostMapping("admin/addSample")
	public String addSample(@RequestBody BloodBankModel b) {
		bank.save(b);
		return "Sample added";
	}
	
	@DeleteMapping("admin/sample/{id}")
	public String deleteSample(@PathVariable("id") String id) {
		bank.deleteById(id);
		return "Sample deleted";
	}
	
	@PutMapping("admin/sample/{id}")
	public String updateSample(@RequestBody BloodBankModel b, @PathVariable("id") String id) {
		bank.findById(id).map(update -> {
			update.setBloodGroup(b.getBloodGroup());
			update.setBloodPressure(b.getBloodPressure());
			update.setPHLevel(b.getPHLevel());
			update.setQuantity(b.getQuantity());
			
			return bank.save(update);
		});
		return "Sample updated";
	}
	
	@PutMapping("admin/donor/{id}")
	public String updateDonor(@RequestBody BloodDonorModel b, @PathVariable("id") String id) {
		donor.findById(id).map(update -> {
		    update.setDonorEmail(b.getDonorEmail());
		    update.setBloodGroup(b.getBloodGroup());
		    update.setPHlevel(b.getPHlevel());
		    update.setBloodPressure(b.getBloodPressure());
		    update.setActive(b.isActive());
			return donor.save(update);
		});
		return "Donor Updated";
	}
	
	@DeleteMapping("admin/donor/{id}")
	public String deleteDoor(@PathVariable("id") String id) {
		donor.deleteById(id);
		return "Donor Removed";
	}

}
