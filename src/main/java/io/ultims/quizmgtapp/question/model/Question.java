package io.ultims.quizmgtapp.question.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "questions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Question implements Serializable {

    @Id
    @Column(name = "question_id", nullable = false)
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "question_seq", sequenceName = "question_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "question_seq")
    private Long id;

    @Column(name = "title", nullable = false, length = 500)
    private String title;

    @Column(name = "category", nullable = false, length = 100)
    private String category;

    @Column(name = "difficulty_level", nullable = false, length = 100)
    private String difficultyLevel;

    @Column(name = "first_option", nullable = false, length = 300)
    private String firstOption;

    @Column(name = "second_option", nullable = false, length = 300)
    private String secondOption;

    @Column(name = "third_option", nullable = false, length = 300)
    private String thirdOption;

    @Column(name = "fourth_option", nullable = false, length = 300)
    private String fourthOption;

    @Column(name = "answer", nullable = false, length = 300)
    private String answer;
}
