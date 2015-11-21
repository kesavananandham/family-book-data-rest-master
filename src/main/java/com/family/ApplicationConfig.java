package com.family;

import com.mongodb.Mongo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by kesavan on 11/21/2015.
 */
@Configuration
@EnableMongoRepositories
public class ApplicationConfig extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "fb";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new Mongo();
    }
}
