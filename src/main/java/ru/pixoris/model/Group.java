package ru.pixoris.model;

import io.leangen.graphql.annotations.GraphQLQuery;

public class Group {
    private final Integer id;
    private final String name;

    public Group(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @GraphQLQuery(name = "id")
    public Integer getId() {
        return id;
    }

    @GraphQLQuery(name = "name")
    public String getName() {
        return name;
    }
}
