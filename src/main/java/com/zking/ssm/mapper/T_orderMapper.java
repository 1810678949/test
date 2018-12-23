package com.zking.ssm.mapper;

import com.zking.ssm.model.T_order;
import org.springframework.stereotype.Repository;

@Repository
public interface T_orderMapper {
  T_order query(Integer orderid);
}