package edu.sdsu.cs160l.university.criteria1;

import edu.sdsu.cs160l.university.course1.Course;
import edu.sdsu.cs160l.university.criteria1.StudentStrategy;
import edu.sdsu.cs160l.university.student1.Student;
import edu.sdsu.cs160l.university.student1.StudentMajor;

/**
 * Advanced student strategy is a student strategy
 * A student has
 * at least 3 course and
 * at least 1 course with 2xx level and
 * at least 1 course with 3xx level and
 * student is from compsci or compengineering major
 */
public class SimpleCompStudent implements StudentStrategy {
    @Override
    public boolean isValid(Student student) {
    	return false;
    }
}
