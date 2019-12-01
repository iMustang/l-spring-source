package com.xmustang;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * BeanFactoryTest
 * description:
 */
public class BeanFactoryTest {
    @Test
    public void testSimpleLoad() {
        // 下面源码分析用3.0.7.RELEASE
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        MyTestBean myTestBean = bf.getBean(MyTestBean.class);

        // 下面源码分析用4.3.11.RELEASE
        ApplicationContext ac = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
        MyTestBean bean = ac.getBean(MyTestBean.class);

    }
}
