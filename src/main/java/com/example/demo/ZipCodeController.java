package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipCodeController {
	@Autowired
	private ZipCodeFactory zipcodeFactory;
	
	@PostMapping("getZipCode")
	ResponseEntity<List<String>> getListOfZipCode(@RequestBody String clientName){
		final List<String> zipcodeList = this.zipcodeFactory.getZipCodeService(clientName).getZipCodeList();
		return new ResponseEntity<>(zipcodeList, HttpStatus.OK);
	}
}
