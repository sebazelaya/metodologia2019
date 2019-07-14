package com.codenotfound.model.dao;

import java.util.List;

import com.codenotfound.model.Student;

public interface StudentDao{
    public List<Student> findAll();
}