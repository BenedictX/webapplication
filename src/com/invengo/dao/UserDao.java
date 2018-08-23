package com.invengo.dao;

import cn.itcast.jdbc.TxQueryRunner;
import com.invengo.domain.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created By IntelliJ IDEA
 * User:Administrator
 * Date:2018/08/23
 * Time:09:28
 */
public class UserDao {
    private QueryRunner queryRunner = new TxQueryRunner();


    public List<User> findAll(){
        List<User> users;
        String sql = "select * from user";
        try {
            users = queryRunner.query(sql,new BeanListHandler<User>(User.class));
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
}
