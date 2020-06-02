package com.wonwoo.welcome.controller;

import com.wonwoo.welcome.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SampleController {

    @Autowired
    SampleService sampleService;

    @RequestMapping(value = "/home")
    public String home() {
        return "index.html";
    }

    @ResponseBody
    @RequestMapping(value = "/valueTest")
    public String valueTest() {
        String value = "하이! 이제부터 시작!";
        return value;
    }

    // jsp page가 있어야 동작하는 코드
//    @ResponseBody
//    @RequestMapping(value = "/test")
//    public ModelAndView test() throws Exception {
//        ModelAndView mav = new ModelAndView("test");
//        mav.addObject("name", "ssongahlee");
//
//        List<String> testList = new ArrayList<String>();
//        testList.add("a");
//        testList.add("b");
//        testList.add("c");
//
//        mav.addObject("list", testList);
//        return mav;
//    }

}
