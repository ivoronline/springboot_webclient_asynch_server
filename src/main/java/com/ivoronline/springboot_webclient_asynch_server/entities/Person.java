package com.ivoronline.springboot_webclient_asynch_server.entities;

public class Person {

  //PROPERTIES
  public Integer id;
  public String  name;
  public Integer age;

  //CONSTRUCTOR
  public Person(Integer id, String name, Integer age) {  //To easily create Person
    this.id   = id;
    this.name = name;
    this.age  = age;
  }

}
