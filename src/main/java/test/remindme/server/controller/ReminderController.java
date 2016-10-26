package test.remindme.server.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import test.remindme.server.entity.Remind;
import test.remindme.server.repository.RemindRepository;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/remind")
public class ReminderController {

    @Autowired
    RemindRepository remindRepository;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(){

        return createMockRemind();
    }

    private Remind createMockRemind() {
        Remind remind = new Remind();

        List<Remind> all = remindRepository.findAll();

        remind.setId(3423);
        remind.setRemindDate(new Date());
        remind.setTitle("it is my first json object from RestController");
        return remind;
    }
}
