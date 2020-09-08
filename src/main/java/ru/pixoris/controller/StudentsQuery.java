package ru.pixoris.controller;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLQuery;
import org.springframework.stereotype.Component;
import ru.pixoris.model.Student;
import ru.pixoris.model.StudentsDB;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentsQuery {
    private static final List<Student> students = StudentsDB.getStudents();

    @GraphQLQuery(name = "getAllStudents")
    public List<Student> getAllStudents(){
        return students;
    }

    @GraphQLQuery(name = "getStudentById")
    public Student getStudentById(@GraphQLArgument(name = "id") final Integer id){
        return students
                .stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @GraphQLQuery(name = "getAllStudentsInGroup")
    public List<Student> getAllStudentsInGroup(@GraphQLArgument(name = "groupId") final Integer groupId){
        return students
                .stream()
                .filter(student -> student.getGroup().getId().equals(groupId))
                .collect(Collectors.toList());
    }
}
