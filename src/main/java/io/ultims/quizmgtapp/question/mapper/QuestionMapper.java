package io.ultims.quizmgtapp.question.mapper;

import io.ultims.quizmgtapp.question.dto.v1.CreateQuestionDTO;
import io.ultims.quizmgtapp.question.dto.v1.QuestionDTO;
import io.ultims.quizmgtapp.question.dto.v1.UpdateQuestionDTO;
import io.ultims.quizmgtapp.question.model.Question;

/**
 *
 * Mapper interface for converting between Question entities and DTOs.
 */
public interface QuestionMapper {

    /**
     *
     * Converts a Question entity to a QuestionDTO.
     *
     * @param question the entity to convert
     * @return the corresponding DTO
     */
    QuestionDTO toDto(Question question);

    /**
     *
     * Converts a QuestionDTO to an entity.
     *
     * @param questionDTO the DTO to convert
     * @return the corresponding Entity
     */

    Question toEntity(QuestionDTO questionDTO);

    /**
     *
     * Converts a DTO to an entity.
     *
     * @param questionDTO the DTO to convert
     * @return the corresponding entity
     */
    Question toEntity(CreateQuestionDTO questionDTO);

    /**
     *
     * Converts a DTO with the specified ID and to it's respective Entity.
     *
     * @param id          the ID of the entity
     * @param questionDTO the DTO containing updated information
     * @return the corresponding Entity
     */
    Question toEntity(Long id, UpdateQuestionDTO questionDTO);

        /**
     *
     * Converts a DTO with the specified ID and to it's respective DTO.
     *
     * @param id          the ID of the entity
     * @param questionDTO the DTO containing updated information
     * @return the corresponding DTO
     */
    QuestionDTO toDto(Long id, UpdateQuestionDTO questionDTO);
}
