package pl.coderslab.entity;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.lang3.ArrayUtils;

public class Main {
    public static void main(String[] args) {

        UserDao userDao = new UserDao();
        User[] all = userDao.findAll();
        System.out.println(ArrayUtils.toString(all));
        }
    }

