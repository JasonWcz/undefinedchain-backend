package com.undefinedchain.project.service.impl;

import com.undefinedchain.project.dao.CertificationinfoMapper;
import com.undefinedchain.project.model.Certificationinfo;
import com.undefinedchain.project.service.CertificationinfoService;
import com.undefinedchain.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/12.
 */
@Service
@Transactional
public class CertificationinfoServiceImpl extends AbstractService<Certificationinfo> implements CertificationinfoService {
    @Resource
    private CertificationinfoMapper certificationinfoMapper;

}
