package com.test.controller;

import com.test.bean.PageResult;
import com.test.pojo.TbBrand;
import com.test.service.TbBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ChuanLv
 * @version v1.0
 * @date 2019/5/18 20:46
 * @description TODO
 **/
@RestController
@RequestMapping("/brand")
public class TbBrandController {
    @Autowired
    private TbBrandService tbBrandService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("/findAll")
    public List<TbBrand> findAll(){
        return tbBrandService.finAll();
    }

    @RequestMapping("/search/{pageNum}/{pageSize}")
    public PageResult search(@RequestBody TbBrand tbBrand, @PathVariable("pageNum") int pagNum, @PathVariable("pageSize") int pageSize){

        return null;
    }
}
