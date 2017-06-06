package com.greenfox.exam.spring.Repository;

import com.greenfox.exam.spring.Model.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {

}
