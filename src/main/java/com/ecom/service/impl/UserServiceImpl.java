package com.ecom.service.impl;

import java.util.List;

import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecom.entity.Category;
import com.ecom.entity.User;
import com.ecom.exception.ResourceNotFoundException;
import com.ecom.payload.CategoryDto;
import com.ecom.payload.UserDto;
import com.ecom.repository.UserRepository;
import com.ecom.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;
	@Autowired
    private ModelMapper modelMapper;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public UserDto createUser(UserDto userDto) {
		// TODO Auto-generated method stub
		User user = this.modelMapper.map(userDto, User.class);
		
		user.setPassword(this.passwordEncoder.encode(userDto.getPassword()));
        User saveduser = this.userRepo.save(user);

//        entity -> dto

        UserDto savedUserDto = this.modelMapper.map(saveduser, UserDto.class);
       
        return savedUserDto;
	}

	@Override
	public List<UserDto> getUser() {
		// TODO Auto-generated method stub
		 List<User> Users = this.userRepo.findAll();
	        List<UserDto> dtos = Users.stream().map(cat -> this.modelMapper.map(cat, UserDto.class)).collect(Collectors.toList());
	        return dtos;
	}

	@Override
	public UserDto update(UserDto c, Integer userid) {
		// TODO Auto-generated method stub
		User user  = this.userRepo.findById(userid).orElseThrow(() -> new ResourceNotFoundException("user", " user id ", userid + ""));
		user.setName(c.getName());
		user.setEmail(c.getEmail());
		user.setPassword(this.passwordEncoder.encode(c.getPassword()));
		user.setImageName(c.getImageName());
		user.setAddress(c.getAddress());
		user.setAbout(c.getAbout());
		user.setDate(c.getDate());
		
		User updateduser = this.userRepo.save(user);
        return this.modelMapper.map(updateduser, UserDto.class);
    }

	@Override
	public void delete(Integer userid) {
		// TODO Auto-generated method stub
		User user  = this.userRepo.findById(userid).orElseThrow(() -> new ResourceNotFoundException("user", " user id ", userid + ""));
		this.userRepo.delete(user);
	}

}
