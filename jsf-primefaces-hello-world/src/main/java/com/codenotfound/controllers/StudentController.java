package com.codenotfound.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import com.codenotfound.model.Student;
import com.codenotfound.services.StudentService;

@Named
public class StudentController {

  private String firstName = "John";
  private String lastName = "Doe";
  
//  private StudentService studentService = new  StudentService();
  private List<Student> listaStudent = new ArrayList<Student>();
  
  @Inject
  private StudentService studentService;

  @PostConstruct
  public void init(){
    this.listaStudent = studentService.getStudentList();
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String showGreeting() {
    Student s = new Student();
    s.setNombre(firstName + " " + lastName);
    this.listaStudent.add(s);
    return "Hello " + firstName + " " + lastName + "!";
  }

    /**
     * @return List<Student> return the listaStudent
     */
    public List<Student> getListaStudent() {
        return listaStudent;
    }

  

}
