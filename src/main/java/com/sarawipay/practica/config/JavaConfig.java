package com.sarawipay.practica.config;

import com.sarawipay.practica.model.Client;
import com.sarawipay.practica.model.MainTable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public Client client() {
        return new Client();
    }

    @Bean
    public MainTable mainTable() {
        return new MainTable();
    }
}
