package com.socgen.xpress.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.socgen.xpress.dao.ClientDao;
import com.socgen.xpress.domain.Client;
import com.socgen.xpress.transformer.ClientTransformer;

@Service
public class ClientServiceImpl implements ClientService {

	private static final String SEPRATOR = ",";

	@Autowired
	private ClientDao clientDao;

	@Autowired
	private ClientTransformer transformer;

	@Override
	public ResponseMetadata save(MultipartFile file) {

		BufferedReader br;
		List<Client> clients = new ArrayList<>();
		try {

			String line;
			InputStream is = file.getInputStream();
			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				Client client = transformer.tranform(line.split(SEPRATOR));
				clients.add(client);
			}

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		clientDao.save(clients);
		ResponseMetadata metadata = new ResponseMetadata();
		metadata.setMessage("success");
		metadata.setStatus(200);
		return metadata;
	}

	@Override
	public Client getSingleClient(Long id) {
		return clientDao.findOne(id);
	}

	@Override
	public List<Client> findAll() {
		return (List<Client>) clientDao.findAll();
	}

}
