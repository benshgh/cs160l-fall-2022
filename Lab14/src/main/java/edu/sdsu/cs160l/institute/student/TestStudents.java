package edu.sdsu.cs160l.institute.student;

import edu.sdsu.cs160l.exceptions.ClassFullException;
import edu.sdsu.cs160l.exceptions.StudentAlreadyEnrolledException;
import edu.sdsu.cs160l.institute.Registrar;

public class TestStudents {
    public static void enrollDummyStudents(Registrar registrar) {
        int i = 1;
        for (StudentLevel level : StudentLevel.values()) {
            for (StudentMajor major : StudentMajor.values()) {
                Student student = new Student(825000003L + i, "Name" + i, (3.0 + ((i % 10) / 10.0)), level, major);
                i++;
                for (String courseName : registrar.availableCourseNames()) {
                    try {
                        registrar.enrollStudent(courseName, student);
                    } catch (ClassFullException | StudentAlreadyEnrolledException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
