package edu.sdsu.cs160l.assignment;

import edu.sdsu.cs160l.institute.student.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodReference {
    public Student[] sortByMajorThenGpaThenNameUsingClass(Student[] students) {
        Arrays.sort(students, new MultiLevelSorter());
        return students;
    }

    public List<Student> sortByMajorThenGpaThenNameUsingLambda(List<Student> students) {
        //TODO implement your logic here to sort by Major then Gpa then Student Name using lambda syntax only (1 points)
        return null;
    }

    public List<Student> sortByMajorThenGpaThenNameUsingComparatorDotComparingAndMethodReference(List<Student> students) {
        //TODO implement your logic here to sort by Major then Gpa then Student Name using lambda syntax only (1 points)
        return null;
    }

    private static class MultiLevelSorter implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            //TODO implement your logic here to sort by Major then Gpa then Student Name (2 points)
            return 0;
        }
    }

}
