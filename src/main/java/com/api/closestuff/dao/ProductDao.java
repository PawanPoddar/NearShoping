package com.api.closestuff.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.api.closestuff.model.Product;

public interface ProductDao {
	public List<Product> getAllProduct();
	public String insertProduct(Product product);
	public Optional<Product> getBy(int id);
	public List<Product> getByIdOrName(int id,String name);
	public String deleteProduct(int id);
	public String updateProduct(Product product);
}
