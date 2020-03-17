package com.ecommerce.microcommerce.Dao;

import com.ecommerce.microcommerce.model.Product;

import java.util.ArrayList;
import java.util.List;
public class ProductDaoImpl implements ProductDao {

	public static List<Product>products=new ArrayList<>();
    static {
        products.add(new Product(1, new String("Ordinateur portable"), 350));
        products.add(new Product(2, new String("Aspirateur Robot"), 500)); 
        products.add(new Product(3, new String("Table de Ping Pong"), 750));
    }

    @Override
    public List<Product>findAll() {
        return products;
    }
    

	@Override
	public List<Product> ProductfindById(int id) {
		 for (Product product : products) {  
	            if(product.getId() ==id){
	                return products;
	            }
	        }
	        return null;
		
	}

	@Override
	public Product Productsave(Product product) {
		 products.add(product);
	        return product;
		
	}
}