package com.greenfox.exam.spring;

import com.greenfox.exam.spring.Model.Answer;
import com.greenfox.exam.spring.Model.Question;
import com.greenfox.exam.spring.Repository.AnswerRepository;
import com.greenfox.exam.spring.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaspringexamApplication implements CommandLineRunner {

	@Autowired
	QuestionRepository questionRepository;

	@Autowired
	AnswerRepository answerRepository;

	public static void main(String[] args) {
		SpringApplication.run(JavaspringexamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		questionRepository.save(new Question("When did your course start? (yyyy.mm.dd)"));
		questionRepository.save(new Question("What type of dog Barbi has?"));
		questionRepository.save(new Question("What is HerrNorbert's favourite color?"));
		questionRepository.save(new Question("How many classes are learning at Green Fox Academy at this moment?"));
		questionRepository.save(new Question("How many mentors teach at Green Fox at this moment?"));
		questionRepository.save(new Question("What was the name of the first Green Fox class?"));
		questionRepository.save(new Question("How many likes do we have on facebook?"));
		questionRepository.save(new Question("What is Tojas's horoscope?"));
		answerRepository.save(new Answer("2017.03.13"));
		answerRepository.save(new Answer("Whippet"));
		answerRepository.save(new Answer("Green"));
		answerRepository.save(new Answer("4"));
		answerRepository.save(new Answer("16"));
		answerRepository.save(new Answer("Vulpes"));
		answerRepository.save(new Answer("3300"));
		answerRepository.save(new Answer("Libra"));
	}

}
