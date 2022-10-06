package edu.sdsu.cs160l.university.course1;

import java.util.List;
import java.util.Set;

public interface Course {
    String courseName();
    List<String> courseDescription();
    Set<String> prerequisites();
}
