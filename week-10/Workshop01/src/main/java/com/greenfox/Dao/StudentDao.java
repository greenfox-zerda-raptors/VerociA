package com.greenfox.Dao;

import com.greenfox.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Verőci Ádám on 2017.01.05..
 */

@Repository
public class StudentDao {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1,"Rudi", "CS" ));
                put(2, new Student(2, "Anna", "Japanese"));
                put(3, new Student(3, "Marci", "Math"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public Student getStudentById(int id){
        return this.students.get(id);
    }
}