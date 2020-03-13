package com.undefinedchain.project.service.impl;

import com.undefinedchain.project.dao.FinancebillStateDimMapper;
import com.undefinedchain.project.model.FinancebillStateDim;
import com.undefinedchain.project.service.FinancebillStateDimService;
import com.undefinedchain.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/12.
 */
@Service
@Transactional
public class FinancebillStateDimServiceImpl extends AbstractService<FinancebillStateDim> implements FinancebillStateDimService {
    @Resource
    private FinancebillStateDimMapper financebillStateDimMapper;

}
