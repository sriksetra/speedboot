package indi.pyu.core;

import indi.pyu.core.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class CoreApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    UserDao userDao;

    @Test
    void contextLoads() {
        System.out.println(userDao.getUser("admin"));
    }

}
