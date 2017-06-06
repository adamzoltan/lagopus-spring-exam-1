package com.greenfox.exam.spring.Service;

import com.greenfox.exam.spring.Model.ChoosenQuestions;
import com.greenfox.exam.spring.Model.Questions;
import com.greenfox.exam.spring.Repository.ChoosenQuestionRepository;
import com.greenfox.exam.spring.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

  @Autowired
  QuestionRepository questionRepository;
  @Autowired
  ChoosenQuestionRepository choosenQuestionRepository;

  public void addQuestions(Questions questions) {
    for (int i = 0; i<5; i++) {
      long r = 1 + (int)(Math.random()*questionRepository.count());
      questions.addQuestion(questionRepository.findOne(r));
      choosenQuestionRepository.save(new ChoosenQuestions(questionRepository.findOne(r).getId(),questionRepository.findOne(r).getQuestion()));
    }
  }

}
