package com.na.todolist.commons.models;

import com.na.todolist.commons.usecases.AbstractUseCase;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(staticName = "of")
@Getter
public final class FiltersInputValues<Entity extends BaseEntity, Filters extends SearchFilters> implements AbstractUseCase.InputValues {
    private final Filters filters;
}
