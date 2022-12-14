package edu.sdsu.cs160l.university.course1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.sdsu.cs160l.university.course1.Course;
//TODO make this singleton
public class CS210 implements Course{
    @Override
    public String courseName() {
        return "CS210";
    }

    @Override
    public List<String> courseDescription() {
        return Arrays.asList("Software Programming","0 cost course");
    }

    @Override
    public Set<String> prerequisites() {
        return new HashSet<>(Arrays.asList("CS160","CS205"));
    }
}
