package org.example.Util;

import org.example.school.entities.Students;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentUtil {
    public static List<Students> studentsList = new ArrayList<>();

    public void readStudentFile() throws IOException {
        String line;
        BufferedReader readFile = new BufferedReader(new FileReader("/Users/mac/Documents/GitHub/week-1-hammed97/src/main/java/org/example/school/file/student_file.csv"));

        boolean isHeader = true;
        while ((line = readFile.readLine()) !=null) {
            if (isHeader) {
                isHeader = false;
                continue;
            }
            String[] column = line.split("," , -1);
            for (int i =0; i < column.length; i++) {
                if (column[i].isBlank()) {
                    column[i] = null;
                }
            }
            String studentId = column[0];
            String firstName = column[1];
            String lastName = column[2];
            Integer gradeLevel = Integer.valueOf(column[3]);
            String email = column[4];
            String guardianEmail1 = column[5];
            String guardianEmail2 = column[6];
            String isArchived = column[7];
            String isDeleted = column[8];

            Students studentFile = new Students();
            studentFile.setStudentId(studentId);
            studentFile.setFirstName(firstName);
            studentFile.setLastName(lastName);
            studentFile.setGradeLevel(gradeLevel);
            studentFile.setEmail(email);
            studentFile.setGuardianEmail1(guardianEmail1);
            studentFile.setGuardianEmail2(guardianEmail2);
            studentFile.setIsArchived(isArchived);
            studentFile.setIsDeleted(isDeleted);

            studentsList.add(studentFile);
        }
        for(Students dataFile: studentsList) {
            System.out.println(dataFile);
        }
    }

}









