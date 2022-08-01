package com.ecom.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(Object id2) {
		// TODO Auto-generated method stub
		
	}

	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}

}
