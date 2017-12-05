package com.niit.testProject1BackEnd.dao;
import java.util.List;

import com.niit.testProject1BackEnd.model.Contact;


public interface ContactDAO {
	
	
	public  boolean save(Contact contact);
	
	// update the contact details  - update
	public boolean delete(int id);
	
	
	public List<Contact> list();
	
	
	//get contact details based on contactID
	
	public Contact getContactById(int id);
	
}
