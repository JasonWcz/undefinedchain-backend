package com.undefinedchain.project.service.impl;

import com.undefinedchain.project.dao.FeedbackInfoMapper;
import com.undefinedchain.project.model.FeedbackInfo;
import com.undefinedchain.project.service.FeedbackInfoService;
import com.undefinedchain.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/12.
 */
@Service
@Transactional
public class FeedbackInfoServiceImpl extends AbstractService<FeedbackInfo> implements FeedbackInfoService {
    @Resource
    private FeedbackInfoMapper feedbackInfoMapper;

}
