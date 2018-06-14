package com.example.demo.boot.control;

import com.example.demo.boot.command.SimpleCommand;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:用户信息Controller
 * @Author:tianminghai
 * @Date:下午5:07 2018/6/14
 */
@RestController
@RequestMapping(value = "/springboot")
public class UserController {
  @RequestMapping(value = "/getUserByGet", method = RequestMethod.GET)
  String getUserByGet(@RequestParam(value = "userName") String userName) {
    System.out.println("---------getUserByGet start---------");
    return "Hello " + userName;
  }

  @RequestMapping(value = "/getUserByPost", method = RequestMethod.POST)
  String getUserByPost(@RequestParam(value = "userName") String userName, @RequestBody SimpleCommand data) {
    System.out.println("---------getUserByPost start---------");
    System.out.println("userName:"+userName +"  "+data.toString());
    System.out.println("---------getUserByPost end---------");
    return "Hello POST " + userName + data;
  }

}
