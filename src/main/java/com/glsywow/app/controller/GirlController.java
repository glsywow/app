package com.glsywow.app.controller;

import com.glsywow.app.domain.Girl;
import com.glsywow.app.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wanggl on 2017/12/4.
 */
@RestController
public class GirlController {

    @Autowired
    private GirlService girlService;

    @GetMapping("/girl")
    public Girl getGirl(@RequestParam("id") Long id){
       return girlService.findById(id);
    }

}
