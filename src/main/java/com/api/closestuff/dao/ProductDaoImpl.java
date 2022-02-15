package com.api.closestuff.dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.closestuff.model.Product;
import com.api.closestuff.repository.ProductRepository;
import com.mongodb.client.model.Filters;

@Service
public class ProductDaoImpl implements ProductDao {

 @Autowired
 private ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}
	
	@Override
	public String insertProduct(Product product) {
		Product insertProduct=productRepository.insert(product);
		return "Product Successfully Insesrt"+insertProduct.getName();
	}

	@Override
		public Optional<Product> getBy(int id) {
			// TODO Auto-generated method stub
		return productRepository.findById(id);
			 
		}
		@Override
		public List<Product> getByIdOrName(int id,String name) {
			// TODO Auto-generated method stub
		return productRepository.findByIdOrName(id, name);
			 
		}
	@Override
		public String deleteProduct(int id) {
			// TODO Auto-generated method stub
			
		productRepository.deleteById(id);
			return "Product Deleted"+ id;
		}
	@Override
		public String updateProduct(Product product) {
			// TODO Auto-generated method stub
		productRepository.save(product);
			return "Product Updated "+product.getId();
		}
	
}