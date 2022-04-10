package com.yibao.mpdemo.app.rest;

import java.util.List;

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
