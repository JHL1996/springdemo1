package com.newer.dao;

/**
 * @author shining
 */
public class JDBCDaoImpl implements HelloDao{

    public void sayHello(){
        System.out.println("JDBC实现Dao访问");
    }
}
