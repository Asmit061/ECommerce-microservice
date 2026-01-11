package com.ecommerce.product_service.config;


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.ecommerce.product_service.repository")
public class MongoConfig {

    @Bean
    @Primary
    public MongoClient mongoClient(){
        String uri = "mongodb+srv://Asmit06:Bw7gPpPDxRKVL3rt@cluster1.hu5l4pp.mongodb.net/?appName=Cluster1&retryWrites=true&w=majority";
        return MongoClients.create(uri);
    }
}
