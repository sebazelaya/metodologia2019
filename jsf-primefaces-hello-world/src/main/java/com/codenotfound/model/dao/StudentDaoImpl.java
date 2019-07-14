package com.codenotfound.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.codenotfound.model.Student;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("repositoryA")
public class StudentDaoImpl implements StudentDao {

    //@Override
    public List<Student> findAll() {
        List<Student> list = new ArrayList<Student>();
        Student student = null;
        String data = this.readFile();
        for (String nombreStudiante : data.split(";")) {
            student = new Student();
            student.setNombre(nombreStudiante.trim());
            list.add(student);
        }
        return list;
    }

    private String readFile()  {
        String data = "";
        try {
            FileInputStream fis = new FileInputStream("data/students.txt");
            data = IOUtils.toString(fis, "UTF-8");
            System.out.println(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
    
}