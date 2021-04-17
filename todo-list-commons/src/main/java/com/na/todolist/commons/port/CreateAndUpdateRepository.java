package com.na.todolist.commons.port;

import com.na.todolist.commons.models.BaseEntity;

public interface CreateAndUpdateRepository<Entity extends BaseEntity> {
    Entity save(Entity entity);
}
