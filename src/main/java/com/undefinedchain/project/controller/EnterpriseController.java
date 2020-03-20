package com.undefinedchain.project.controller;
import com.undefinedchain.project.core.Result;
import com.undefinedchain.project.core.ResultGenerator;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/03/13.
*/
@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {
//    @Resource
//    private EnterpriseService enterpriseService;
//
//    @PostMapping("/add")
//    public Result add(@RequestBody Enterprise enterprise) {
//        System.out.println("------"+enterprise.getLname());
//        enterpriseService.save(enterprise);
//        return ResultGenerator.genSuccessResult();
//    }
//
//    @PostMapping("/delete")
//    public Result delete(@RequestParam Integer id) {
//        enterpriseService.deleteById(id);
//        return ResultGenerator.genSuccessResult();
//    }
//
//    @PostMapping("/update")
//    public Result update(@RequestBody Enterprise enterprise) {
//        enterpriseService.update(enterprise);
//        return ResultGenerator.genSuccessResult();
//    }
//
//    @PostMapping("/detail")
//    public Result detail(@RequestParam Integer id) {
//        Enterprise enterprise = enterpriseService.findById(id);
//        return ResultGenerator.genSuccessResult(enterprise);
//    }
//
//    @PostMapping("/list")
//    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
//        PageHelper.startPage(page, size);
//        List<Enterprise> list = enterpriseService.findAll();
//        PageInfo pageInfo = new PageInfo(list);
//        return ResultGenerator.genSuccessResult(pageInfo);
//    }
}
