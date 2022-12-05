package edu.sdsu.cs160l.assignment;

import edu.sdsu.cs160l.exceptions.ClassFullException;
import edu.sdsu.cs160l.exceptions.StudentAlreadyEnrolledException;
import edu.sdsu.cs160l.institute.Registrar;
import edu.sdsu.cs160l.institute.student.Student;
import edu.sdsu.cs160l.institute.student.StudentLevel;
import edu.sdsu.cs160l.institute.student.StudentMajor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


public class MethodReferenceTest {
    private List<Student> students;
    private MethodReference methodReference;

    @BeforeEach
    public void init() {
        Registrar registrar = new Registrar();
        Student hmac = new Student(825000001L, "hmac", 3.8, StudentLevel.SENIOR, StudentMajor.COMPUTER_SCIENCE);
        Student john = new Student(825000002L, "john", 3.7, StudentLevel.FRESHMAN, StudentMajor.BIOLOGY);
        Student jane = new Student(825000003L, "jane", 3.6, StudentLevel.SOPHOMORE, StudentMajor.COMPUTER_ENGINEERING);
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
        try {
            registrar.enrollStudent("CS160L", hmac);
            registrar.enrollStudent("CS210", hmac);
            registrar.enrollStudent("CS310", hmac);
            registrar.enrollStudent("CS160L", jane);
            registrar.enrollStudent("CS210", jane);
            registrar.enrollStudent("CS160L", john);
            registrar.enrollStudent("BO170", john);
            registrar.enrollStudent("CE150", john);
        } catch (ClassFullException | StudentAlreadyEnrolledException e) {
            e.printStackTrace();
        }
        students = registrar.getStudentsEnrolled();
        methodReference = new MethodReference();
    }

    /**
     * Dummy Test
     */
    @Test
    public void printEnrolledStudents() {
        students
                .forEach(System.out::println);
    }

    @Test
    public void testByClassComparator() {
        Student[] studentArray = students.toArray(new Student[0]);
        methodReference.sortByMajorThenGpaThenNameUsingClass(studentArray);
        Arrays.stream(studentArray)
                .forEach(System.out::println);
    }

    @Test
    public void testByLambda() {
        methodReference
                .sortByMajorThenGpaThenNameUsingLambda(students)
                .forEach(System.out::println);
    }

    @Test
    public void testByComparatorAndMethodReference() {
        methodReference
                .sortByMajorThenGpaThenNameUsingComparatorDotComparingAndMethodReference(students)
                .forEach(System.out::println);
    }


}
