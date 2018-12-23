package com.zking.ssm.service;

import com.zking.ssm.model.T_order;
import org.springframework.stereotype.Repository;


public interface IT_orderMapper {
  T_order query(Integer orderid);
}