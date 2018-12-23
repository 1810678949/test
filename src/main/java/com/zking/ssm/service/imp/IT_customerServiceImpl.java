package com.zking.ssm.service.imp;

import com.zking.ssm.mapper.T_customerMapper;
import com.zking.ssm.model.T_customer;
import com.zking.ssm.service.IT_customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class IT_customerServiceImpl implements IT_customerService {
    @Autowired
    private T_customerMapper t_customerMapper;
    @Override
    public List<T_customer> query() {
        return t_customerMapper.query();
    }
}
