package com.greenfox.exam.spring.Repository;

import com.greenfox.exam.spring.Model.ChoosenQuestions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChoosenQuestionRepository extends CrudRepository<ChoosenQuestions, Long> {
}
