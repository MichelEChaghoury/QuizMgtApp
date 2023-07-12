package io.ultims.quizmgtapp.question.service;

import org.springframework.stereotype.Service;

import io.ultims.quizmgtapp.question.dto.v1.QuestionDTO;
import io.ultims.quizmgtapp.question.mapper.QuestionMapper;
import io.ultims.quizmgtapp.question.model.Question;
import io.ultims.quizmgtapp.question.repository.QuestionRepository;
import io.ultims.quizmgtapp.shared.exception.NotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;
    private final QuestionMapper questionMapper;

    @Override
    public boolean isValidId(Long id) {
        return id != null && id > 0;
    }

    @Override
    public QuestionDTO get(Long id) {

        if (!isValidId(id)) {
            throw new IllegalArgumentException("ID should be a non negative number, higher than zero");
        }

        Question question = questionRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("No Question with ID " + id + " was found"));

        return questionMapper.toDto(question);
    }

}
