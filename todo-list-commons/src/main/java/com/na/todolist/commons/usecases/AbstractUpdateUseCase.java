package com.na.todolist.commons.usecases;

import com.na.todolist.commons.models.BaseEntity;
import com.na.todolist.commons.models.SingletonEntityOutput;
import com.na.todolist.commons.port.CreateAndUpdateRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class AbstractUpdateUseCase<Entity extends BaseEntity, Repository extends CreateAndUpdateRepository<Entity>, InputValues extends AbstractUseCase.InputValues>
        extends AbstractUseCase<InputValues, SingletonEntityOutput<Entity>> {

    protected final Repository repository;

    protected abstract void validate(InputValues inputValues);
}
