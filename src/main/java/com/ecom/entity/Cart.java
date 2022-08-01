package com.ecom.entity;



import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity

public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //users

    @OneToOne
    private User user;

    //products

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<CartItem> items = new HashSet<>();

	public void setUser(User user2) {
		// TODO Auto-generated method stub
		
	}

	public Set<CartItem> getItems() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setItems(Set<CartItem> newCartItems) {
		// TODO Auto-generated method stub
		
	}

	public char[] getUser() {
		// TODO Auto-generated method stub
		return null;
	}


}
