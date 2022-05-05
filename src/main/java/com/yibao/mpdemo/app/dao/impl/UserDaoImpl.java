package com.yibao.mpdemo.app.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yibao.mpdemo.app.dao.UserDao;
import com.yibao.mpdemo.app.mapper.UserMapper;
import com.yibao.mpdemo.app.vo.UserPO;

@Repository
public class UserDaoImpl extends ServiceImpl<UserMapper, UserPO> implements
		UserDao {
	@Autowired
	private UserMapper userMapper;

	/*********************************************************/
	/************************* BaseMapper 查询方法 ***************/
	/*********************************************************/

	@Override
	public List<UserPO> getAll() {
		return this.getBaseMapper().selectList(null);
	}

	@Override
	public UserPO selectByIdTest(Serializable id) {
		return this.getBaseMapper().selectById(id);
	}

	@Override
	public List<UserPO> selectByIdTest(Collection<String> idList) {
		return this.getBaseMapper().selectBatchIds(idList);
	}

	@Override
	public List<UserPO> selectByMapTest(Map<String, Object> columnMap) {
		// columnMap.put("name", "zhangsan");
		// columnMap.put("列名", "列值");
		return this.getBaseMapper().selectByMap(columnMap);
	}

	@Override
	public UserPO selectOneTest() {
		QueryWrapper<UserPO> wrapper = new QueryWrapper<>();
		List<String> nameList = new ArrayList<>();
		nameList.add("zhangsan");
		nameList.add("lisi");
		nameList.add("wangwu");
		wrapper.in("name", nameList).like("email", "@").eq("id", "2");
		return this.getBaseMapper().selectOne(wrapper);
	}

	@Override
	public List<UserPO> selectListTest() {
		QueryWrapper<UserPO> wrapper = new QueryWrapper<>();
		List<String> nameList = new ArrayList<>();
		nameList.add("zhangsan");
		nameList.add("lisi");
		nameList.add("wangwu");
		wrapper.in("name", nameList).like("email", "@").eq("id", "2");
		return this.getBaseMapper().selectList(wrapper);
	}

	@Override
	public List<Map<String, Object>> selectMapsTest() {
		QueryWrapper<UserPO> wrapper = new QueryWrapper<>();
		wrapper.select("id", "name").eq("id", "1");
		return this.getBaseMapper().selectMaps(wrapper);
	}

	@Override
	public IPage<Map<String, Object>> selectMapsPageTest() {
		Page<Map<String, Object>> page = new Page<>(1, 20);
		QueryWrapper<UserPO> wrapper = new QueryWrapper<>();
		wrapper.select("id", "name").eq("id", "1");
		return this.getBaseMapper().selectMapsPage(page, wrapper);
	}

	@Override
	public List<Object> selectObjsTest() {
		QueryWrapper<UserPO> wrapper = new QueryWrapper<>();
		wrapper.like("email", "@");
		return this.getBaseMapper().selectObjs(wrapper);
	}

	@Override
	public IPage<UserPO> getByPageTest() {
		QueryWrapper<UserPO> queryWrapper = new QueryWrapper<>();
		queryWrapper.like("email", "@");
		IPage<UserPO> page = new Page<>(1, 50);
		return this.getBaseMapper().selectPage(page, queryWrapper);
	}

	@Override
	public long selectCountTest() {
		QueryWrapper<UserPO> queryWrapper = new QueryWrapper<>();
		queryWrapper.like("email", "@");
		return this.getBaseMapper().selectCount(queryWrapper);
	}

	/*********************************************************/
	/************************* BaseMapper insert方法 ***************/
	/*********************************************************/
	@Override
	public void insertTest(UserPO user) {
		this.getBaseMapper().insert(user);
	}

	/*********************************************************/
	/************************* BaseMapper update方法 ***************/
	/*********************************************************/
	@Override
	public void updateByIdTest(UserPO user) {
		this.getBaseMapper().updateById(user);
	}

	@Override
	public void updateTest1() {
		UpdateWrapper<UserPO> wrapper = new UpdateWrapper<>();
		wrapper.eq("id", "3");
		UserPO user = new UserPO();
		user.setName("zs");
		user.setAge("23");
		this.getBaseMapper().update(user, wrapper);
	}

	/*********************************************************/
	/************************* BaseMapper Delete方法 ***************/
	/*********************************************************/
	@Override
	public void deleteByIdTest(UserPO user) {
		this.getBaseMapper().deleteById(user.getId());
	}

	@Override
	public void deleteByIdTest1(UserPO user) {
		this.getBaseMapper().deleteById(user);
	}

	@Override
	public void deleteBatchIdsTest(UserPO user) {
		List<Integer> idList = new ArrayList<>();
		idList.add(user.getId());
		this.getBaseMapper().deleteBatchIds(idList);
	}

	@Override
	public void deleteTest(UserPO user) {
		QueryWrapper<UserPO> wrapper = Wrappers.query();
		wrapper.eq("id", "1");
		this.getBaseMapper().delete(wrapper);
	}

	@Override
	public void deleteByMapTest(UserPO user) {
		Map<String, Object> map = new HashMap<>();
		map.put("id", "1");
		this.getBaseMapper().deleteByMap(map);
	}

	/****************************** Service **************************************/
	public Map<String, Object> getMapTestTest(String id) {
		QueryWrapper<UserPO> queryWrapper = Wrappers.query();
		queryWrapper.eq("name", "zhangsan");
		Map<String, Object> result = this.getMap(queryWrapper);
		return result;

	}
}
