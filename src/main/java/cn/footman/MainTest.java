package cn.footman;

import cn.footman.bean.Person;
import cn.footman.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    public static void main(String[] args) {

        //配置文件的方式
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:beans.xml");
//
//        Person person = (Person) applicationContext.getBean("person");
//
//        System.out.println(person);

        //注解的方式
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);

        //Person这个类在容器中的组件名字
        String[] names = applicationContext.getBeanNamesForType(Person.class);

        for(String name : names){
            System.out.println(name);
        }
    }
}
