package com.wonwoo.welcome.controller;

import com.wonwoo.welcome.service.SampleService;
import com.wonwoo.welcome.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SampleController {

    @Autowired
    SampleService sampleService;

//    @ResponseBody
    @RequestMapping(value = "/home")
    public String home() {
        return "index.html";
    }

//    @ResponseBody
    @RequestMapping(value = "/valueTest")
    public String valueTest() {
        String value = "하이! 이제부터 시작!";
        return value;
    }

    // jsp page
//    @ResponseBody
    @RequestMapping("/test")
    public ModelAndView test() throws Exception {
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("name", "ssongahlee");

        List<String> testList = new ArrayList<String>();
        testList.add("a");
        testList.add("b");
        testList.add("c");

        mav.addObject("list", testList);
        return mav;
    }

    // 이거 지금 안되는데 왜 안되는지 못찾겠다. thymeleafTest.html 파일을 못찾아감...
//    @ResponseBody
    @RequestMapping(value = "/thymeleafTest")
    public String thymeleafTest(Model model) {
        TestVo testModel = new TestVo("ssongahLee", "쏭아리");
        model.addAttribute("testModel", testModel);
        return "thymeleaf/thymeleafTest";
    }

}
