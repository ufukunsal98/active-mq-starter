package com.ufuk.activemqstarter.Conroller;

import com.ufuk.activemqstarter.Domain.EmailTemplateAndExamDto;
import com.ufuk.activemqstarter.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ufukremzi
 */

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    Producer producer;

    @GetMapping
    private String sendMessage() {

        producer.sendMessage("prices" , "message lorem");
        return "Ok";
    }
}
