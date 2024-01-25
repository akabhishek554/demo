package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Client2ZipCodeService extends DefaultZipCodeService{

	@Override
	public List<String> getZipCodeList() {
		final List<String> list = new ArrayList<>();
		list.add("Client2Code1");
		return list;
	}
	
	

}