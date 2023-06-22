package io.ultims.quizmgtapp.question.dto.v1;

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
public class UpdateQuestionDTO {

    private final String title;

    private final String category;

    private final String difficultyLevel;

    private final String firstOption;

    private final String secondOption;

    private final String thirdOption;

    private final String fourthOption;

    private final String answer;
}
