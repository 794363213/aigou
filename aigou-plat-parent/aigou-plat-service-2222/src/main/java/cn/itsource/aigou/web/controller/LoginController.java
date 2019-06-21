package cn.itsource.aigou.web.controller;

import cn.itsource.aigou.AjaxResult;
import cn.itsource.aigou.domain.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if("www".equals(employee.getUsername()) && "111".equals(employee.getPassword())){
            return new AjaxResult();
        }else{
            return AjaxResult.me().setSuccess(false).setMsg("操作失败！");
        }
    }

    @RequestMapping(value = "/lget",method = RequestMethod.GET)
    public AjaxResult login(){
       return AjaxResult.me();
    }

}
