package org.cap.service;

import java.util.List;

import org.cap.entities.Product;

public interface IProductService {
	void save(Product p);
	List<Product> fetchAll();


}
