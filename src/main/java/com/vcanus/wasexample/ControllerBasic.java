package com.vcanus.wasexample;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class ControllerBasic {
    @RequestMapping(
            value = "/",
            method = RequestMethod.GET)
    @ResponseBody
    public String apiRoot() {
        return "apt test, /";
    }

    @RequestMapping(
            value = "/api1",
            method = RequestMethod.GET)
    @ResponseBody
    public String api1(
            @RequestParam("para1") String _para1,
            @RequestParam("para2") String _para2) {
        return "api test, /api1";
    }
}
