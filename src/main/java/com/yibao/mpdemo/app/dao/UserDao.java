package com.yibao.mpdemo.app.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yibao.mpdemo.app.vo.UserPO;

public interface UserDao extends IService<UserPO> {
	/*********************************************************/
	/************************* BaseMapper常用查询方法 ***************/
	/*********************************************************/
	List<UserPO> getAll();

	UserPO selectByIdTest(Serializable id);

	List<UserPO> selectByIdTest(Collection<String> idList);

	List<UserPO> selectByMapTest(Map<String, Object> columnMap);

	UserPO selectOneTest();

	List<UserPO> selectListTest();

	List<Map<String, Object>> selectMapsTest();

	IPage<Map<String, Object>> selectMapsPageTest();

	List<Object> selectObjsTest();

	IPage<UserPO> getByPageTest();

	long selectCountTest();

	/*********************************************************/
	/************************* BaseMapper insert方法 ***************/
	/*********************************************************/

	void insertTest(UserPO user);

	/*********************************************************/
	/************************* BaseMapper update方法 ***************/
	/*********************************************************/
	void updateByIdTest(UserPO user);

	void updateTest1();

	public void deleteByIdTest(UserPO user);

	public void deleteByIdTest1(UserPO user);

	public void deleteBatchIdsTest(UserPO user);

	public void deleteTest(UserPO user);

	public void deleteByMapTest(UserPO user);

}
