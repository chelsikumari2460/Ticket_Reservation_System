package com.reservation.demo.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository
public interface TrainRepository extends JpaRepository<Train, Integer> {
	@Query(value ="SELECT train_no,train_name,src,dest FROM Train WHERE src= :src and dest= :dest", nativeQuery = true)
	 List<Object[]> searchTrain(@Param("src") String src,@Param("dest") String dest);
	 @Query (value="Select * from train where train_no= :train_no",nativeQuery=true)
	Train findByTrain_no(String train_no);
	
	 //Train findByTrain_no(@Param("train_no") String train_no);

}
