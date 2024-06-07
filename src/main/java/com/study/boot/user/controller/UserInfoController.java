package com.study.boot.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.boot.user.service.UserInfoService;
import com.study.boot.user.vo.UserInfoVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserInfoController {

	@Autowired
	private UserInfoService userService;
	
	@GetMapping("/selectUsers")
	public List<UserInfoVO> selectUser(UserInfoVO user){
		log.info("user=>{}",user);
		return userService.selectUsers(user);
	}
	
	@GetMapping("/userView/{uiNum}")
	public UserInfoVO selectUserView(@PathVariable("uiNum") int uiNum) {
		return userService.selectUserView(uiNum);
	}
	
	@GetMapping("/login/{uiId}/{uiPwd}")
	public List<UserInfoVO> userLogin(@PathVariable("uiId") String uiId, @PathVariable("uiPwd") String uiPwd){
		return userService.userLogin(uiId, uiPwd);
	}
	
	
	@PostMapping("/insertUser")
	public int insertUser(@RequestBody UserInfoVO user) {
		return userService.insertUser(user);
	}
	
	@PatchMapping("/updateUser")
	public int updateUser(@RequestBody UserInfoVO user) {
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/deleteUser/{uiNum}")
	public int deleteUser(@PathVariable("uiNum") int uiNum) {
		return userService.deleteUser(uiNum);
	}
}
