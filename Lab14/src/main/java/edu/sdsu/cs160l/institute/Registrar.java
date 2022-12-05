package edu.sdsu.cs160l.institute;

import edu.sdsu.cs160l.exceptions.ClassFullException;
import edu.sdsu.cs160l.exceptions.NoSuchCourseException;
import edu.sdsu.cs160l.exceptions.StudentAlreadyEnrolledException;
import edu.sdsu.cs160l.institute.student.Student;
import edu.sdsu.cs160l.institute.student.StudentMajor;

import java.util.*;
import java.util.stream.Collectors;

public class Registrar {
    private final Map<String, Course> courseList;
    private final List<String> validCourseList;

    public Registrar() {
        courseList = new HashMap<>();
        courseList.put("CS210", new Course("CS210", 3));
        courseList.put("CS310", new Course("CS310", 3));
        courseList.put("BO170", new Course("BO170", 1));
        courseList.put("BO240", new Course("BO240", 3));
        courseList.put("MT144", new Course("MT144", 2));
        courseList.put("MT251", new Course("MT251", 3));
        courseList.put("CS410", new Course("CS410", 3));
        courseList.put("CS160L", new Course("CS160L", 1));
        courseList.put("CE150", new Course("CE150", 3));
        validCourseList = Collections.unmodifiableList(new ArrayList<>(courseList.keySet()));
    }

    public List<String> availableCourseNames() {
        return validCourseList;
    }

    public void enrollStudent(String courseName, Student s) throws ClassFullException, NoSuchCourseException, StudentAlreadyEnrolledException {
        if (isNotValidCourse(courseName)) {
            throw new NoSuchCourseException("No course by the name " + courseName + " present, are you sure you have the right course?");
        }

        Course course = courseList.get(courseName);
        course.addStudent(s);

    }

    /**
     * In class demonstration
     */
    public List<Student> getStudentsEnrolled(StudentMajor major, String courseNameStartWith) {
        return courseList
                .entrySet() // Map.Entry<String, Course>
                .stream() // Stream<Map.Entry<String, Course>>
                .filter(entrySet -> entrySet.getKey().startsWith(courseNameStartWith)) // Stream<Map.Entry<String, Course>>
                .map(entrySet -> entrySet.getValue().getStudentsEnrolled())// Stream<List<Student>>
                .flatMap(students -> students.stream()) // Stream<Student> Flattens List<Student> to Student so [[1,2],[3,4]] -> [1,2,3,4]
                .filter(student -> student.getMajor() == major) // Stream<Student>
                .distinct() //  Stream<Student> returns unique stream of students
                .collect(Collectors.toList()); // List<Student>
    }

    /**
     * TODO convert all possible lambdas to method reference
     */
    public List<Student> getStudentsEnrolled() {
        return courseList
                .entrySet() // Map.Entry<String, Course>
                .stream() // Stream<Map.Entry<String, Course>>
                .map(entrySet -> entrySet.getValue()) //Stream<Course>
                .map(course -> course.getStudentsEnrolled()) //Stream<List<Student>>
                .flatMap(students -> students.stream()) // Stream<Student> Flattens List<Student> to Student so [[1,2],[3,4]] -> [1,2,3,4]
                .distinct() //  Stream<Student> returns unique stream of students
                .collect(Collectors.toList()); // List<Student>
    }

    public List<Double> getStudentsGpa(StudentMajor major, String courseNameStartWith) {
        return null;
    }


    /**
     * TODO convert all possible lambdas to method reference
     */
    public Double getAverageGrade(StudentMajor major, String courseName) {
        return courseList
                .entrySet()
                .stream()
                .filter(entrySet -> entrySet.getKey().equals(courseName))
                .map(entrySet -> entrySet.getValue())
                .map(course -> course.getStudentsEnrolled())
                .flatMap(students -> students.stream())
                .mapToDouble(student -> student.getGpa())
                .average()
                .orElse(0.0);
    }

    public List<Long> topNStudentRedIdsWithHighestScoreInEachCourse(int n) {
        return null;
    }

    public Double averageCourseUnitsByAllStudentsAcrossAllCourse() {
        return null;
    }

    public Double averageCourseUnitsByAllStudentsAcrossAllNonComputerCourse() {
        return null;
    }

    private boolean isNotValidCourse(String courseName) {
        return !validCourseList.contains(courseName);
    }
}
