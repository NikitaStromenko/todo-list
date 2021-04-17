package com.na.todolist.commons.port;

import com.na.todolist.commons.models.BaseEntity;
import com.na.todolist.commons.models.SearchFilters;

public interface CRUDRepository<Entity extends BaseEntity, ID, Filters extends SearchFilters>
        extends CreateAndUpdateRepository<Entity>, ReadRepository<Entity, ID, Filters>, DeleteRepository<ID> {

}
