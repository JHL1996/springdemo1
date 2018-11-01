package com.newer.service;

import com.newer.dao.HelloDao;
import com.newer.dao.JDBCDaoImpl;
import com.newer.dao.MybatisDaoImpl;

/**
 * @author shining
 * HelloDao接口的管理类
 */
public class HelloService {
    private HelloDao dao;

    /*public HelloService(){
        this.dao=new MybatisDaoImpl();
    }*/

    public HelloDao getDao() {
        return dao;
    }

    public void setDao(HelloDao dao) {
        this.dao = dao;
    }

    public void sayHello(){
        this.dao.sayHello();
    }

}
