package com.undefinedchain.project.controller;
import com.undefinedchain.project.core.Result;
import com.undefinedchain.project.core.ResultGenerator;
import com.undefinedchain.project.model.FeedbackInfo;
import com.undefinedchain.project.model.Financebill;
import com.undefinedchain.project.service.FinancebillService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
* Created by CodeGenerator on 2020/03/12.
*/
@RestController
@RequestMapping("/financebill")
public class FinancebillController {
    @Resource
    private FinancebillService financebillService;

    @PostMapping("/add")
    public Result add(Financebill financebill) {
        financebillService.save(financebill);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        financebillService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Financebill financebill) {
        financebillService.update(financebill);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Financebill financebill = financebillService.findById(id);
        return ResultGenerator.genSuccessResult(financebill);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Financebill> list = financebillService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    //列出所有待审核金票
    @PostMapping("/listNewFinancebills")
    public Result listNewFinancebills(@RequestParam(defaultValue = "0") Integer page,
                                                @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Financebill> list = Collections.singletonList(financebillService.findBy("billState", 0));
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    //审核某一金票是否通过
    @PostMapping("/feedNewFinancebill")
    public Result feedNewFinancebill(@RequestParam Integer id, @RequestParam Boolean isPass,
                                  @RequestParam(defaultValue = "") String feedbackReason,
                                  @RequestParam Integer uid, @RequestParam(defaultValue = "0") String cid) {
        Financebill financebill = financebillService.findById(id);
        if (isPass) financebill.setBillState(2);//2代表通过待接收
        else {
            Integer feedbadckid = id;
            FeedbackInfo feedbackInfo = new FeedbackInfo();
            feedbackInfo.setFbid(feedbadckid);
            feedbackInfo.setCid(cid);
            feedbackInfo.setUid(uid);
            feedbackInfo.setFeedInfo(feedbackReason);

            financebill.setBillState(3);//3代表驳回
            //这里有个问题，驳回信息未与金票表相关联，我就将其id设为一致，暂时解决没有外键的问题
        }
        return ResultGenerator.genSuccessResult(financebill);
    }

    //列出所有待融资金票
    @PostMapping("/listFinancebills")
    public Result listFinancebills(@RequestParam(defaultValue = "0") Integer page,
                                      @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Financebill> list = Collections.singletonList(financebillService.findBy("billState", 5));
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    //审核某一金票融资行为是否通过
    @PostMapping("/feedFinancebill")
    public Result feedFinancebill(@RequestParam Integer id, @RequestParam Boolean isPass,
                                  @RequestParam(defaultValue = "") String feedbackReason,
                                  @RequestParam Integer uid, @RequestParam(defaultValue = "0") String cid) {
        Financebill financebill = financebillService.findById(id);
        if (isPass) financebill.setBillState(6);//6代表融资已受理
        else {
            Integer feedbadckid = id;
            FeedbackInfo feedbackInfo = new FeedbackInfo();
            feedbackInfo.setFbid(feedbadckid);
            feedbackInfo.setCid(cid);
            feedbackInfo.setUid(uid);
            feedbackInfo.setFeedInfo(feedbackReason);

            financebill.setBillState(7);//7代表驳回
            //这里有个问题，驳回信息未与金票表相关联，我就将其id设为一致，暂时解决没有外键的问题
        }
        return ResultGenerator.genSuccessResult(financebill);
    }

    //列出所有待放款金票
    @PostMapping("/listPayBills")
    public Result listPayBills(@RequestParam(defaultValue = "0") Integer page,
                                   @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Financebill> list = Collections.singletonList(financebillService.findBy("billState", 6));
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    //审核某一金票放款行为是否通过
    @PostMapping("/feedPayBill")
    public Result feedPayBill(@RequestParam Integer id, @RequestParam Boolean isPass,
                                  @RequestParam(defaultValue = "") String feedbackReason,
                                  @RequestParam Integer uid, @RequestParam(defaultValue = "0") String cid) {
        Financebill financebill = financebillService.findById(id);
        if (isPass) financebill.setBillState(8);//8代表已放款
        else {
            Integer feedbadckid = id;
            FeedbackInfo feedbackInfo = new FeedbackInfo();
            feedbackInfo.setFbid(feedbadckid);
            feedbackInfo.setCid(cid);
            feedbackInfo.setUid(uid);
            feedbackInfo.setFeedInfo(feedbackReason);

            financebill.setBillState(9);//7代表驳回
            //这里有个问题，驳回信息未与金票表相关联，我就将其id设为一致，暂时解决没有外键的问题
        }
        return ResultGenerator.genSuccessResult(financebill);
    }
}
