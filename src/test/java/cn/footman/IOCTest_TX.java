package cn.footman;

import cn.footman.aop.MathCalculator;
import cn.footman.config.MainConfigOfAOP;
import cn.footman.tx.TxConfig;
import cn.footman.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_TX {


    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);

        UserService service = applicationContext.getBean(UserService.class);
        service.insert();
        applicationContext.close();

    }
}
