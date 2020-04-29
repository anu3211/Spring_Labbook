package org.cap.service;

import java.util.List;

import org.cap.dao.IProductDao;
import org.cap.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImp implements IProductService {
	
	private IProductDao productDao;
	

	public IProductDao getProductDao() {
		return productDao;
	}

	@Autowired
	public void setProductDao(IProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public void save(Product p) {
		productDao.save(p);

	}

	@Override
	public List<Product> fetchAll() {
		
		return productDao.fetchAll();
	}

}
