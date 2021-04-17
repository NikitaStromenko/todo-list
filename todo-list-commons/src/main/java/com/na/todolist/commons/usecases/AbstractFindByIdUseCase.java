package com.na.todolist.commons.usecases;

import com.na.todolist.commons.models.BaseEntity;
import com.na.todolist.commons.models.IdInputValues;
import com.na.todolist.commons.models.OptionalSingletonEntityOutput;
import com.na.todolist.commons.models.SearchFilters;
import com.na.todolist.commons.port.ReadRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class AbstractFindByIdUseCase<Entity extends BaseEntity, ID, Repository extends ReadRepository<Entity, ID, SearchFilters>>
        extends AbstractUseCase<IdInputValues<ID>, OptionalSingletonEntityOutput<Entity>>  {

    protected final Repository repository;

    public OptionalSingletonEntityOutput<Entity> execute(IdInputValues<ID> idIdInputValues) {
        if (idIdInputValues == null || idIdInputValues.getId() == null || idIdInputValues.getId().equals(""))
            return OptionalSingletonEntityOutput.empty();

        return OptionalSingletonEntityOutput.of(repository.findById(idIdInputValues.getId()));
    }
}
