package com.yibao.mpdemo.app.dao;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yibao.mpdemo.app.vo.UserPO;

public interface UserDao extends IService<UserPO> {

	public List<Map<String, Object>> selectMapsTest();

	public List<UserPO> getAll();

	public List<UserPO> getById(Integer id);

}
