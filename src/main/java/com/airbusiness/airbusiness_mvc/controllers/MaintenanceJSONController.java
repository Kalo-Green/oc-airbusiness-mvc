package com.airbusiness.airbusiness_mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airbusiness.airbusiness_mvc.entites.MaintenanceIssue;
import com.airbusiness.airbusiness_mvc.repositories.MaintenanceRepository;

@RestController
@RequestMapping(path = "/v1/maintenance")
public class MaintenanceJSONController {

	private final MaintenanceRepository maintenanceRepository;

	@Autowired
	public MaintenanceJSONController(MaintenanceRepository maintenanceRepository) {
		this.maintenanceRepository = maintenanceRepository;
	}

	// GET /v1/maintenance/unfixed
	@GetMapping(path = "/unfixed", produces = "application/json")
	public Iterable<MaintenanceIssue> maintenanceForm(Model model) {
		return maintenanceRepository.findByFixed("");
	}

}
