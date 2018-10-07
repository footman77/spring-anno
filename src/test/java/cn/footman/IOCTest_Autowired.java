package cn.footman;

import cn.footman.bean.Boss;
import cn.footman.bean.Car;
import cn.footman.bean.Color;
import cn.footman.config.MainConfigAutowired;
import cn.footman.dao.BookDao;
import cn.footman.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Autowired {

    @Test
    public void test01(){
        //创建容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigAutowired.class);

        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService);

//        BookDao bean = applicationContext.getBean(BookDao.class);
//        System.out.println(bean);
        Boss boss= applicationContext.getBean(Boss.class);
        System.out.println(boss);
        Car car = applicationContext.getBean(Car.class);
        System.out.println(car);

        Color color = applicationContext.getBean(Color.class);
        System.out.println(color);
        applicationContext.close();
    }

}
