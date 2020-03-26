package com.undefinedchain.project.service.impl;

import com.undefinedchain.project.core.AbstractService;
import com.undefinedchain.project.dao.EnterpriseMapper;
import com.undefinedchain.project.model.Enterprise;
import com.undefinedchain.project.service.EnterpriseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class EnterpriseServiceImpl extends AbstractService<Enterprise> implements EnterpriseService {
    @Resource
    private EnterpriseMapper enterpriseMapper;

    @Override
    public Enterprise findEnterByUname(String uname) {
        Enterprise enterprise = enterpriseMapper.findEnterByUname(uname);
        return  enterprise;
    }
}
