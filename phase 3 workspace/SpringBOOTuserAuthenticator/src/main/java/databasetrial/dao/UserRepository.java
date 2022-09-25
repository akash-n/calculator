package databasetrial.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import databasetrial.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	@Query("SELECT u FROM User u WHERE u.email =:n")
	public User findByEmail(@Param("n")String email);
	
	
	public User findByResetPasswordToken(String token);
	
	public User findById(int id);


	public List<User> findAll();

}