package com.airbusiness.airbusiness_mvc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airbusiness.airbusiness_mvc.entites.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

	// Récupère les clients dont le solde impayé est supérieur à la valeur fournie.
	@Query("SELECT c FROM Client c WHERE c.outstandingBalance > ?1")
	List<Client> findByOutsandingBalanceGreaterThan(double value);

}
