package com.zking.ssm.service.imp;

import com.zking.ssm.mapper.T_orderMapper;
import com.zking.ssm.model.T_order;
import com.zking.ssm.service.IT_orderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class T_orderMapperImpl implements IT_orderMapper {
    @Autowired
    private T_orderMapper t_order;
    @Override
    public T_order query(Integer orderid) {
        return t_order.query(orderid);
    }
}
