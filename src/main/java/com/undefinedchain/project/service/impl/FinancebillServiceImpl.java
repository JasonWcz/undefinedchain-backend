package com.undefinedchain.project.service.impl;

import com.undefinedchain.project.dao.FinancebillMapper;
import com.undefinedchain.project.model.Financebill;
import com.undefinedchain.project.service.FinancebillService;
import com.undefinedchain.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/12.
 */
@Service
@Transactional
public class FinancebillServiceImpl extends AbstractService<Financebill> implements FinancebillService {
    @Resource
    private FinancebillMapper financebillMapper;

}
