package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDao;
import com.example.demo.entity.Product;
import com.example.demo.repository.FindQuery;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao productDao;
	@Autowired
	FindQuery q;


	public Product insertProduct(Product product) {
		return productDao.save(product);
	}

@Override
public List<Product> getProductByProductPrice(int ProdPrice) {
		
	return productDao.findByProductPrice(ProdPrice);
}

	@Override
	public List<Product> getAllProduct() {
		return this.productDao.findAll();
	}

	@Override
	public void deleteProduct(long id) {
		Product prdt =  productDao.getById(id);
		productDao.delete(prdt);
		
	}

	
	public List<Product> getRequestById(int id) {
	      return q.findProdById(id);
	}

	@Override
	public Product updateProduct(Product product) {
		return productDao.save(product);
	}
	

	

}
