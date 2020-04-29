package org.cap.controller;

import java.util.List;
import org.cap.dto.ProductDto;
import org.cap.entities.Product;
import org.cap.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductRestController {

	@Autowired
	private IProductService productService;
	
	@GetMapping
	public ResponseEntity<List<Product>>fetchAll(){
	   List<Product> products=productService.fetchAll();
	   ResponseEntity<List<Product>>response=new ResponseEntity<>(products,HttpStatus.OK);
	   return response;
	}
	
	@PostMapping("/add")
	public ResponseEntity<Product> addProduct(@RequestBody ProductDto productDto){
		Product product = convertdto(productDto);
		productService.save(product);
		ResponseEntity<Product> response = new ResponseEntity<Product>(product,HttpStatus.OK);
		return response;
	}
	
	public Product convertdto(ProductDto dto) {
		Product product = new Product();
		product.setProductId(dto.getProductId());
		product.setProductName(dto.getProductName());
		product.setProductPrice(dto.getProductPrice());
		return product;
	}
}
