package com.glsywow.app.utils.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by wanggl on 2017/12/4.
 */
public interface BaseMapper<T> extends Mapper<T>,MySqlMapper<T> {

}
