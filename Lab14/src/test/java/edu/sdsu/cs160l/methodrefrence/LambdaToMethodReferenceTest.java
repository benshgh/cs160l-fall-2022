package edu.sdsu.cs160l.methodrefrence;

import edu.sdsu.cs160l.institute.student.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LambdaToMethodReferenceTest {
    private LambdaToMethodReference lambdaToMethodReference;

    @BeforeEach
    void setUp() {
        lambdaToMethodReference = new LambdaToMethodReference();
    }

    @Test
    void printEachStudent() {
        lambdaToMethodReference.printEachStudent();
    }

    @Test
    void printEachStudentWithMethodReference() {
        System.out.println("Running Print");
        lambdaToMethodReference.printEachStudentWithMethodReference();
        System.out.println("End Print");
    }

    @Test
    void whenCanYouNotUseMethodReference() {
        System.out.println("Cannot use method reference");
        lambdaToMethodReference.whenCanYouNotUseMethodReference();
        System.out.println("End Cannot use method reference");
    }

    @Test
    void dynamicPrinter() {
        System.out.println("Printing GPA");
        lambdaToMethodReference.dynamicPrinter(student -> student.getGpa());
        // OR you can use method reference -> lambdaToMethodReference.dynamicPrinter(Student::getGpa);
        System.out.println("Printing Major");
        lambdaToMethodReference.dynamicPrinter(Student::getMajor);
        System.out.println("Printing Level");
        lambdaToMethodReference.dynamicPrinter(Student::getLevel);
    }
}
