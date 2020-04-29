package org.cap.dao;

import java.util.List;

import org.cap.entities.Product;

public interface IProductDao 
{
	void save(Product p);
	List<Product> fetchAll();
}
