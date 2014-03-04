package com.regs.config;

import com.regs.core.service.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by home on 04.03.14.
 */

@Configuration
public class CoreConfig {

    @Bean
    public PersonService createService() {
        return new PersonService();
    }

//    @Bean
//    public PersonService createService(OrdersRepository repo) {
//        return new PersonService();
//    }
//
//    @Bean
//    public OrdersRepository createRepo() {
//        return new OrdersMemoryRepository(new HashMap<UUID, Order>());
//    }
}