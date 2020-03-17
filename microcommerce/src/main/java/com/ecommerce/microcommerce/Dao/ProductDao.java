package com.ecommerce.microcommerce.Dao;
import com.ecommerce.microcommerce.model.Product;
import java.util.List;
public interface ProductDao {

	    public List<Product>findAll();
	    public List<Product> ProductfindById(int id);
	    public Product Productsave(Product product);
	}

