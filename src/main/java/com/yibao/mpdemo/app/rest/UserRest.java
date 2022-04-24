package com.yibao.mpdemo.app.rest;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yibao.mpdemo.app.dao.UserDao;
import com.yibao.mpdemo.app.vo.UserPO;

@RestController
@RequestMapping("/user/")
public class UserRest {

	@Autowired
	private UserDao userDao;

	@GetMapping("selectByIdTest")
	public List<Map<String, Object>> selectByIdTest() {
		List<Map<String, Object>> resList = userDao.selectByIdTest();
		return resList;

	}
	
	@GetMapping("selectMapsTest")
	public List<Map<String, Object>> selectMapsTest() {
		List<Map<String, Object>> resList = userDao.selectMapsTest();
		return resList;

	}

	@GetMapping("selectObjsTest")
	public List<Object> selectObjsTest() {
		List<Object> resList = userDao.selectObjsTest();
		return resList;

	}

	@GetMapping("getAll")
	public List<UserPO> getAll() {
		List<UserPO> resList = userDao.getAll();
		return resList;

	}

	@GetMapping("getById")
	public List<UserPO> getById(Integer id) {
		List<UserPO> resList = userDao.getById(id);
		return resList;

	}
}
