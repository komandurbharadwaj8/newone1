package com.ecom.entity;

import jdk.jfr.Enabled;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity

public class Category {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @Column(name = "description")
    private String desc;

    private String bannerName;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Product> products = new HashSet<>();

	public void setDesc(Object desc2) {
		// TODO Auto-generated method stub
		
	}

	public void setTitle(Object title2) {
		// TODO Auto-generated method stub
		
	}

	public void setBannerName(Object bannerName2) {
		// TODO Auto-generated method stub
		
	}

}
