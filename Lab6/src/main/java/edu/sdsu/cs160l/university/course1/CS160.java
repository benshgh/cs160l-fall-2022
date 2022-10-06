package edu.sdsu.cs160l.university.course1;

import java.util.*;

import edu.sdsu.cs160l.university.course1.Course;
//TODO make this singleton
public class CS160 implements Course{
    @Override
    public String courseName() {
        return "CS160";
    }

    @Override
    public List<String> courseDescription() {
        return Arrays.asList("Intermediary Java Programming");
    }

    @Override
    public Set<String> prerequisites() {
        return new HashSet<>(Collections.singletonList("CS150"));
    }
}
