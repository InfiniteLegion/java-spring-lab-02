package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig {
    @Value("${country1.name}")
    private String countryName1;
    @Value("${country1.population}")
    private double countryPopulation1;

    @Value("${country2.name}")
    private String countryName2;
    @Value("${country2.population}")
    private double countryPopulation2;

    @Value("${brand1.name}")
    private String brandName1;

    @Value("${brand2.name}")
    private String brandName2;

    @Value("${car1.model}")
    private String carModel1;
    @Value("${car1.color}")
    private String carColor1;

    @Value("${car2.model}")
    private String carModel2;
    @Value("${car2.color}")
    private String carColor2;

    @Value("${user1.firstName}")
    private String userFirstName1;
    @Value("${user1.lastName}")
    private String userLastName1;

    @Value("${user2.firstName}")
    private String userFirstName2;
    @Value("${user2.lastName}")
    private String userLastName2;

    @Bean
    public Country countryBean1() {
        return new Country(countryName1, countryPopulation1);
    }

    @Bean
    public Country countryBean2() {
        return new Country(countryName2, countryPopulation2);
    }

    @Bean
    public Brand brandBean1() {
        return new Brand(brandName1, countryBean1());
    }

    @Bean
    public Brand brandBean2() {
        return new Brand(brandName2, countryBean2());
    }

    @Bean
    public Car carBean1() {
        return new Car(brandBean1(), carModel1, carColor1);
    }

    @Bean
    public Car carBean2() {
        return new Car(brandBean2(), carModel2, carColor2);
    }

    @Bean
    public User userBean1() {
        return new User(userFirstName1, userLastName1, carBean1());
    }

    @Bean
    public User userBean2() {
        return new User(userFirstName2, userLastName2, carBean2());
    }
}
