package org.zero.guestbook.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/sample")
@Log4j2
public class GuestbookController {

    @GetMapping("/exSidebar")
    public String list(){
        log.info("list....");
        return "exSidebar";
    }

}
