package com.na.todolist.commons.models;

import com.na.todolist.commons.usecases.AbstractUseCase;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(staticName = "of")
@Getter
public final class IdInputValues<ID> implements AbstractUseCase.InputValues {
    private final ID id;
}
