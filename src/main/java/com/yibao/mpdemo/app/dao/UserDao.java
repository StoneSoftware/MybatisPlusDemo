package com.yibao.mpdemo.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yibao.mpdemo.app.mapper.UserMapper;
import com.yibao.mpdemo.app.vo.UserPO;

@Repository
public class UserDao {
	@Autowired
	private UserMapper userMapper;

	public List<UserPO> getAll() {
		return userMapper.selectList(null);
	}

	public List<UserPO> getById(Integer id) {
		QueryWrapper<UserPO> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("id", id);
		return userMapper.selectList(queryWrapper);
	}

}
