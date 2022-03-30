package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;

@Repository
public class FindQuery {
	
	
	
		@PersistenceContext
		EntityManager em;
		
		public List<Product> findProdById(long id)
		{
			System.out.println("inside custom bid repo"+id);
			return (List<Product>)
					em
					.createQuery("select p from Product p where p.prid = :m")
					.setParameter("m", id)
					.getResultList();
		}

	}


