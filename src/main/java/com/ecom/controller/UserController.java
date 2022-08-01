package com.ecom.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.payload.ApiResponse;
import com.ecom.payload.CategoryDto;
import com.ecom.payload.UserDto;
import com.ecom.service.UserService;


@RestController
@RequestMapping("/api/v1/users")
public class UserController {

	@Autowired
	UserService userservice;
	@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/")
    public ResponseEntity<UserDto> createUser(
            @Valid @RequestBody UserDto userDto
    ) {
		UserDto user1 = this.userservice.createUser(userDto);
        return new ResponseEntity<UserDto>(user1, HttpStatus.CREATED);
    }
	
	 @PreAuthorize("hasRole('NORMAL')")
	    @GetMapping("/")
	    public ResponseEntity<List<UserDto>> getusers(

	    ) {
	        List<UserDto> Users =
	                this.userservice.getUser();
	        return new ResponseEntity<List<UserDto>>(Users, HttpStatus.OK);
	    }

	 @PutMapping("/{userid}")
	    public ResponseEntity<UserDto> update(
	            @RequestBody UserDto userDto,
	            @PathVariable Integer userid
	    ) {
		 UserDto update = this.userservice.update(userDto, userid);
	        return new ResponseEntity<>(update, HttpStatus.OK);
	    }
	 
	 @DeleteMapping("/{userid}")
	    public ApiResponse delete(@PathVariable Integer userid)
	    {
	    	this.userservice.delete(userid);
	    	return new ApiResponse("user successfully deleted",true, HttpStatus.OK);
	    }
}
