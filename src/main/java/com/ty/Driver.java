package com.ty;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("mySpring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Fan f = (Fan) beanFactory.getBean("myFan");
		f.run();
		
		Pen p=(Pen)beanFactory.getBean("myPen");
		p.write();
	}
}
