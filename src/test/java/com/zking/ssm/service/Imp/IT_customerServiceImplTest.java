package com.zking.ssm.service.Imp;

import com.zking.ssm.model.T_customer;
import com.zking.ssm.model.T_order;
import com.zking.ssm.service.IT_customerService;
import com.zking.ssm.service.IT_orderMapper;
import org.junit.After;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class IT_customerServiceImplTest extends  BaseTestCase{
    @Autowired
    private IT_customerService it_customerService;
    @Autowired
    private IT_orderMapper it_orderMapper;


    @Test
    public void query() {
        List<T_customer> query = it_customerService.query();
        for (T_customer t_customer : query) {
            System.out.println(t_customer);
        }

    }   @Test
    public void query2() {
        T_order query = it_orderMapper.query(1);
        System.out.println(query);

    }
}