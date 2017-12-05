package com.niit.testProject1BackEnd.dao;

import java.util.List;

import com.niit.testProject1BackEnd.model.OrderTable;

public interface OrderTableDAO {
	
	public boolean save(OrderTable orderTable);
	public List<OrderTable> list(String userId);

}
