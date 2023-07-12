package io.ultims.quizmgtapp.question.service;

import io.ultims.quizmgtapp.question.dto.v1.QuestionDTO;

public interface QuestionService {

    boolean isValidId(Long id);

    QuestionDTO get(Long id);
}
