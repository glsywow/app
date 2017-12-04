package com.glsywow.app.mapper;

import com.glsywow.app.domain.Girl;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * Created by wanggl on 2017/12/4.
 */
public interface GirlMapper extends BaseMapper<Girl>{

    Girl findById(@Param("id") Long id);
}
