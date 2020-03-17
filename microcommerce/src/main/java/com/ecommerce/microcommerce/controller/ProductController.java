package com.ecommerce.microcommerce.controller;
import com.ecommerce.microcommerce.Dao.ProductDao;
import com.ecommerce.microcommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class ProductController {
	 @Autowired
	    private Product productDao;

    //Récupérer la liste des produits
    @RequestMapping(value="/Produits", method=RequestMethod.GET)
    public List<Product> listeProduits() {
    	return productDao.findAll();
    }

    
}