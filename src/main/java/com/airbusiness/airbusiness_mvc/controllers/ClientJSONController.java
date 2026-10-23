package com.airbusiness.airbusiness_mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airbusiness.airbusiness_mvc.entites.Client;
import com.airbusiness.airbusiness_mvc.repositories.ClientRepository;

@RestController
@RequestMapping(path = "/v1/clients")
public class ClientJSONController {

	private final ClientRepository clientRepository;

	@Autowired
	public ClientJSONController(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	// GET /v1/clients
	@GetMapping(produces = "application/json")
	public Iterable<Client> clientsForm(Model model) {
		return clientRepository.findAll();
	}
}