package com.greenfox.exam.spring.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Answer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String answer;

  public Answer() {
  }

  public Answer(String answer) {
    this.answer = answer;
  }

}
