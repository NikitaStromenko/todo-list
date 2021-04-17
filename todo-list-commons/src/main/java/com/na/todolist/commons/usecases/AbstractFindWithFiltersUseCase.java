package com.na.todolist.commons.usecases;

import com.na.todolist.commons.models.BaseEntity;
import com.na.todolist.commons.models.FiltersInputValues;
import com.na.todolist.commons.models.SearchFilters;
import com.na.todolist.commons.models.SearchResultEntityOutput;
import com.na.todolist.commons.port.ReadRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class AbstractFindWithFiltersUseCase<Entity extends BaseEntity, Filters extends SearchFilters, Repository extends ReadRepository<Entity, String, Filters>>
        extends AbstractUseCase<FiltersInputValues<Entity, Filters>, SearchResultEntityOutput<Entity>> {

    protected final Repository repository;

    public SearchResultEntityOutput<Entity> execute(FiltersInputValues<Entity, Filters> filtersFiltersInputValues) {
        return SearchResultEntityOutput.of(repository.findWithFilters(filtersFiltersInputValues.getFilters()));
    }
}
