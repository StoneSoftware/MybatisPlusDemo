package com.yibao.mpdemo.app.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yibao.mpdemo.app.dao.UserDao;
import com.yibao.mpdemo.app.mapper.UserMapper;
import com.yibao.mpdemo.app.vo.UserPO;

@Repository
public class UserDaoImpl extends ServiceImpl<UserMapper, UserPO> implements
		UserDao {
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<Map<String, Object>> selectMapsTest() {
		QueryWrapper<UserPO> wrapper = new QueryWrapper<>();
		wrapper.select(new String[] { "id", "name" }).eq("id", "1");
		return this.getBaseMapper().selectMaps(wrapper);
	}

	@Override
	public List<UserPO> getAll() {
		return this.getBaseMapper().selectList(null);
	}

	@Override
	public List<UserPO> getById(Integer id) {
		QueryWrapper<UserPO> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("id", id);
		return userMapper.selectList(queryWrapper);
	}

}
