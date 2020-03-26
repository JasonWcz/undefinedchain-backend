package com.undefinedchain.project.service;

import com.undefinedchain.project.core.Service;
import com.undefinedchain.project.model.Enterprise;

public interface EnterpriseService extends Service<Enterprise> {
    Enterprise  findEnterByUname(String uname);
}
