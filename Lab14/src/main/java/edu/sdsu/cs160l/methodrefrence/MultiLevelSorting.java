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
public class MultiLevelSorting {
    private final Registrar registrar;

    public MultiLevelSorting() {
        this.registrar = new Registrar();
        TestStudents.enrollDummyStudents(registrar);
    }
    /**
     * Using a class implementation
     */
    public List<Student> sortByGpaAndName() {
        return registrar
                .getStudentsEnrolled()
                .stream()
                .sorted(new StudentGpaNameOrder())
                .collect(Collectors.toList());
    }
    /**
     * Using Lambda
     */
    public List<Student> sortByGpaWithLambda() {
        return registrar
                .getStudentsEnrolled()
                .stream()
                .sorted((o1, o2) -> {
                    int compareTo = o1.getGpa().compareTo(o2.getGpa());
                    if (compareTo == 0) { //if values are same comparison is 0
                        compareTo = o1.getName().compareTo(o2.getName());
                    }
                    return compareTo;
                })
                .collect(Collectors.toList());
    }
    /**
     * Using Comparator and Method Reference
     */
    public List<Student> sortByGpaAndNameWithComparatorComparing() {
        return registrar
                .getStudentsEnrolled()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa)
                        .thenComparing(Student::getName))
                .collect(Collectors.toList());
    }
    /**
     * Class implementation to compare students by GPA and then Name
     */
    private static class StudentGpaNameOrder implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            int compareTo = o1.getGpa().compareTo(o2.getGpa());
            if (compareTo == 0) {
                compareTo = o1.getName().compareTo(o2.getName());
            }
            return compareTo;
        }
    }

}
