package me.shenchao.web;

import me.shenchao.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 各种表单提交的方法与接收方法
 */
@Controller
@RequestMapping("/form")
public class FormSubmitController {

    @RequestMapping(value = "/form1", method = RequestMethod.GET)
    public String form1() {
        return "form_submit/form1.jsp";
    }

    @RequestMapping(value = "/form2", method = RequestMethod.GET)
    public String form2() {
        return "form_submit/form2.jsp";
    }

    @RequestMapping(value = "/form3", method = RequestMethod.GET)
    public String form3() {
        return "form_submit/form3.jsp";
    }

    @RequestMapping(value = "/submit1", method = RequestMethod.POST)
    @ResponseBody
    public String submit1_Get(User user) {
        System.out.println(user.getUsername1());
        System.out.println(user.getUsername2());
        return "ok";
    }

    @RequestMapping(value = "/submit2", method = RequestMethod.POST)
    @ResponseBody
    public String submit2(User user, @RequestParam("image") MultipartFile file) {

        System.out.println(user.getUsername1());
        System.out.println(user.getUsername2());
        System.out.println(file.getSize());
        return "ok";
    }

    @RequestMapping(value = "/submit3", method = RequestMethod.POST)
    @ResponseBody
    public String submit3(@RequestBody User user) {

        System.out.println(user.getUsername1());
        System.out.println(user.getUsername2());
        return "{}";
    }
}
