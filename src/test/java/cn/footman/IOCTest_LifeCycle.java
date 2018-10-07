package cn.footman;

import cn.footman.config.MainConfigLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_LifeCycle {

    @Test
    public void test01(){
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigLifeCycle.class);
        System.out.println("容器创建完成...");

//        applicationContext.getBean("car");
        //关闭容器
        applicationContext.close();
    }
}
