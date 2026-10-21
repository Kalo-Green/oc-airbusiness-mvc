package com.airbusiness.airbusiness_mvc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airbusiness.airbusiness_mvc.entites.Pilot;

@Repository
public interface PilotRepository extends CrudRepository<Pilot, Long> {

}
