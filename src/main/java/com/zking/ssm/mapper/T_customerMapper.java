package com.zking.ssm.mapper;

import com.zking.ssm.model.T_customer;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface T_customerMapper {

    List<T_customer>query();

}