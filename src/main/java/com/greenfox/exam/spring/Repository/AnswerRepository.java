package com.greenfox.exam.spring.Repository;

import com.greenfox.exam.spring.Model.Answer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {
}
