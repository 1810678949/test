package com.zking.ssm.service;

import com.zking.ssm.model.T_customer;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface IT_customerService {

    List<T_customer>query();

}