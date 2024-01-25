package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Client1ZipCodeService  extends DefaultZipCodeService{

	@Override
	public List<String> getZipCodeList() {
		final List<String> list = new ArrayList<>();
		list.add("Client1Code1");
		return list;
	}
	
}
