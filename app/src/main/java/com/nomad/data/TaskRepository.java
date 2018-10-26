package com.nomad.data;

import com.nomad.data.model.Task;

import java.util.Map;

public class TaskRepository implements TasksDataSource {
    private static TaskRepository INSTANCE = null;
    private final TasksDataSource mTasksRemoteDataSource;
    private final TasksDataSource mTasksLocalDataSource;
    Map<String, Task> mCachedTasks;

    public static TaskRepository getINSTANCE() {
        return INSTANCE;
    }
}
