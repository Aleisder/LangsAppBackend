package ru.tsarenko.server.config;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {

    @Value("${mongo.url}")
    private String mongoUrl;

    @Value("${mongo.database}")
    private String databaseName;

    @Bean
    public ConnectionString getConnectionString() {
        return new ConnectionString(mongoUrl);
    }

    @Bean
    public MongoClient getMongoClient(ConnectionString connectionString) {
        return MongoClients.create(connectionString);
    }

    @Bean
    public MongoTemplate getMongoTemplate(MongoClient mongoClient) {
        return new MongoTemplate(mongoClient, databaseName);
    }

}
