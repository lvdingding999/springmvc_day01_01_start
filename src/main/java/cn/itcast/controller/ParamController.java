package cn.itcast.controller;

import cn.itcast.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.bind.SchemaOutputResolver;

/**
 * 请求参数绑定
 */
@Controller
@RequestMapping("/param")
public class ParamController {
    /**
     * 请求参数绑定入门
     * @return
     */
    @RequestMapping("/testParam")
    public String testParam(String username,String password ){
        System.out.println("方法执行了。。。");
        System.out.println("用户名："+username);
        System.out.println("密码："+password);
        return "success";
    }
    /**
     * 请求参数绑定把数据封装到JavaBean的类中
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saverAccount(Account account){
        System.out.println("方法执行了。。。");
        System.out.println(account);
        return "success";
    }
}
