package com.codenotfound.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import com.codenotfound.model.Academics;
import com.codenotfound.services.AcademicsService;

@Named
public class AcademicsController {

  private String firstName = "John";
  private String lastName = "Doe";
  
//  private AcademicsService AcademicsService = new  AcademicsService();
  private List<Academics> listaAcademics = new ArrayList<Academics>();
  
  @Inject
  private AcademicsService AcademicsService;

  @PostConstruct
  public void init(){
    this.listaAcademics = AcademicsService.getAcademicsList();
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
    Academics s = new Academics();
    s.setNombre(firstName + " " + lastName);
    this.listaAcademics.add(s);
    return "Hello " + firstName + " " + lastName + "!";
  }

    /**
     * @return List<Academics> return the listaAcademics
     */
    public List<Academics> getListaAcademics() {
        return listaAcademics;
    }

  

}