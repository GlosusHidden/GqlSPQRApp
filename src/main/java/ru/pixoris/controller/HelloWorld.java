package ru.pixoris.controller;

import io.leangen.graphql.annotations.GraphQLQuery;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    @GraphQLQuery(name = "helloWorld", description = "My greeting to Everyone")
    public String getHello() {
        return "Hello World from GraphQL SPQR";
    }
}
