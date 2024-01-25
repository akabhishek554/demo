package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZipCodeFactory {

	@Autowired
	Client1ZipCodeService client1ZipCodeService;
	@Autowired
	Client2ZipCodeService client2ZipCodeService;
	@Autowired
	DefaultZipCodeService defaultZipCodeService;

	public ZipCoeService getZipCodeService(String clientName) {
		ZipCoeService zipCodeService;
		switch(clientName) {
			case "client1":
				zipCodeService = client1ZipCodeService;
				break;
			case "client2":
				zipCodeService = client2ZipCodeService;
				break;
			default:
				zipCodeService = defaultZipCodeService;
				break;
		}
		return zipCodeService;
	}
	
	

}
