package com.ecommerce.microcommerce.model;

import java.util.List;

public class Product {

	private int id;
    private String nom;
    private int prix;
	public Product(int id, String nom, int prix) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

    
    
}
