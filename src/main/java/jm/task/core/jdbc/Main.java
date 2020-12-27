package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {

    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();

        userDao.saveUser("Иван", "Иванов", (byte) 20);
        userDao.saveUser("Петр", "Петров", (byte) 20);
        userDao.saveUser("Федор", "Федоров", (byte) 20);
        userDao.saveUser("Николай", "Николаев", (byte) 20);

        System.out.println(userDao.getAllUsers());

        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
