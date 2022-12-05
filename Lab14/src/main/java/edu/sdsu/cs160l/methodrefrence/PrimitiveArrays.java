package edu.sdsu.cs160l.methodrefrence;

import edu.sdsu.cs160l.institute.student.Student;
import edu.sdsu.cs160l.institute.student.StudentLevel;
import edu.sdsu.cs160l.institute.student.StudentMajor;

import java.util.Arrays;
import java.util.Comparator;

public class PrimitiveArrays {
    private final Student[] students;

    public PrimitiveArrays() {
        students = new Student[10];
        students[0] = new Student(825000001L, "hmac", 3.8, StudentLevel.SENIOR, StudentMajor.COMPUTER_SCIENCE);
        students[1] = new Student(825000002L, "john", 3.7, StudentLevel.FRESHMAN, StudentMajor.BIOLOGY);
        students[2] = new Student(825000003L, "jane", 3.6, StudentLevel.SOPHOMORE, StudentMajor.COMPUTER_ENGINEERING);
        students[3] = new Student(825000001L, "will", 3.8, StudentLevel.SENIOR, StudentMajor.COMPUTER_SCIENCE);
        students[4] = new Student(825000002L, "bill", 3.7, StudentLevel.FRESHMAN, StudentMajor.BIOLOGY);
        students[5] = new Student(825000003L, "tamara", 3.6, StudentLevel.SOPHOMORE, StudentMajor.COMPUTER_ENGINEERING);
        students[6] = new Student(825000001L, "michael", 3.8, StudentLevel.SENIOR, StudentMajor.COMPUTER_SCIENCE);
        students[7] = new Student(825000002L, "dwight", 3.7, StudentLevel.FRESHMAN, StudentMajor.BIOLOGY);
        students[8] = new Student(825000003L, "jim", 3.6, StudentLevel.SOPHOMORE, StudentMajor.COMPUTER_ENGINEERING);
        students[9] = new Student(825000002L, "ryan", 3.5, StudentLevel.FRESHMAN, StudentMajor.BIOLOGY);
    }

    public Student[] sortStudentByName() {
        Arrays.sort(students, Comparator.comparing(Student::getName));
        return students;
    }

    /**
     * TODO complete function below for 1 point
     * Make sure to use method reference only
     */
    public Student[] sortByGpaInReverseOrderThenName() {
        //TODO implement you logic to sort the above student array first by their GPA in descending order then by their names;
        return students;
    }


}
