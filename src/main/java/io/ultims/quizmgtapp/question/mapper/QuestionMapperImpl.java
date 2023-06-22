package io.ultims.quizmgtapp.question.mapper;

import org.springframework.stereotype.Component;

import io.ultims.quizmgtapp.question.dto.v1.CreateQuestionDTO;
import io.ultims.quizmgtapp.question.dto.v1.QuestionDTO;
import io.ultims.quizmgtapp.question.dto.v1.UpdateQuestionDTO;
import io.ultims.quizmgtapp.question.model.Question;

@Component
public class QuestionMapperImpl implements QuestionMapper {

    @Override
    public QuestionDTO toDto(Question question) {
        return QuestionDTO.builder()
                .id(question.getId())
                .title(question.getTitle())
                .category(question.getCategory())
                .difficultyLevel(question.getDifficultyLevel())
                .firstOption(question.getFirstOption())
                .secondOption(question.getSecondOption())
                .thirdOption(question.getThirdOption())
                .fourthOption(question.getFourthOption())
                .answer(question.getAnswer())
                .build();
    }

    @Override
    public Question toEntity(QuestionDTO questionDTO) {
        return Question.builder()
                .id(questionDTO.getId())
                .title(questionDTO.getTitle())
                .category(questionDTO.getCategory())
                .difficultyLevel(questionDTO.getDifficultyLevel())
                .firstOption(questionDTO.getFirstOption())
                .secondOption(questionDTO.getSecondOption())
                .thirdOption(questionDTO.getThirdOption())
                .fourthOption(questionDTO.getFourthOption())
                .answer(questionDTO.getAnswer())
                .build();
    }

    @Override
    public Question toEntity(CreateQuestionDTO questionDTO) {
        return Question.builder()
                .title(questionDTO.getTitle())
                .category(questionDTO.getCategory())
                .difficultyLevel(questionDTO.getDifficultyLevel())
                .firstOption(questionDTO.getFirstOption())
                .secondOption(questionDTO.getSecondOption())
                .thirdOption(questionDTO.getThirdOption())
                .fourthOption(questionDTO.getFourthOption())
                .answer(questionDTO.getAnswer())
                .build();
    }

    @Override
    public Question toEntity(Long id, UpdateQuestionDTO questionDTO) {
        return Question.builder()
                .id(id)
                .title(questionDTO.getTitle())
                .category(questionDTO.getCategory())
                .difficultyLevel(questionDTO.getDifficultyLevel())
                .firstOption(questionDTO.getFirstOption())
                .secondOption(questionDTO.getSecondOption())
                .thirdOption(questionDTO.getThirdOption())
                .fourthOption(questionDTO.getFourthOption())
                .answer(questionDTO.getAnswer())
                .build();
    }

    @Override
    public QuestionDTO toDto(Long id, UpdateQuestionDTO questionDTO) {
        return QuestionDTO.builder()
                .id(id)
                .title(questionDTO.getTitle())
                .category(questionDTO.getCategory())
                .difficultyLevel(questionDTO.getDifficultyLevel())
                .firstOption(questionDTO.getFirstOption())
                .secondOption(questionDTO.getSecondOption())
                .thirdOption(questionDTO.getThirdOption())
                .fourthOption(questionDTO.getFourthOption())
                .answer(questionDTO.getAnswer())
                .build();
    }

}
