package com.ecom.payload;

import com.ecom.entity.Category;
//import lombok.Data;

//@Data
public class ProductDto {


    private Integer id;

    private String name;

    private String description;

    private Double price;

    private Boolean isLive = false;

    private Boolean inStock = true;

    private Integer rating;

    private String imageName;

    private CategoryDto category;

    private String brandName = "learn Code With Durgesh";

	public Integer getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getRating() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getImageName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getIsLive() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getInStock() {
		// TODO Auto-generated method stub
		return null;
	}

}
