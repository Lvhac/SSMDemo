package com.test.service.impl;

import com.test.mapper.TbBrandMapper;
import com.test.pojo.TbBrand;
import com.test.service.TbBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ChuanLv
 * @version v1.0
 * @date 2019/5/18 20:44
 * @description TODO
 **/
@Service
public class TbBrandServiceImpl implements TbBrandService {
    @Autowired
    private TbBrandMapper tbBrandMapper;

    @Override
    public List<TbBrand> finAll() {
        return tbBrandMapper.findAll();
    }
}
