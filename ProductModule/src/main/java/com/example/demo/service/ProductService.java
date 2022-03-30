package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Product;

//@Component
public interface ProductService {
	
	
	
	
   public List<Product> getProductByProductPrice(int ProdPrice);
	
	public Product insertProduct(Product product);
	public List<Product> getAllProduct();
	public void deleteProduct(long id);
	public List<Product>  getRequestById(int reqid);
    public Product updateProduct(Product product); 
    
    
    
	//public Product updateProductById(Product product,long id);
	

}
