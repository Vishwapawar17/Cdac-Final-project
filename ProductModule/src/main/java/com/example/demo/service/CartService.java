package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Cart;
import com.example.demo.entity.Product;

public interface CartService {

	//add to cart
	public Cart AddItem(Cart cart);
	
	//remove from cart
	public void deleteItemFromCart(int id);
	
	//product in cart
	public List<Cart> getAllItem();
}
