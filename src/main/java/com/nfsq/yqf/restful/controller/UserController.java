package com.nfsq.yqf.restful.controller;

import com.nfsq.yqf.restful.bean.User;
import org.springframework.web.bind.annotation.*;

/**
 * 下面是restful风格的url
 * restful风格的url指的是在url中不出现动词
 * 而是在method中来体现到底这个url是对资源进行什么操作
 */
@RestController
public class UserController {
    @RequestMapping(value = "/user/{userName}",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public String selectUser(@PathVariable String userName){
        return "查询到用户名为："+userName+"的信息";
    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String createUser(@RequestBody User user){
        return "新增用户"+user.getUserName()+",年龄"+user.getAge();
    }
    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Integer id){
        return "删除id为："+id+"的用户";
    }
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String updateUser(@RequestBody User user){
        return "修改一个名为："+user.getUserName()+"年龄为："+user.getAge()+"的人";
    }
}
