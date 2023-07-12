package io.ultims.quizmgtapp.question.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import io.ultims.quizmgtapp.question.dto.v1.QuestionDTO;
import io.ultims.quizmgtapp.question.mapper.QuestionMapper;
import io.ultims.quizmgtapp.question.mapper.QuestionMapperImpl;
import io.ultims.quizmgtapp.question.model.Question;
import io.ultims.quizmgtapp.question.repository.QuestionRepository;
import io.ultims.quizmgtapp.shared.exception.NotFoundException;

@ExtendWith(MockitoExtension.class)
class QuestionServiceTest {

    private QuestionServiceImpl underTest;

    private final QuestionMapper questionMapper = new QuestionMapperImpl();

    @Mock
    private QuestionRepository questionRepositoryStub;

    @BeforeEach
    void setUp() {
        underTest = new QuestionServiceImpl(questionRepositoryStub, questionMapper);
    }

    @Test
    void isValidId_shouldReturnFalseWhenGivenIdIsNull() {
        // Given
        Long id = null;

        // When
        boolean actual = underTest.isValidId(id);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void isValidId_shouldReturnFalseWhenGivenIdIsLessThanOrEqualToZero() {
        // Given
        Long id = -12L;

        // When
        boolean actual = underTest.isValidId(id);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void isValidId_shouldReturnTrueWhenGivenIdIsHigherThanZero() {
        // Given
        Long id = 45L;

        // When
        boolean actual = underTest.isValidId(id);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void get_shouldThrowIllegalArgumentExceptionWhenGivenIdIsInvalid() {
        // Given
        Long id = -12L;
        String message = "ID should be a non negative number, higher than zero";

        // When
        IllegalArgumentException actual = assertThrows(IllegalArgumentException.class, () -> {
            underTest.get(id);
        });

        // Then
        assertThat(actual.getMessage()).isEqualTo(message);
    }

    @Test
    void get_shouldThrowNotFoundExceptionWhenNoQuestionWithGivenIdWasFound() {
        // Given
        Long id = 52L;
        String message = "No Question with ID " + id + " was found";
        Mockito.when(questionRepositoryStub.findById(id)).thenReturn(Optional.empty());

        // When
        NotFoundException actual = assertThrows(NotFoundException.class, () -> {
            underTest.get(id);
        });

        // Then
        assertThat(actual.getMessage()).isEqualTo(message);
    }

    @Test
    void get_shouldReturnQuestionFoundWithGivenId() {
        // Given
        Long id = 45L;
        Question question = Question.builder()
                .id(id)
                .build();

        Mockito.when(questionRepositoryStub.findById(id)).thenReturn(Optional.of(question));

        // When
        QuestionDTO actual = underTest.get(id);
        QuestionDTO expected = questionMapper.toDto(question);

        // Then
        assertThat(actual).isEqualTo(expected);
    }

}
