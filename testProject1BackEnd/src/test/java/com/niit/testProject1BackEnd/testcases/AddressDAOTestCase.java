package com.niit.testProject1BackEnd.testcases;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.testProject1BackEnd.dao.AddressDAO;
import com.niit.testProject1BackEnd.model.Address;


public class AddressDAOTestCase {

	/*@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static AddressDAO addressDAO;

	@Autowired
	static Address address;

	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();

		addressDAO = (AddressDAO) context.getBean("addressDAO");

		address = (Address) context.getBean("address");

	}

	@Test
	public void createAddressTestCase() {
		address.setId("rahul");
		address.setUser_id("rahul");
		address.setH_no("2-46-11");
		address.setStreet("Villa Vari Street, Venkat Nagar");
		address.setCity("Hyderabad");
		address.setCountry("India");
		address.setPin("500003");

		boolean flag = addressDAO.save(address);

		assertEquals("createAddressTestCase", true, flag);

	}

	@Test
	public void updateAddressTestCase() {
		address.setId("SwethaAddress");
		address.setUser_id("rahul");
		address.setH_no("2-46-11");
		address.setStreet("Villa Vari Street, Venkat Nagar");
		address.setCity("Hyderabad");
		address.setCountry("India");
		address.setPin("500003");

		boolean flag = addressDAO.update(address);

		assertEquals("createAddressTestCase", true, flag);

	}

	@Test
	public void listAllAddressTestCase() {
		int actualSize = addressDAO.list().size();
		assertEquals(2, actualSize);
	}
*/
}
