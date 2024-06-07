package com.study.boot.user.mapper;

import java.util.List;

import com.study.boot.user.vo.UserInfoVO;

public interface UserMapper {

	public List<UserInfoVO> selectUsers(UserInfoVO user);
	
	public UserInfoVO selectUserView(int uiNum);
	
	public List<UserInfoVO> userLogin(String uiId, String uiPwd);
	
	public int insertUser(UserInfoVO user);
	
	public int updateUser(UserInfoVO user);
	
	public int deleteUser(int uiNum);
	
	
}
