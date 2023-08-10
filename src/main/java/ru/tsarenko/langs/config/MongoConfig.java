package ru.tsarenko.langs.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.tsarenko.langs.util.SyllabusCodec;

import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

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
    public CodecRegistry getSyllabusCodec() {
        return fromRegistries(
                CodecRegistries.fromCodecs(new SyllabusCodec()),
                MongoClientSettings.getDefaultCodecRegistry()
        );
    }

    @Bean
    public MongoClientSettings getMongoClientSettings(
            ConnectionString connectionString,
            CodecRegistry codecRegistry
    ) {
        return MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .codecRegistry(codecRegistry)
                .build();
    }

    @Bean
    public MongoClient getMongoClient(MongoClientSettings settings) {
        return MongoClients.create(settings);
    }

    @Bean
    public MongoDatabase getMongoDatabase(MongoClient client) {
        return client.getDatabase(databaseName);
    }

}
