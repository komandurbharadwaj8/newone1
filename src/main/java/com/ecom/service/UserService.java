package com.ecom.service;

import java.util.List;

import com.ecom.payload.UserDto;

public interface UserService {

//  create

  UserDto createUser( UserDto userDto);


//  get

  List< UserDto> getUser();


//  update

  UserDto update( UserDto c, Integer userid);


// delete

  void delete(Integer userid);
}
