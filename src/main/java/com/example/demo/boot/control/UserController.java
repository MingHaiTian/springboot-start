package com.example.demo.boot.control;

import com.example.demo.boot.command.SimpleCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:用户信息Controller
 * @Author:tianminghai
 * @Date:下午5:07 2018/6/14
 */
@RestController
@RequestMapping(value = "/springboot")
public class UserController {

    //    用户名
    @Value("${username}")
    private String userNameConf;
    //    用户编码
    @Value("${usercode}")
    private String userCodeConf;

    /**
     * Get 方法
     *
     * @Param userName
     * @Author:tianminghai
     * @Date:上午10:37 2018/6/15
     */
    @RequestMapping(value = "/getUserByGet", method = RequestMethod.GET)
    String getUserByGet(@RequestParam(value = "userName") String userName) {

        System.out.println("---------getUserByGet start---------");
        return "Hello " + userName;
    }

    /**
     * Post 方法
     *
     * @Param userName
     * @Param data
     * @Author:tianminghai
     * @Date:上午10:37 2018/6/15
     */
    @RequestMapping(value = "/getUserByPost", method = RequestMethod.POST)
    String getUserByPost(@RequestParam(value = "userName") String userName, @RequestBody SimpleCommand data) {

        System.out.println("---------getUserByPost start---------");
        System.out.println("userName:" + userName + "  " + data.toString());
        System.out.println("---------getUserByPost end---------");
        return "Hello POST " + userName + data;
    }

    /**
     * 获取配置文件中的变量
     *
     * @Author:tianminghai
     * @Date:上午10:42 2018/6/15
     */
    @RequestMapping(value = "/getConfigurationUserByGet", method = RequestMethod.GET)
    String getConfigurationUserByGet() {
        System.out.println("---------getConfigurationUserByGet start---------");
        System.out.println("userNameConf:" + userNameConf + "  " + "userCodeConf：" + userCodeConf);
        System.out.println("---------getConfigurationUserByGet end---------");
        return "Hello Get " + userNameConf + " " + userCodeConf;
    }

}
