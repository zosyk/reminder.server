package test.remindme.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.remindme.server.entity.Remind;

public interface RemindRepository extends JpaRepository<Remind, Long> {

}
