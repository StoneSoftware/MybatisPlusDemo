package com.yibao.mpdemo.app.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yibao.mpdemo.app.vo.UserPO;

@Mapper
public interface UserMapper extends BaseMapper<UserPO> {

}
