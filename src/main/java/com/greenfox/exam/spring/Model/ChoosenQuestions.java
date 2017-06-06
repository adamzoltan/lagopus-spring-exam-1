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
public class ChoosenQuestions {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private long originalID;
  private String question;

  public ChoosenQuestions() {
  }



  public ChoosenQuestions(long originalID, String question) {
    this.originalID = originalID;
    this.question = question;
  }
}
