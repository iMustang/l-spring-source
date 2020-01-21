package com.xmustang;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import lombok.Data;

/**
 * MyTestBean
 * 此Bean通过xml方式配置又Spring管理，@Data是lombok的注解
 */
@Data
public class MyTestBean implements ApplicationContextAware, BeanNameAware, BeanFactoryAware,
        InitializingBean, DisposableBean {
    private String testStr;

    public MyTestBean() {
        System.out.println("MyTestBean构造方法执行");
    }

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        System.out.println("MyTestBean的setTestStr(String testStr)执行");
        this.testStr = testStr;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware");
    }

    public void init() {
        System.out.println("xml中init-method");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware");
        // 可以通过BeanFactory访问Spring容器
//        beanFactory.getBean();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware");
        // 可以通过ApplicationContext访问Spring容器
//        applicationContext.getBean();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean中afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean中destroy()");
    }

    public void down() {
        System.out.println("xml中destroy-method");
    }
}
