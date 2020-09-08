package ru.pixoris.model;

import java.util.Arrays;
import java.util.List;

public class GroupsDB {
    public static List<Group> getGroups() {
        return Arrays.asList(
                new Group(0, "M3403"),
                new Group(1, "K4141")
        );
    }
}
