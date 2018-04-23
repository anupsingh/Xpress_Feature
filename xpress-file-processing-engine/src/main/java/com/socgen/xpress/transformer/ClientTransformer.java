package com.socgen.xpress.transformer;

import org.springframework.stereotype.Component;

import com.socgen.xpress.dto.ClientDto;

@Component
public class ClientTransformer {

	public ClientDto tranform(String[] arr) {
		ClientDto client = new ClientDto();
		client.setTiagramName(arr[0]);
		client.setConfigName(arr[1]);
		client.setClientName(arr[2]);
		client.setEcid(arr[3]);
		client.setBillingCurrency(arr[4]);
		client.setCostCenter(arr[5]);
		client.setAccountNumber(arr[6]);
		client.setSalesDesk(arr[7]);
		client.setExecutiveName(arr[8]);
		client.setBillingRegion(arr[9]);
		// TODO- remove all these mapping after using @CsvBindByName-Also no need to
		// check array size it will automatic map by header name
		if (arr.length > 10) {
			client.setEmailId(arr[10]);
		}
		if (arr.length > 11) {
			client.setBookingEntity(arr[11]);
		}
		if (arr.length > 12) {
			client.setAccountType(arr[12]);
		}
		if (arr.length > 13) {
			client.setOriginalEntity(arr[13]);
		}
		return client;
	}

}
