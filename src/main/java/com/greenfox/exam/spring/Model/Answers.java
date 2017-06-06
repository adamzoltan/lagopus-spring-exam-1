package com.greenfox.exam.spring.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Answers {

  private long id;
  private List<Answer> answers;

  public Answers(long id) {
    this.id = id;
    this.answers = new ArrayList<>();
  }

  public void addAnswer(Answer answer) {
    answers.add(answer);
  }

}
