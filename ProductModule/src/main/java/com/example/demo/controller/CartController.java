package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Cart;
import com.example.demo.entity.Product;
import com.example.demo.service.CartService;

public class CartController {

	
	@Autowired
	CartService cartService;
	
	

	@PostMapping("/Addtocart")
	public Cart AddItem( @RequestBody Cart cart)
	{
		return cartService.AddItem(cart);
	  }
	
	@DeleteMapping("Itemdelete/{id}")
	public String  deleteItemFromCart(@PathVariable int id) {
		cartService.deleteItemFromCart(id);
		return " Remove from cart sucessfully!!!";
		
	 }
	
	@GetMapping("/allitemprodcut")
	public List<Cart> getAllItem( Cart cart){
	return cartService.getAllItem();	
     
	  }
	
}
