package com.reservation.demo.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface TicketRepository extends JpaRepository<Ticket,Integer> {
	@Query(value ="SELECT * FROM Ticket JOIN Train WHERE train_nofk=train_no", nativeQuery = true)
	  List<Object[]> methodThatQueriesMultipleTables();
	  
	  @Query(value ="SELECT * FROM ticket WHERE user_idfk=:user_id",nativeQuery=true)
	  public List<Ticket> allticketUserId(Long user_id);
}
