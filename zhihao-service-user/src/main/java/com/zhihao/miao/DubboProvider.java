package com.zhihao.miao;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;

public class DubboProvider {
    private static final Log log = LogFactory.getLog(DubboProvider.class);

    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
            context.start();
        } catch (Exception e) {
            log.error("== DubboProvider context start error:", e);
        }
        synchronized (DubboProvider.class) {
            while (true) {
                try {
                    DubboProvider.class.wait();
                } catch (InterruptedException e) {
                    log.error("== synchronized error:", e);
                }
            }
        }

    }
}
