package ru.pixoris.controller;

import io.leangen.graphql.annotations.GraphQLQuery;
import org.springframework.stereotype.Component;
import ru.pixoris.model.Group;
import ru.pixoris.model.GroupsDB;

import java.util.List;

@Component
public class GroupsQuery {
    private final List<Group> groups = GroupsDB.getGroups();

    @GraphQLQuery(name = "getAllGroups")
    public List<Group> getAllGroups(){
        return groups;
    }

}
