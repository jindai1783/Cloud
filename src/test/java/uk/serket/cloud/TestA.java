package uk.serket.cloud;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by daijin on 17/05/2015.
 */
public class TestA {

    @Test
    public void testSayHello() {
        IA a = new A();
        a.sayHello();
    }

    @Test
    public void testSpringSayHello() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IA a = (IA) context.getBean("a");
        a.sayHello();
    }

}
