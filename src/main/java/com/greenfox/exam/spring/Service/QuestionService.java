package com.greenfox.exam.spring.Service;

import com.greenfox.exam.spring.Model.Questions;
import com.greenfox.exam.spring.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

  @Autowired
  QuestionRepository questionRepository;

  public void addQuestions(Questions questions) {
    for (int i = 0; i<5; i++) {
      long r = 1 + (int)(Math.random()*questionRepository.count());
      questions.addQuestion(questionRepository.findOne(r));
    }
  }

}
