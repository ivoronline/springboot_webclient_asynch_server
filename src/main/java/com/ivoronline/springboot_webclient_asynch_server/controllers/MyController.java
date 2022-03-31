package com.ivoronline.springboot_webclient_asynch_server.controllers;

import com.ivoronline.springboot_webclient_asynch_server.entities.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

  //===============================================================
  // GET TEXT MONO
  //===============================================================
  @RequestMapping("GetTextMono")
  Mono<String> getTextMono() throws InterruptedException {

    //SLEEP
    Thread.sleep(5000);

    //RETURN PERSON
    return Mono.just("Hello from Controller");

  }

  //===============================================================
  // GET PERSON MONO
  //===============================================================
  @RequestMapping("GetPersonMono")
  Mono<Person> getPerson() throws InterruptedException {

    //SLEEP
    Thread.sleep(5000);

    //RETURN PERSON
    return Mono.just(new Person(1, "Jill", 30));

  }

  //===============================================================
  // GET PERSONS FLUX
  //===============================================================
  @RequestMapping("GetPersonsFlux")
  Flux<Person> getPersonsFlux() throws InterruptedException {

    //SLEEP
    Thread.sleep(10000);

    //CREATE PERSONS
    Person person1 = new Person(2, "John", 40);
    Person person2 = new Person(3, "Bill", 50);

    //CREATE LIST
    List<Person> persons = new ArrayList();
                 persons.add(person1);
                 persons.add(person2);

    //RETURN PERSONS
    return Flux.fromIterable(persons);

  }

}


