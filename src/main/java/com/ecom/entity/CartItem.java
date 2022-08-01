package com.ecom.entity;



import javax.persistence.*;

@Entity

public class CartItem {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private Product product;

    private Integer quantity;

    @ManyToOne
    private Cart cart;


    public Double getTotalPrice()
    {
        return (double) (quantity*this.product.getPrice());
    }


	public void setProduct(Product product2) {
		// TODO Auto-generated method stub
		
	}


	public void setQuantity(Object quantity2) {
		// TODO Auto-generated method stub
		
	}


	public void setCart(Cart cart2) {
		// TODO Auto-generated method stub
		
	}


	public Product getProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
