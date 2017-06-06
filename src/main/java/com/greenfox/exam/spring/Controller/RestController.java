package com.greenfox.exam.spring.Controller;

import com.greenfox.exam.spring.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  QuestionRepository questionRepository;

}
