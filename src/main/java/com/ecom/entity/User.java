package com.ecom.entity;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.*;
import java.util.stream.Collectors;

@Entity
@Table(name = "ecom_users")


public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name", length = 100, nullable = false)
    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    private String imageName;

    private String address;

    private String about;

    private Date date;

    @OneToOne(mappedBy = "user",fetch = FetchType.LAZY)
    private Cart cart;


    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",

            joinColumns = @JoinColumn(name = "user", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role", referencedColumnName = "id")

    )
    private Set<Role> roles = new HashSet<>();


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> grantedAuthorities = this.roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
        return grantedAuthorities;
    }

    @Override
    public String getUsername() {
        return this.getEmail();
    }

    private String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public Cart getCart() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}

	public void setEmail(Object email2) {
		// TODO Auto-generated method stub
		
	}

	public void setPassword(String encode) {
		// TODO Auto-generated method stub
		
	}

	public void setImageName(Object imageName2) {
		// TODO Auto-generated method stub
		
	}

	public void setAddress(Object address2) {
		// TODO Auto-generated method stub
		
	}

	public void setAbout(Object about2) {
		// TODO Auto-generated method stub
		
	}

	public void setDate(Object date2) {
		// TODO Auto-generated method stub
		
	}
}
