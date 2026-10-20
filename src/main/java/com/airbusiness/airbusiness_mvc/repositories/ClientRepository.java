package com.airbusiness.airbusiness_mvc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airbusiness.airbusiness_mvc.entites.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

}
