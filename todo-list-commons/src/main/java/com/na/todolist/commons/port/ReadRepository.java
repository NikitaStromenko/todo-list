package com.na.todolist.commons.port;

import com.na.todolist.commons.models.BaseEntity;
import com.na.todolist.commons.models.SearchFilters;
import com.na.todolist.commons.models.SearchResult;

import java.util.Optional;

public interface ReadRepository<Entity extends BaseEntity, ID, Filters extends SearchFilters> {
    Optional<Entity> findById(ID id);
    SearchResult<Entity> findWithFilters(Filters filters);
    Long count(Filters filters);
}
