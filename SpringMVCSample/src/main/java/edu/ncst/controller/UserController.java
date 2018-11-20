package edu.ncst.controller;

import edu.ncst.dao.UserDao;
import edu.ncst.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * Created by dell on 2018/10/30.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/index")
    public String findById(Model model){
        User user=userDao.findOne(1);
        /*model.addAttribute("hello",userDao.findOne(1));*/
        model.addAttribute("hello",user);
        return "test";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public  String login(String userName,String password,Model model) {
        List<User> users = userDao.findAll();
        /*equals()比较两个字符串内容是否相等*/
        for (User u : users) {
            if (u.getName().equals(userName) &&
                    u.getPassword().equals(password)) {
                model.addAttribute("result", "登陆成功");
                return "home";

            }
        }
        model.addAttribute("result","登录失败");
        return "home";
    }

    /*进入注册页面是get  一个连接进入的！*/
    @RequestMapping(value = "/processRegister",method = RequestMethod.GET)
    public  String  register(){
        return "register";
    }
    @RequestMapping(value = "/processRegister",method = RequestMethod.POST)
    @ResponseBody
    public  User  register(User user,Model model){
        List<User> u=userDao.findAll();
        for(User user1:u)
        {
            if (user1.getName().equals(user.getName())){

                model.addAttribute("result","名字重复了！");

            }
        }
        /*
        当这用到一个类时候，一个对象接受参数的时候但是这里边的参数要和控件里边的一致*/
        userDao.save(user);
        return user;
    }

    /*1名字相同时，返回名字相同！
    * 2判断两次密码是否相同
    * 3delete删掉一个已经注册的用户 返回删除完成！*/
    /*访问时localhost:8080/user/edit?id=1*/
    @RequestMapping(value = "/edit",method = RequestMethod.GET)
    public  String  edit(Integer id,Model model){
        User user=userDao.findOne(id);//找到这个用户
        model.addAttribute("user",user);
        return "edit";
    }

    /**/

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    @ResponseBody
        public void delete(Integer id,Model model){
        User user=userDao.findOne(id);//找到这个用户
        userDao.delete(user);

    }

    /*你要编辑哪一个用户！！*/
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    @ResponseBody
    public  User  editUser(User user){
        /*
        当这用到一个类时候，一个对象接受参数的时候但是这里边的参数要和控件里边的一致*/
        userDao.save(user);
        return user;
    }
    

    @RequestMapping("/a")
    @ResponseBody
    public  User getData(){
        return userDao.findOne(2);

    }

}
