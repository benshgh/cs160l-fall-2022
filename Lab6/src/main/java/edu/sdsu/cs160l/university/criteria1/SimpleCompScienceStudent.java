package edu.sdsu.cs160l.university.criteria1;

import edu.sdsu.cs160l.university.course1.Course;
import edu.sdsu.cs160l.university.criteria1.StudentStrategy;
import edu.sdsu.cs160l.university.student1.Student;
import edu.sdsu.cs160l.university.student1.StudentMajor;

/**
 * Simple graduation criteria is a graduation strategy
 * A student has
 * at least 2 course and
 * at least 1 course with 2xx level and
 * is from compsci major
 */
public class SimpleCompScienceStudent implements StudentStrategy {
    @Override
    public boolean isValid(Student student) {
        boolean satisfiesCourseCount = student.getCoursesEnrolled().size() >= 2;
        boolean satisfiesCourseLevel = false;
        boolean satisfiesMajor = student.getStudentMajor() == StudentMajor.computersci;
        for (Course course : student.getCoursesEnrolled()) {
            if (course.courseName().contains("2")) {
                satisfiesCourseLevel = true;
                break;
            }
        }

        return satisfiesCourseCount && satisfiesCourseLevel && satisfiesMajor;
    }
}
