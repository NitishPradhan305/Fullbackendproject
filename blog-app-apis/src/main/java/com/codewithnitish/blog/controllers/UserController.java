package com.codewithnitish.blog.controllers;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithnitish.blog.payloads.ApiResponse;
import com.codewithnitish.blog.payloads.UserDto;
import com.codewithnitish.blog.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
    //POST - Create User
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@Valid  @RequestBody UserDto userDto){
		UserDto createUserDto = this.userService.createUser(userDto);
		return new ResponseEntity<>(createUserDto,HttpStatus.CREATED);
	}
	
 //PUT  - Update User
	
	@PutMapping("/{userId}")                // Path Uri Variable {userID}
 	public ResponseEntity<UserDto> updateUser(@Valid  @RequestBody UserDto userDto , @PathVariable("userId") Integer uid){
		
		UserDto updatedUser = this.userService.updateUser(userDto, uid);
		return ResponseEntity.ok(updatedUser);
	}
	
	
 //DELETE - delete User
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable Integer userId){
		this.userService.deleteUser(userId);
//		return new ResponseEntity(Map.of("message","User deleted Successfully"),HttpStatus.OK);
		return new ResponseEntity<ApiResponse>(new ApiResponse("User got deleted successfully",true),HttpStatus.OK);
	}
	
 //GET - user get
	@GetMapping("/")
    public ResponseEntity<List<UserDto>> getAllUsers(){
    	List<UserDto> allUsers = this.userService.getAllUsers();
		return ResponseEntity.ok(allUsers);
    }
	
	
	
	@GetMapping("/{userId}")
    public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer userId){
    	UserDto userById = this.userService.getUserById(userId);
		return ResponseEntity.ok(userById);
    }
}
