package com.undefinedchain.project.controller;
import com.undefinedchain.project.core.Result;
import com.undefinedchain.project.core.ResultGenerator;
import com.undefinedchain.project.model.Certificationinfo;
import com.undefinedchain.project.service.CertificationinfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/03/12.
*/
@RestController
@RequestMapping("/certificationinfo")
public class CertificationinfoController {
    @Resource
    private CertificationinfoService certificationinfoService;

    @PostMapping("/add")
    public Result add(Certificationinfo certificationinfo) {
        certificationinfoService.save(certificationinfo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        certificationinfoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Certificationinfo certificationinfo) {
        certificationinfoService.update(certificationinfo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Certificationinfo certificationinfo = certificationinfoService.findById(id);
        return ResultGenerator.genSuccessResult(certificationinfo);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Certificationinfo> list = certificationinfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
