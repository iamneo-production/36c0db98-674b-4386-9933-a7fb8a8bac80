package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import model.UserModel;

public interface IUserModel extends JpaRepository<UserModel, String>{

	
	@Query(value="SELECT * FROM user_model WHERE email=?",nativeQuery =true)
	public UserModel findByEmail(String email);
	
	@Query(value="SELECT * FROM user_model WHERE password=?",nativeQuery =true)
	public UserModel findByPassword(String password);
}
