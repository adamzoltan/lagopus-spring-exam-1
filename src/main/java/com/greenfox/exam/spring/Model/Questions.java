package com.greenfox.exam.spring.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Questions {

  private long id;
  private List <Question> questions;

  public Questions() {
  }

  public Questions(long id, List<Question> questions) {
    this.id = id;
    this.questions = questions;
  }

}