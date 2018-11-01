package com.newer.test;

import com.newer.dao.HelloDao;
import com.newer.dao.JDBCDaoImpl;
import com.newer.dao.MybatisDaoImpl;
import com.newer.service.HelloService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shining
 */
public class HelloTest {

    @Test
    public void test(){
//        JDBCDaoImpl jdbcDao=new JDBCDaoImpl();
//        jdbcDao.sayHello();
        //代码依赖过强，紧密耦合
//        MybatisDaoImpl dao=new MybatisDaoImpl();
//        dao.sayHello();

        //使用多态，使用接口组合项目
        //代码维护更方法
        HelloDao dao=new MybatisDaoImpl();
        dao.sayHello();
    }

    @Test
    public void test1(){
        //通过添加接口的管理类
        //隔离上层应用和dao访问
        //实现松耦合
        HelloService service=new HelloService();
        service.sayHello();
    }

    @Test
    public void test2(){
        //彻底松耦合，
        //实现热插拔

        //读取springbean的配置文件，得到应用上下文
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //从bean容器获取 bean实例--装配好的bean实例
        HelloService helloService=ctx.getBean("helloService",HelloService.class);

        helloService.sayHello();
    }
}
