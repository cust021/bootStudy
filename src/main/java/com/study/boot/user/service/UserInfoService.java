package com.study.boot.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.boot.user.mapper.UserMapper;
import com.study.boot.user.vo.UserInfoVO;

@Service
public class UserInfoService {

	@Autowired
	private UserMapper userMapper;
	
	public List<UserInfoVO> selectUsers(UserInfoVO user){
		return userMapper.selectUsers(user);
	}
	
	public UserInfoVO selectUserView(int uiNum) {
		return userMapper.selectUserView(uiNum);
	}
	
	public List<UserInfoVO> userLogin(String uiId, String uiPwd){
				
		if(uiId == null && uiPwd == null) {
			return null;
		}
		return userMapper.userLogin(uiId,uiPwd);
	}
	
	public int insertUser(UserInfoVO user) {
		return userMapper.insertUser(user);
	}
	
	public int updateUser(UserInfoVO user) {
		return userMapper.updateUser(user);
	}
	
	public int deleteUser(int uiNum) {
		return userMapper.deleteUser(uiNum);
	}
}
