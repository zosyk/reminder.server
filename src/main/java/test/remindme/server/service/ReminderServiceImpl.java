package test.remindme.server.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.remindme.server.entity.Remind;
import test.remindme.server.repository.RemindRepository;

import java.util.List;

@Service
public class ReminderServiceImpl implements ReminderService{

    @Autowired
    RemindRepository repository;


    @Override
    public List<Remind> getAll() {
        return repository.findAll();
    }

    @Override
    public Remind getByID(long id) {
        return repository.findOne(id);
    }

    @Override
    public void save(Remind remind) {
        repository.saveAndFlush(remind);
    }

    @Override
    public void delete(long id) {
        repository.delete(id);
    }
}
