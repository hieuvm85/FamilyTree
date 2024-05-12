package com.example.mb_be.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mb_be.model.entity.FamilyTree;
import com.example.mb_be.model.entity.User;
import com.example.mb_be.model.request.LoginRequest;
import com.example.mb_be.model.request.UserRequest;
import com.example.mb_be.model.response.MessageResponse;
import com.example.mb_be.model.service.FamilyTreeService;
import com.example.mb_be.model.service.UserService;



@RestController
@RequestMapping("/api/user")
public class UserController {


	@Autowired
	UserService userService;
	@Autowired
	FamilyTreeService familyTreeService;
	
	@PostMapping("/create")
	public ResponseEntity<?> loggin(@RequestBody UserRequest userRequest){
		User user = new User();
		
		user.setFullName(userRequest.getFullName());
	    user.setBirthday(userRequest.getBirthday());
	    user.setPhone(userRequest.getPhone());
	    user.setGender(userRequest.getGender());
	    user.setEmail(userRequest.getEmail());
	    user.setPhotoURL(userRequest.getPhotoURL());
	    user.setAddress(userRequest.getAddress());
	    user.setUsername(userRequest.getUsername());
	    user.setPassword(userRequest.getPassword());
	    user.setFamilyTree( new ArrayList<>());
	    
	    
	    
	    
		return ResponseEntity.ok(userService.saveOrUpdate(user));
	}
    @PostMapping("/login")
    public ResponseEntity<?> loggin(@RequestBody LoginRequest loginRequest){
    	User user = userService.getByUsername(loginRequest.getUsername());
    	if(user != null) {
    		if(user.getPassword().equals(loginRequest.getPassword()))
    			return ResponseEntity.ok(user);
    		else 
    			return ResponseEntity.ok(new MessageResponse("Error: Sai mật khẩu"));
    	}
    	else
    		return ResponseEntity.ok(new MessageResponse("Error: không tìm thấy tên đăng nhập"));
    }
    @GetMapping("/get")
    public ResponseEntity<?> getUser(@RequestParam("id") int id){
    	return ResponseEntity.ok(userService.getUserById(id));
    }
    
    
    @PostMapping("/share")
    public ResponseEntity<?> share( @RequestParam("id") int id,  @RequestParam("usernameFriend") String username){
    	//user 1 share cho user 2
    	User user1= userService.getUserById(id);
    	User user2= userService.getByUsername(username); 
    	if(user2==null)
    		return ResponseEntity.ok(new MessageResponse("Success"));
    	
    	List<FamilyTree> familyTrees1= user1.getFamilyTree();
    	List<FamilyTree> familyTrees2= user2.getFamilyTree();
    	for(FamilyTree familyTree :familyTrees1) {
    		if(!familyTrees2.contains(familyTree)) {
    			familyTrees2.add(familyTree);
    		}
    	}
    	user2.setFamilyTree(familyTrees2);
    	userService.saveOrUpdate(user2);
    	
    	return ResponseEntity.ok(new MessageResponse("Success"));
    }
    
}
