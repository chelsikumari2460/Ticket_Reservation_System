package com.reservation.demo.model;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
@Transactional
public interface TicketRepository extends JpaRepository<Ticket,Integer> {
	@Query(value ="SELECT * FROM Ticket JOIN Train WHERE train_nofk=train_no", nativeQuery = true)
	  List<Object[]> methodThatQueriesMultipleTables();
	  
	  @Query(value ="SELECT * FROM ticket WHERE user_idfk=:user_id",nativeQuery=true)
	  public List<Ticket> allticketUserId(Long user_id);
	  
	  @Query(value ="SELECT * FROM ticket WHERE train_nofk=:train_no",nativeQuery=true)
	  public List<Ticket> allticketTrain_no(String train_no);
	  
	  @Query(value ="SELECT * FROM ticket WHERE train_nofk=:train_no and user_idfk=:user_id ",nativeQuery=true)
	  public List<Ticket> allticket(Long user_id,String train_no);
	  
	  @Modifying
	  @Query(value ="Delete FROM ticket WHERE id=:id and user_idfk=:user_id",nativeQuery=true)
	  public int cancelticket(Long user_id,int id);
}
