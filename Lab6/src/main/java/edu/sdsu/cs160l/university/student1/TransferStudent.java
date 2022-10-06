package edu.sdsu.cs160l.university.student1;

import edu.sdsu.cs160l.university.student1.Student;
import edu.sdsu.cs160l.university.student1.StudentLevel;
import edu.sdsu.cs160l.university.student1.StudentMajor;
import edu.sdsu.cs160l.university.student1.StudentType;

public class TransferStudent extends Student {
    public TransferStudent(Long redId, String name, Double gpa, StudentLevel studentLevel, StudentMajor studentMajor) {
        super(redId, name, gpa, studentLevel, studentMajor);
    }

    @Override
    public StudentType studentType() {
        return StudentType.TRANSFER;
    }
}
