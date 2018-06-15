package com.example.demo.boot.control;

import com.example.demo.boot.command.SimpleCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

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
        logger.info("---------getUserByGet start---------");
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
        logger.info("---------getUserByPost start---------");
        logger.info("userName:" + userName + "  " + data.toString());
        logger.info("---------getUserByPost end---------");
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
        logger.info("---------getConfigurationUserByGet start---------");
        logger.info("userNameConf:" + userNameConf + "  " + "userCodeConf：" + userCodeConf);
        logger.info("---------getConfigurationUserByGet end---------");
        return "Hello Get " + userNameConf + " " + userCodeConf;
    }

}
