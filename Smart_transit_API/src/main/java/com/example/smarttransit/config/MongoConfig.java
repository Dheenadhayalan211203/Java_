package com.example.smarttransit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Value("${MONGODB_URI}")
    private String mongoUri;

    @Override
    protected String getDatabaseName() {
        return "Smarttransit";
    }

    @Override
    public MongoClient mongoClient() {
        return MongoClients.create(mongoUri);
    }

    @Override
    protected boolean autoIndexCreation() {
        return true;
    }
}
