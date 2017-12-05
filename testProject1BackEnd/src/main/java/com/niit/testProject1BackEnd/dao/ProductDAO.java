package com.niit.testProject1BackEnd.dao;
import java.util.List;

import com.niit.testProject1BackEnd.model.Product;


public interface ProductDAO {

	public boolean saveOrUpdate(Product product);


	// delete category
	public boolean delete(String id);

	public List<Product> list();

	public Product getProductById(String id);
	
	//get all products pertaining to particular category
	public List<Product> getAllProductsByCategoryId(String categoryId);
	public List<Product> getAllProductsBySupplierId(String supplierId);
	
	public Product getProductByName(String name);
	
	
}
