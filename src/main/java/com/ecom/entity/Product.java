package com.ecom.entity;


import javax.persistence.*;

@Entity

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    private Double price;

    private Boolean isLive = false;

    private Boolean inStock = true;

    private Integer rating;

    private String imageName;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

	public Integer getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCategory(Category category2) {
		// TODO Auto-generated method stub
		
	}

	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}

	public void setDescription(Object description2) {
		// TODO Auto-generated method stub
		
	}

	public void setPrice(Integer price2) {
		// TODO Auto-generated method stub
		
	}

	public void setRating(Object rating2) {
		// TODO Auto-generated method stub
		
	}

	public void setImageName(Object imageName2) {
		// TODO Auto-generated method stub
		
	}

	public void setIsLive(Object isLive2) {
		// TODO Auto-generated method stub
		
	}

	public void setInStock(Object inStock2) {
		// TODO Auto-generated method stub
		
	}


}
