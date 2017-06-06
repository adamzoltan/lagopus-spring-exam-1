package com.greenfox.exam.spring.Controller;

import com.greenfox.exam.spring.Model.*;
import com.greenfox.exam.spring.Repository.ChoosenQuestionRepository;
import com.greenfox.exam.spring.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  QuestionService questionService;
  @Autowired
  ChoosenQuestionRepository choosenQuestionRepository;

  @GetMapping("/questions")
  public Questions getQuestions() {
    Questions questions = new Questions(1);
    questionService.addQuestions(questions);
    return questions;
  }

  @PostMapping("/answer")
  public ProjectList postAnswers(@RequestBody Answers answers) {
    int correctAnswers = 0;
    for(int i = 1; i <=5; i++) {
      if (choosenQuestionRepository.findOne((long) i).getQuestion().equals(answers.getAnswers().get(i))) {
        correctAnswers ++;
      }
    }
      if (correctAnswers == 5) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject("https://springexamserver.herokuapp.com/projects/sabers", "request", ProjectList.class);
    } else return new ProjectList();
  }

}
