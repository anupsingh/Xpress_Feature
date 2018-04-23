package com.socgen.xpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.socgen.xpress.domain.Client;
import com.socgen.xpress.service.ClientService;

@Controller
@RequestMapping(value = "/client")
public class ClientController {
	
	@Autowired
	ClientService clientService;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Client> getClients() {
		return clientService.findAll();
	}

}
