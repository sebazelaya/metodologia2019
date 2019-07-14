package com.codenotfound.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.codenotfound.model.Academics;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;

@Component("repositoryB")
public class AcademicsDaoImpl implements AcademicsDao {

    //@Override
    public List<Academics> findAll() {
        List<Academics> list = new ArrayList<Academics>();
        Academics Academics = null;
        String data = this.readFile();
        for (String nombreAcademico : data.split(";")) {
            Academics = new Academics();
            Academics.setNombre(nombreAcademico.trim());
            list.add(Academics);
        }
        return list;
    }

    private String readFile()  {
        String data = "";
        try {
            FileInputStream fis = new FileInputStream("data/academics.txt");
            data = IOUtils.toString(fis, "UTF-8");
            System.out.println(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
    
}