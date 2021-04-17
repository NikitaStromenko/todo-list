package com.na.todolist.commons.port;

public interface DeleteRepository<ID> {
    Boolean delete(ID id);
}
