package com.university.task5University;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.InetAddress;

@Controller
@RequestMapping(value = "/")
public class TaskController {
    @Autowired
    Service service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public int getCount() {
        return service.count;
    }

    @RequestMapping(value = "/stat", method = RequestMethod.GET)
    @ResponseBody
    public int getStat() {
        return service.count++;
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    @ResponseBody
    public String getAbout() {
        return "<h3>Hello!</h3>" +
                "<b>Hostname:</b> " + InetAddress.getLoopbackAddress().getHostAddress() + "<br/>";
    }

}
