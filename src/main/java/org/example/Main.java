package org.example;

import org.example.Util.StudentUtil;
import org.example.Util.TeacherUtil;
import org.example.school.entities.Applicants;
import org.example.school.entities.Courses;
import org.example.school.serviceImpl.SchoolServiceImpl;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Percentage marks");
//        int percentage = scanner.nextInt();
//
//        SchoolServiceImpl schoolService = new SchoolServiceImpl();
//        System.out.println(schoolService.expelStudent(percentage));
//        Applicants applicants = new Applicants();
//        applicants.setAge(14);
//        schoolService.admitApplicant(applicants);
//        Courses courses = new Courses();
//       schoolService.coursesTeacherTaught(courses);
//       schoolService.coursesStudentTakes(courses);

        System.out.println();


        StudentUtil studentUtil = new StudentUtil();
        studentUtil.readStudentFile();
        System.out.println();



//
        TeacherUtil teacherUtil = new TeacherUtil();
        teacherUtil.readTeacherFile();


    }
}