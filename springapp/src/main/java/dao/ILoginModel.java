package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.LoginModel;

public interface ILoginModel extends JpaRepository<LoginModel, Integer>{

	
	
}
