package org.cap.controller;


import java.util.List;

import org.cap.entities.Product;
import org.cap.service.IProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController 
{
	private static Logger Log= LoggerFactory.getLogger(ProductController.class);
	@Autowired
	private IProductService productService;
	
	@GetMapping("/")
	public ModelAndView hello() {
		Log.info("sayHello()");
		return new ModelAndView("hellopage");
	}
	
	@GetMapping("/add")
    public ModelAndView addProduct() {
        return new ModelAndView("addproduct");// only provide view name
    }
	
    @GetMapping("/addprocess")
    public ModelAndView addProduct(@RequestParam("productname") String productName,
    									@RequestParam("productid")int productId,
    									@RequestParam("productprice")int productPrice) {
        Product product=new Product();
        product.setProductId(productId);
        product.setProductName(productName);
        product.setProductPrice(productPrice);
        productService.save(product);
        List<Product>list=productService.fetchAll();
    	return new ModelAndView("productdetails", "lists",list);  
    }
    @GetMapping("/details")
    public ModelAndView viewDetails() {
    	List<Product>list=productService.fetchAll();
    	
    	return new ModelAndView("productdetails", "lists",list);
    }
}
