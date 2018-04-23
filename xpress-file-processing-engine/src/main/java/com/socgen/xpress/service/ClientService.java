package com.socgen.xpress.service;

import org.springframework.web.multipart.MultipartFile;

import com.socgen.xpress.domain.Client;

import java.io.IOException;
import java.util.List;

public interface ClientService {

	ResponseMetadata save(MultipartFile multipartFile) throws IOException;

	Client getSingleClient(Long id);

	List<Client> findAll();
}
