package test.remindme.server.service;

import test.remindme.server.entity.Remind;

import java.util.List;

public interface ReminderService {

    List<Remind> getAll();
    Remind getByID(final long id);
    void save(final Remind remind);
    void delete(final long id);
}
