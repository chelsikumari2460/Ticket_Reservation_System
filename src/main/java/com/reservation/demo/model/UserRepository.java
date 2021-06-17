package com.reservation.demo.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	@Query(value ="SELECT * FROM User WHERE first_name='Chelsi'",nativeQuery=true)
	public List<User> findByName();
	
	@Query(value ="SELECT * FROM User WHERE userid=:userid",nativeQuery=true)

	public User findByUserId(@Param("userid") Long userid);
	
	
}
