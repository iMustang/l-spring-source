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
		// 使用Spring 3.0.7.RELEASE版本研究
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");

        ApplicationContext ac = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
        ac.getBean("myTestBean");
    }
}
