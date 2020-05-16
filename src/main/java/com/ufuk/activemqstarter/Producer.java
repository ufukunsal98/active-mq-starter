package com.ufuk.activemqstarter;

import com.ufuk.activemqstarter.Domain.Email;
import com.ufuk.activemqstarter.Domain.EmailTemplateAndExamDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author ufukremzi
 */
@Component
public class Producer {

    private final JmsTemplate jmsTemplate;

    private final Random random = new Random();

    @Autowired
    public Producer(JmsTemplate jmsTemplate) {

        this.jmsTemplate = jmsTemplate;
    }


    public void sendMessage(final String queueName, final String message) {
//        Map map = new Gson().fromJson(message, Map.class);
//        final String textMessage = "Hello" + map.get("name");
        EmailTemplateAndExamDto emailTemplateAndExamDto = new EmailTemplateAndExamDto();
        emailTemplateAndExamDto.setBody("asdasd");
        List<String> instructorMailList = new ArrayList<>();
        instructorMailList.add("ufuk-selen@hotmail.com");
        instructorMailList.add("ufuk-selen@hotmail.com");
        emailTemplateAndExamDto.setInstructorList(instructorMailList);
        emailTemplateAndExamDto.setMailTemplate("KTUN_MAIL_STANDART");

        System.out.println("Sending message " + Integer.toString(random.nextInt(100)) + "to queue - " + queueName);
        jmsTemplate.convertAndSend("ktun-email-queues" , emailTemplateAndExamDto);
    }

}
