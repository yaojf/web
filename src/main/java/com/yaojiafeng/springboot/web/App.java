package com.yaojiafeng.springboot.web;

/**
 * Created by yaojiafeng on 2018/9/8 下午1:47.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableJpaRepositories
public class App
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
