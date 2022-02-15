package com.api.closestuff.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.api.closestuff.dao.ProductDao;
import com.api.closestuff.model.Product;
import com.api.closestuff.repository.ProductRepository;

@RestController
public class Product_Controller {

	@Autowired
	public ProductDao productDao;
	
	@Query(value="?")
	@GetMapping(value="/all{id}")
	public List<Product> getAll(){
		
	
		
//		System.out.println(id);
		return productDao.getAllProduct();
//		return productRepository.findAll();
		
	}
	
//	String name=
	
	
	@PostMapping(value="/add")
	public String insert(@RequestBody Product product) {
		return productDao.insertProduct(product);		
	}
	
	
	@GetMapping("/find/{id}")
	public Optional<Product> findOne(@PathVariable int id){
		System.out.println(id);
		return productDao.getBy(id);
		
	}
	@GetMapping("/find/")
	public List<Product> findByIdOrName(@RequestParam int id, @RequestParam String name){
//		System.out.println(id);
		return productDao.getByIdOrName(id,name);
		
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return productDao.deleteProduct(id);
		
	}
	@PutMapping("/update")
	public String update(@RequestBody Product product) {
		return productDao.updateProduct(product);
	}
	
}
