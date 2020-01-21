package com.xmustang;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * MyBeanFactoryPostProcessor
 *
 * @author xMustang
 * @version 1.0
 * 2020/1/21 4:50 下午
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor中postProcessBeanFactory()");
        BeanDefinition bd = beanFactory.getBeanDefinition("myTestBean");
        MutablePropertyValues pv = bd.getPropertyValues();
        if (pv.contains("testStr")) {
            pv.addPropertyValue("testStr", "在BeanFactoryPostProcessor中修改之后的备忘信息");
//            System.out.println("替换属性值");
        }
    }
}
