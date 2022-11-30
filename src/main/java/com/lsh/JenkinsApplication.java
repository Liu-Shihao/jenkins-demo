package com.lsh;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseDataSource;

/**
 * @Author: LiuShihao
 * @Date: 2022/11/30 22:49
 * @Desc:
 */
@Slf4j
@SpringBootApplication
public class JenkinsApplication {
    public static void main(String[] args) {
        log.info("************ Application Start ************");
        SpringApplication.run(JenkinsApplication.class,args);
        log.info("************ Application End ************");
    }

}
