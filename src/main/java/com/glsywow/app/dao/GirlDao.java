package com.glsywow.app.dao;

import com.glsywow.app.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wanggl on 2017/12/6.
 */
public interface GirlDao extends JpaRepository<Girl,Integer>{

}
