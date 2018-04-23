package com.socgen.xpress.service;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.opencsv.CSVReader;
import com.socgen.xpress.dao.ClientDao;
import com.socgen.xpress.domain.Client;
import com.socgen.xpress.dto.ClientDto;
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

		List<Client> clients = new ArrayList<>();
		/*
		 * TODO- need to use the CsvToBeanBuilder with @CsvBindByName.
		 * CsvToBean<ClientDto> csvToBean = new
		 * CsvToBeanBuilder<ClientDto>(br).withType(ClientDto.class)
		 * .withIgnoreLeadingWhiteSpace(true).build(); Iterator<ClientDto>
		 * csvUserIterator = csvToBean.iterator();
		 */
		try (CSVReader csvReader = new CSVReader(new InputStreamReader(file.getInputStream()))) {
			List<String[]> records = csvReader.readAll();
			for (int i = 1; i < records.size(); i++) {
				String[] record = records.get(i);
				ClientDto dto = transformer.tranform(record);
				clients.add(new DozerBeanMapper().map(dto, Client.class));
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {

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
