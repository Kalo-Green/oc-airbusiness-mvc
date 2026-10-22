package com.airbusiness.airbusiness_mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airbusiness.airbusiness_mvc.entites.MaintenanceIssue;

@Repository
public interface MaintenanceRepository extends CrudRepository<MaintenanceIssue, Long> {

	List<MaintenanceIssue> findByFixed(String fixed);

}
