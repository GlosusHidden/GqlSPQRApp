package ru.pixoris.model;

import io.leangen.graphql.annotations.GraphQLQuery;

public class Student {
    private final Integer id;
    private final String name;
    private final Integer age;
    private final Group group;

    public Student(Integer id, String name, Integer age, Group group) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.group = group;
    }

    @GraphQLQuery(name = "id")
    public Integer getId() {
        return id;
    }

    @GraphQLQuery(name = "name")
    public String getName() {
        return name;
    }

    @GraphQLQuery(name = "age")
    public Integer getAge() {
        return age;
    }

    @GraphQLQuery(name = "group")
    public Group getGroup() { return group; }
}
