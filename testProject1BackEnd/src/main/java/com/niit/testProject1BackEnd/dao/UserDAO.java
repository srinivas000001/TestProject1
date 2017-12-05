package com.niit.testProject1BackEnd.dao;

import java.util.List;

import com.niit.testProject1BackEnd.model.User;


public interface UserDAO {
	
	
	// create/register  - save
	
	public  boolean save(User user);
	
	// update the user details  - update
	public boolean update(User user);
	
	// delete the user details  - delete
	public boolean delete(String id);
	
	
	public boolean validate(String id, String password);
	
	// get all users   - list
	public List<User> list();
	
	
	//get user details based on userID
	public User get(String id);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
