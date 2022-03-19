package com.learn.java.chapter1;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

import static com.learn.java.common.Common.printDivider;

public class IBiFunctionExample {

    public static void main(String[] args) {
        Predicate<Student> predicate = p -> p.getGradeLevel() >= 3.9;
        BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> studentBiFunction = (students, studentPredicate) -> {

            Map<String, Double> map = new HashMap<>();
            students.forEach(student -> {
                if(predicate.test(student)) {
                    map.put(student.getName(), student.getGpa());
                }

            });
            return map;
        };
        System.out.println(studentBiFunction.apply(StudentDataBase.getAllStudents(), predicate));
    }

}