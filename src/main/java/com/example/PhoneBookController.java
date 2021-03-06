package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneBookController {

	@Autowired
	private PhoneBookService pbs;

	@RequestMapping("/")
	public List<Contacts> getAll()
	{
		return pbs.getAll();
	}
}
