package com.learn.java.chapter10;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.Comparator;
import java.util.List;

import static com.learn.java.common.Common.printDivider;

public class CDefaultMethod3Example {

    public static void main(String[] args) {


        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

        //ONE
        List<Student> students = StudentDataBase.getAllStudents();
        //students.add(null);//Cant add null here, add in StudentDataBase.getAllStudents()
        students.sort(nameComparator);//null pointer exception as added null value, to test TWO and THREE, please commented out 21-23 lines
        System.out.println(students);
        printDivider();

        //TWO
        //nullsFirst(): put the null at the first of the list
        Comparator<Student> nullsFirstComparator = Comparator.nullsFirst(nameComparator);
        students = StudentDataBase.getAllStudents();
        //students.add(null); //Cant add null here, add in StudentDataBase.getAllStudents()
        students.sort(nullsFirstComparator);//NOT null pointer exception
        System.out.println(students);
        printDivider();

        //THREE
        //nullsLast(): put the null at the last of the list
        Comparator<Student> nullsLastComparator = Comparator.nullsLast(nameComparator);
        students = StudentDataBase.getAllStudents();
        //students.add(null); //Cant add null here, add in StudentDataBase.getAllStudents()
        students.sort(nullsLastComparator);//NOT null pointer exception
        System.out.println(students);

    }
}


