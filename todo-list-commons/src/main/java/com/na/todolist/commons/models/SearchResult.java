package com.na.todolist.commons.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@Data
public class SearchResult<T> {
    private List<T> items;
    private Long count;
}
