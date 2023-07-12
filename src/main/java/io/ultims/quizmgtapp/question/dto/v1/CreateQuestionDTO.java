package io.ultims.quizmgtapp.question.dto.v1;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class CreateQuestionDTO implements Serializable {

    @NotNull
    @NotEmpty
    @NotBlank
    @Length(min = 10, max = 500, message = "Title must be between 10 and 500 Characters")
    private final String title;

    @NotNull
    @NotEmpty
    @NotBlank
    @Length(min = 10, max = 100, message = "Category must be between 10 and 100 Characters")
    private final String category;

    @NotNull
    @NotEmpty
    @NotBlank
    @Length(min = 10, max = 100, message = "Difficulty Level must be between 10 and 100 Characters")
    private final String difficultyLevel;

    @NotNull
    @NotEmpty
    @NotBlank
    @Length(min = 10, max = 300, message = "Option must be between 10 and 300 Characters")
    private final String firstOption;

    @NotNull
    @NotEmpty
    @NotBlank
    @Length(min = 10, max = 300, message = "Option must be between 10 and 300 Characters")
    private final String secondOption;

    @NotNull
    @NotEmpty
    @NotBlank
    @Length(min = 10, max = 300, message = "Option must be between 10 and 300 Characters")
    private final String thirdOption;

    @NotNull
    @NotEmpty
    @NotBlank
    @Length(min = 10, max = 300, message = "Option must be between 10 and 300 Characters")
    private final String fourthOption;

    @NotNull
    @NotEmpty
    @NotBlank
    @Length(min = 10, max = 300, message = "Answer must be between 10 and 300 Characters")
    private final String answer;
}
