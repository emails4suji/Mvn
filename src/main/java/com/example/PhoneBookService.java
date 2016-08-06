package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PhoneBookService {

	@Autowired
	private ContactsRepository contactsRep;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public List<Contacts> getAll()
	{
		return contactsRep.findAll();
	}
}
