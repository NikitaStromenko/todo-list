package com.na.todolist.commons.models;

import com.na.todolist.commons.usecases.AbstractUseCase;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@AllArgsConstructor(staticName = "of")
@Getter
public final class OptionalSingletonEntityOutput<Entity extends BaseEntity> implements AbstractUseCase.OutputValues {
    private final Optional<Entity> entity;

    public static <Entity extends BaseEntity> OptionalSingletonEntityOutput<Entity> empty() {
        return of(Optional.empty());
    }
}
