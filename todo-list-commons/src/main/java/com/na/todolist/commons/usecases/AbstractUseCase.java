package com.na.todolist.commons.usecases;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class AbstractUseCase<Input extends AbstractUseCase.InputValues, Output extends AbstractUseCase.OutputValues> {

    public abstract Output execute(Input input);

    public interface InputValues {}

    public interface OutputValues{}
}
