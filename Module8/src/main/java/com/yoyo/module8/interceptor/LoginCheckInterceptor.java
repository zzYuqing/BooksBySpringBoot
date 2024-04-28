package com.yoyo.module8.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.yoyo.module8.pojo.Result;
import com.yoyo.module8.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Component
public class LoginCheckInterceptor implements HandlerInterceptor {
    @Override//目标资源方法运行前运行，返回true则放行，返回false，则不放心
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //1.获取请求的url
        String url=request.getRequestURI().toString();
        log.info("请求的url：{}",url);

        //2.判断请求url是否包含login，包含则放行
        if(url.contains("login")){
            return true;
        }
        //3.获取令牌token
        String jwt =request.getHeader("token");
        //4.判断令牌是否存在，不存在则返回错误结果
        if(!StringUtils.hasLength(jwt)){
            log.info("token空，返回未登录信息");
            Result error=Result.error("NOT_LOGIN");
            //手动转换 对象--json
            String notLogin = JSONObject.toJSONString(error);
            response.getWriter().write(notLogin);
            return false;
        }
        //5.解析token，解析失败则返回错误结果
        try{
            JwtUtils.parseJwt(jwt);
        }catch (Exception e){
            e.printStackTrace();
            log.info("解析token失败，返回未登录信息");
            Result error=Result.error("NOT_LOGIN");
            //手动转换 对象--json
            String notLogin = JSONObject.toJSONString(error);
            response.getWriter().write(notLogin);
            return false;
        }
        //6.放行
        log.info("令牌合法，放行");
        return true;
    }

    @Override//目标资源方法运行后运行
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
    }

    @Override//视图渲染完毕后运行，最后运行
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion");
    }
}
