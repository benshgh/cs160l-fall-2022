package edu.sdsu.cs160l.methodrefrence;

import edu.sdsu.cs160l.institute.student.Student;
import edu.sdsu.cs160l.institute.student.TestStudents;
import edu.sdsu.cs160l.institute.Registrar;

import java.util.function.Function;

public class LambdaToMethodReference {
    private final Registrar registrar;

    public LambdaToMethodReference() {
        this.registrar = new Registrar();
        TestStudents.enrollDummyStudents(registrar);
    }

    public void printEachStudent() {
        registrar
                .getStudentsEnrolled()
                .forEach(student -> System.out.println(student));
    }

    public void printEachStudentWithMethodReference() {
        registrar
                .getStudentsEnrolled()
                .forEach(System.out::println);
    }

    public void whenCanYouNotUseMethodReference() {
        registrar
                .getStudentsEnrolled()
                .forEach(student -> System.out.println(student.getName()));
    }

    public void dynamicPrinter(Function<Student, ?> valueExtractor) {
        registrar
                .getStudentsEnrolled()
                .stream()
                .limit(1)
                .forEach(student -> System.out.println(valueExtractor.apply(student)));
    }

}
