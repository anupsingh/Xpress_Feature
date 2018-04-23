package com.socgen.xpress.transformer;

import org.springframework.stereotype.Component;

import com.socgen.xpress.domain.Client;

@Component
public class ClientTransformer {

	public Client tranform(String[] arr) {
		Client client = new Client();
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
		client.setEmailId(arr[10]);
		client.setBookingEntity(arr[11]);
		client.setAccountType(arr[12]);
		client.setOriginalEntity(arr[13]);
		return client;
	}
}
