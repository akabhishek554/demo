package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DefaultZipCodeService implements ZipCoeService{

	@Override
	public List<String> getZipCodeList() {
		return this.getDefaultCodeList();
	}

	private List<String> getDefaultCodeList() {
		final List<String> list = new ArrayList<>();
		list.add("Code1");
		return list;
	}
	
	

}
