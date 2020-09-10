package homework.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class DaoService {

    @Autowired
    @Oracle
    private Dao workDao;
    @Autowired
    @Derby
    private Dao backupDao;

    @Scheduled(fixedDelay = 1000)
    public void doWork() {
        System.out.println("Doing work");
        workDao.save();
    }
    @Scheduled(fixedDelay = 3000)
    public void doBackup() {
        System.out.println("Doing backup");
        backupDao.save();
    }
}
