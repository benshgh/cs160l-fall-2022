package edu.sdsu.cs160l.methodrefrence;

import edu.sdsu.cs160l.institute.student.Student;
import edu.sdsu.cs160l.institute.student.TestStudents;
import edu.sdsu.cs160l.institute.Registrar;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * In class demonstration
 */
public class SingleLevelSorting {
    private final Registrar registrar;

    public SingleLevelSorting() {
        this.registrar = new Registrar();
        TestStudents.enrollDummyStudents(registrar);
    }

    /**
     * Using a class implementation
     */
    public List<Student> sortByGpa() {
        return registrar
                .getStudentsEnrolled()
                .stream()
                .sorted(new StudentGpaOrder())
                .collect(Collectors.toList());
    }

    /**
     * Using Lambda
     */
    public List<Student> sortByGpaWithLambda() {
        return registrar
                .getStudentsEnrolled()
                .stream()
                .sorted((o1, o2) -> o1.getGpa().compareTo(o2.getGpa()))
                .collect(Collectors.toList());
    }
    /**
     * Using Comparator and Lambda
     */
    public List<Student> sortByGpaWithComparatorComparing() {
        return registrar
                .getStudentsEnrolled()
                .stream()
                .sorted(Comparator.comparing(student -> student.getGpa()))
                .collect(Collectors.toList());
    }
    /**
     * Using Comparator and Method Reference
     */
    public List<Student> sortByGpaWithComparatorComparingAndMethodReference() {
        return registrar
                .getStudentsEnrolled()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    /**
     * Class implementation to compare students
     */
    private static class StudentGpaOrder implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getGpa().compareTo(o2.getGpa());
        }
    }
}
