package com.study;

public class DrawingApp {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //Shape shape = (Shape) context.getBean("shape");
        //shape.draw();
        throw new RuntimeException();

    }
    
}
