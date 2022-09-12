package com.learn.java.chapter9;

import com.learn.java.common.Bike;
import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.Optional;

public class Optional4Example {

    public static void main(String[] args) {

        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        optionalStudent.filter(p -> p.getGpa() > 3.5).ifPresent(System.out::println);

        Optional<String> r1 = optionalStudent
                .filter(p -> p.getGpa() > 3.5)
                .map(Student::getName);
        System.out.println(r1.get());

        Optional<String> name = optionalStudent
                .filter(p -> p.getGpa()>2) //Optional<Student>
                .flatMap(Student::getBike)  //Optional<Bike> //if use map() will get Optional<Optional<Bike>>
                .map(Bike::getName); //Please note w are putting getName() i.e. get bike name on (Optional<Bike>) not on Bike obj, and this is okay
        name.ifPresent(System.out::println);

    }

}
