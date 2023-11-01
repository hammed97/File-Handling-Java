package org.example.Util;

import org.example.school.entities.Teachers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TeacherUtil {
    public static List<Teachers> teachersList = new ArrayList<>();
    public void readTeacherFile() throws IOException {
        String line;
        BufferedReader reader = new BufferedReader(new FileReader("/Users/mac/Documents/GitHub/week-1-hammed97/src/main/java/org/example/school/file/staff_file.csv"));
        boolean isHeader = true;
        while ((line = reader.readLine()) !=null) {
            if (isHeader) {
                isHeader = false;
                continue;
            }
            String[] column = line.split(",", -1);
            for (int i = 0; i < column.length; i++) {
                if (column[i].isBlank()) {
                    column[i]= null;
                }
            }
            String teacherId = column[0];
            String email = column[1];
            String firstName = column[2];
            String lastName = column[3];

            Teachers teacherFile = new Teachers();
            teacherFile.setID(teacherId);
            teacherFile.setEmail(email);
            teacherFile.setFirstName(firstName);
            teacherFile.setLastName(lastName);

            teachersList.add(teacherFile);


        }
        for (Teachers file : teachersList) {
            System.out.println(file);
        }
    }

}
