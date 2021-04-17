package com.na.todolist.commons.models;

import com.na.todolist.commons.usecases.AbstractUseCase;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(staticName = "of")
@Getter
public final class SearchResultEntityOutput<Entity extends BaseEntity> implements AbstractUseCase.OutputValues {
    private final SearchResult<Entity> result;
}
