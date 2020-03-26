package com.undefinedchain.project.dao;

import com.undefinedchain.project.core.Mapper;
import com.undefinedchain.project.model.Enterprise;

public interface EnterpriseMapper extends Mapper<Enterprise> {
    Enterprise findEnterByUname(String uname);
}