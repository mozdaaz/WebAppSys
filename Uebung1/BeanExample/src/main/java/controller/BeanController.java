package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.fra.uas.service.MessageService;

@Controller
public class BeanController {

    @Autowired

    private MessageService messageService;

    public String putMessage(String message) {

        messageService.setMessage(message);

        return messageService.getMessage();
}

}
