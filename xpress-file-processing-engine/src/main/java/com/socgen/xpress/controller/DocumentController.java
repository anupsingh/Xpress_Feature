package com.socgen.xpress.controller;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.socgen.xpress.domain.Client;
import com.socgen.xpress.service.ClientService;
import com.socgen.xpress.service.DocumentService;
import com.socgen.xpress.service.ResponseMetadata;

@Controller
@RequestMapping(value = "/doc")
public class DocumentController {

	private static final Logger LOG = Logger.getLogger(DocumentController.class);

	@Autowired
	DocumentService documentService;

	@Autowired
	ClientService clientService;

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public @ResponseBody ResponseMetadata handleFileUpload(@RequestParam(value = "file") MultipartFile file)
			throws IOException {
		clientService.save(file);
		return documentService.save(file);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public HttpEntity<byte[]> getDocument(@PathVariable Long id) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.IMAGE_JPEG);
		return new ResponseEntity<byte[]>(documentService.getDocumentFile(id), httpHeaders, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Client> getClients() {
		List<Client> clients = clientService.findAll();
		return clients;
	}

}
