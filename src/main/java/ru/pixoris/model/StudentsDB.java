package ru.pixoris.model;

import java.util.Arrays;
import java.util.List;

public class StudentsDB {
    private static Group groupById(Integer id) {
        return GroupsDB
                .getGroups()
                .stream()
                .filter(group -> group.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public static List<Student> getStudents() {
        return Arrays.asList(
                new Student(0, "Sasha", 12, groupById(1)),
                new Student(1, "Harry", 15, groupById(1)),
                new Student(2, "Tomas", 10, groupById(2)),
                new Student(3, "Alex", 7, groupById(2)),
                new Student(4, "Nikita", 17, groupById(1))
        );
    }
}
