package edu.sdsu.cs160l.university.registrar1;

import edu.sdsu.cs160l.university.course1.Course;
import edu.sdsu.cs160l.university.criteria1.StudentStrategy;
import edu.sdsu.cs160l.university.registrar1.Registrar;
import edu.sdsu.cs160l.university.student1.Student;

/**
 * Thoughts, does a university have a single registrar office or multiple?
 */
public class Registrar {
    private static Registrar REGISTRAR;

    Registrar() {}

    public static Registrar getInstance(){
        if(REGISTRAR==null){
            REGISTRAR = new Registrar();
        }
        return REGISTRAR;
    }

    public void enrollStudentToClass(Student student, Course course){
        student.addCourse(course);
    }

    public boolean isStudentValid(Student student, StudentStrategy studentStrategy){
       return studentStrategy.isValid(student);
    }
}
