package com.undefinedchain.project.service;
import com.undefinedchain.project.model.Enterprise;
import com.undefinedchain.project.core.Service;


/**
 * Created by CodeGenerator on 2020/03/13.
 */
public interface EnterpriseService extends Service<Enterprise> {
    Enterprise  findEnterByUname(String uname);
}
