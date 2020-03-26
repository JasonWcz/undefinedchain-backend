package com.undefinedchain.project.core;

import com.undefinedchain.project.core.UserContext;
import com.undefinedchain.project.model.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class SysInterceptor implements HandlerInterceptor {

    /**
     * 请求执行前执行的
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        System.out.println("拦截器执行------");
        /**
         * 请求前设置过滤
         */
//        User sysUser = (User) request.getSession().getAttribute("sysUser");
//        UserContext.setUserContext(sysUser);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        /**
         * 请求后执行
         */
        UserContext.removeUser();
    }
}
