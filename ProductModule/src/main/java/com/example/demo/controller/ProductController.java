package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@CrossOrigin
@RestController
public class ProductController {
	
	@Autowired
	ProductService productservice;
	
	@PostMapping("/ProdtRegister")
	public Product insertProduct( @RequestBody Product product) {
		return productservice.insertProduct(product);
	  }
	
//	@PostMapping("/ProductByPrice")
//	  public List<Product> getProductByProductPrice(@RequestBody Product product) {
//		    return productservice.getProductByProductPrice(product.getProdPrice());
//	  }

	@GetMapping("/allprodcut")
	public List<Product> getAllProduct( Product product){
	return productservice.getAllProduct();	
     
	  }
	
	@DeleteMapping("delete/{id}")
	public String  deleteProduct(@PathVariable long id) {
		
		productservice.deleteProduct(id);
		return "Product Deleted sucessfully!!!";
		
	 }
	
	@GetMapping("/get/{id}")
	public List<Product>  getRequestById(@PathVariable int id){
		return productservice.getRequestById(id);
	}
	
	@PutMapping("/updateproduct")
	public Product updateProduct(Product product) {
		return productservice.updateProduct(product);
	}
	
//	@PutMapping("/updateproduct/{id}")
//	
//		public Product updateProductById(@RequestBody Product product,@PathVariable("id") long id) 
//	{
//		this.productservice.updateProductById(product,id);
//		
//	}
	
	}
