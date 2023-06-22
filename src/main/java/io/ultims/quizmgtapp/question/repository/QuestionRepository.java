package io.ultims.quizmgtapp.question.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.ultims.quizmgtapp.question.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

    /**
     * Retrieves a list of questions whose category contains the specific string,
     * ignoring case sensitivity
     * 
     * @param category the string to search for the category
     * @param pageable the pagination information
     * @return the list of matching questions
     */
    List<Question> findBycategoryContainsIgnoreCase(String category, Pageable pageable);

    /**
     * Retrieves a list of questions based on a specified level
     * 
     * @param difficultyLevel the difficulty level to match the questions
     * @param pageable        the pagination information
     * @return the list of matching questions
     */
    List<Question> findByDifficultyLevel(String difficultyLevel, Pageable pageable);

    /**
     * Retrieves a list of questions based on a specified title ignoring case
     * sensitivity
     * 
     * @param title    the title to match the questions
     * @param pageable the pagination information
     * @return the list of matching questions
     */
    List<Question> findByTitleContainsIgnoreCase(String title, Pageable pageable);
}
