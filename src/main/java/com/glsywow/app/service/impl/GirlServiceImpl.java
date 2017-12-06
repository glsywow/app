package com.glsywow.app.service.impl;

import com.glsywow.app.dao.GirlDao;
import com.glsywow.app.domain.Girl;
import com.glsywow.app.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wanggl on 2017/12/4.
 */
@Service
public class GirlServiceImpl implements GirlService {

    @Autowired
    private GirlDao girlDao;

    @Override
    public Girl findById(Long id) {
        return girlDao.findOne(1);
    }
}
