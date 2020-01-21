package com.xmustang;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * BeanFactoryTest
 */
public class BeanFactoryTest {
    @Test
    public void testSimpleLoad() {
        // 下面源码分析用3.0.7.RELEASE
//        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
//        MyTestBean myTestBean = bf.getBean(MyTestBean.class);

        // 下面源码分析用4.3.11.RELEASE
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
        MyTestBean bean = ac.getBean(MyTestBean.class);
//        System.out.println("打印值为：" + bean.getTestStr());

        ac.close();
    }
}
