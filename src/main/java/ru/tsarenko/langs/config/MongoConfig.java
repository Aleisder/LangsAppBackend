package ru.tsarenko.langs.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfig {

    @Value("mongo.url")
    private String mongoUrl;

    @Value("mongo.database")
    private String databaseName;

    @Bean
    public MongoClient getMongoClient() {
        return MongoClients.create(mongoUrl);
    }

    @Bean
    public MongoDatabase getMongoDatabase(MongoClient mongoClient) {
        return mongoClient.getDatabase(databaseName);
    }

}
