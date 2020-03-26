package com.example.springboottest05;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @ClassName WsController
 * @Description TODO
 * @Author lhw
 * @Date 2020/3/16 17:06
 * @Version 1.0
 **/
@Controller
public class WsController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public ResponseMessage say(RequestMessage message) {
        System.out.println(message.getName());
        return new ResponseMessage("welcome," + message.getName() + "!");
    }
}
