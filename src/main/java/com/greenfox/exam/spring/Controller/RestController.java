package com.greenfox.exam.spring.Controller;

import com.greenfox.exam.spring.Model.Question;
import com.greenfox.exam.spring.Model.Questions;
import com.greenfox.exam.spring.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  QuestionRepository questionRepository;

  @GetMapping("/questions")
  public Questions getQuestions() {
    Questions questions = new Questions();
    return questions;
  }
}
