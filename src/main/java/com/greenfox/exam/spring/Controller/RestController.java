package com.greenfox.exam.spring.Controller;

import com.greenfox.exam.spring.Model.Questions;
import com.greenfox.exam.spring.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  QuestionService questionService;

  @GetMapping("/questions")
  public Questions getQuestions() {
    Questions questions = new Questions(1);
    questionService.addQuestions(questions);
    return questions;
  }

}
