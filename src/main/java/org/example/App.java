package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Country country1 = (Country) context.getBean("countryBean1");
        Country country2 = (Country) context.getBean("countryBean2");

        Brand brand1 = (Brand) context.getBean("brandBean1");
        Brand brand2 = (Brand) context.getBean("brandBean2");

        Car car1 = (Car) context.getBean("carBean1");
        Car car2 = (Car) context.getBean("carBean2");

        User user1 = (User) context.getBean("userBean1");
        User user2 = (User) context.getBean("userBean2");

        System.out.println(country1);
        System.out.println(country2);
        System.out.println(brand1);
        System.out.println(brand2);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(user1);
        System.out.println(user2);
    }
}
