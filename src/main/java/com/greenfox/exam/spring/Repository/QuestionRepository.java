package com.greenfox.exam.spring.Repository;

import com.greenfox.exam.spring.Model.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Long> {
}
