package test.remindme.server.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import test.remindme.server.entity.Remind;
import test.remindme.server.repository.RemindRepository;
import test.remindme.server.service.ReminderService;

import java.util.Date;
import java.util.List;

@RestController
public class ReminderController {

    @Autowired
    ReminderService service;

    @RequestMapping(value = "/getReminders", method = RequestMethod.GET)
    @ResponseBody
    public List<Remind> getAllReminders(){

        return service.getAll();
    }

    @RequestMapping(value = "/getReminders/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(@PathVariable("id") long remiderID){

        return service.getByID(remiderID);
    }

    @RequestMapping(value = "/pushReminder", method = RequestMethod.POST, headers = "Accept=application/json", produces = "application/json", consumes = "application/json")
    @ResponseBody
    public void saveReminder(@RequestBody Remind remind){
        service.save(remind);
    }


    @RequestMapping(value = "/deleteReminder/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteReminder(@PathVariable("id") long reminderID){

        service.delete(reminderID);
    }



}
