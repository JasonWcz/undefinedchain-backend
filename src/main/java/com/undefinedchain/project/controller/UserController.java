package com.undefinedchain.project.controller;
import com.auth0.jwt.JWT;
import com.undefinedchain.project.annotation.UserLoginToken;
import com.undefinedchain.project.core.Result;
import com.undefinedchain.project.core.ResultGenerator;
import com.undefinedchain.project.core.UserContext;
import com.undefinedchain.project.model.Enterprise;
import com.undefinedchain.project.model.User;
import com.undefinedchain.project.service.EnterpriseService;
import com.undefinedchain.project.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.undefinedchain.project.service.impl.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
* Created by CodeGenerator on 2020/03/12.
*/
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @Resource
    private EnterpriseService enterpriseService;

    @Autowired
    TokenService tokenService;
    /**
     * 用户（管理员）注册
     * 先查询企业数量，再给user的eid赋值
     * （因此管理员信息要先于企业插入）
     * @param user
     * @return
     */
    @PostMapping("/add")
    public Result add(@RequestBody User user) {
        user.setEid(enterpriseService.findAll().size()+1);
        userService.save(user);
        return ResultGenerator.genSuccessResult();
    }

//    @PostMapping("/register")
//    public Result register(@RequestBody Enterprise enterprise) {
//
//        user.setEid(enterpriseService.findAll().size()+1);
//        userService.save(user);
//        return ResultGenerator.genSuccessResult();
//    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        userService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody User user) {
        userService.update(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        User user = userService.findById(id);
        return ResultGenerator.genSuccessResult(user);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PostMapping("/login" )
    public Result  login(@RequestBody Map<String,Object> map) {
        String phone = map.get("phone").toString();
        String password = map.get("password").toString();
        User user = userService.findBy("phone", phone);
        if(user==null){
            return ResultGenerator.genFailResult("登录失败,用户不存在");
        }else {
            if (user.getUpass().equals(password)) {
                String token = tokenService.getToken(user);
                return ResultGenerator.genSuccessResult(token);
            } else {
                return ResultGenerator.genFailResult("登录失败,密码错误");
            }
        }
    }

    /**
     * 根据用户的登录phone获取用户企业信息
     * @param
     * @return
     */
    @UserLoginToken
    @PostMapping("/getEnterInfo")
    public Enterprise getUserInfo(HttpServletRequest request) {
        String token = request.getHeader("token");
        String uid = JWT.decode(token).getAudience().get(0);
        System.out.println("uid"+uid);
        String test  =  UserContext.getUserContext();
        System.out.println("usercontext:"+test);
        User user = new User();
        user.setPhone("123");
        user.setUname("Lwimp");
        String uname = user.getUname();
        Enterprise enter = enterpriseService.findEnterByUname(uname);
        return enter;
    }
    @UserLoginToken
    @PostMapping("/test")
    public void  test() {
        System.out.println("test here !");
    }
}
