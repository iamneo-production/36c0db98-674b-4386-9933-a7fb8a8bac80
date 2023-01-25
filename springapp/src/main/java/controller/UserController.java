package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dao.IBloodBankModel;
import dao.IBloodDonorModel;
import dao.IUserModel;
import model.BloodBankModel;
import model.BloodDonorModel;

import model.UserModel;

@RestController
public class UserController {

	@Autowired
	IBloodDonorModel donor;

	@Autowired
	IBloodBankModel bank;
	
	@Autowired
	IUserModel user;

	/*
	 * @GetMapping("donor/{id}") public String searchDonor(@PathVariable("id")
	 * String id) { return donor.findById(id).get().getDonorEmail(); }
	 * 
	 * @GetMapping("sample/{id}") public String searchSample(@PathVariable("id")
	 * String id) { return bank.findById(id).get().getBloodGroup(); }
	 */

	
//	  @GetMapping("/donor/{id}") public BloodDonorModel
//	  getAllDonorByGroup(@PathVariable("group") String bloodGroup) {
//	  BloodDonorModel d = donor.findByBloodGroup(bloodGroup); return d; }
	

	@GetMapping("/login")
	public String userLogin(@RequestBody UserModel u) {
		if(user.findByEmail(u.getEmail())!=null) {
			if(user.findByPassword(u.getPassword())!=null) {
				return "true";
			}
			else {
				return "false";
			}
		}
		else {
			return "false";
		}
	}
	
	@PostMapping("/signup")
	public String userSignup(@RequestBody  UserModel b) {
		user.save(b);
		return "Signed Up"; 
	}
	
	@GetMapping("/donor/{id}")
	public BloodDonorModel getParticularDonorById(@PathVariable("id") String id) {
		BloodDonorModel d = donor.findByDonorId(id);
		return d;
	}
	
	@GetMapping("/sample/{id}")
	public BloodBankModel getParticularSampleById(@PathVariable("id") String bloodBankId) {
		BloodBankModel b=bank.findBySampleId(bloodBankId);
		return b;
	}
}
