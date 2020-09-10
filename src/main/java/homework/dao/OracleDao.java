package homework.dao;

import org.springframework.stereotype.Component;

@Component
@Oracle
public class OracleDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saved to Oracle");
    }
}
