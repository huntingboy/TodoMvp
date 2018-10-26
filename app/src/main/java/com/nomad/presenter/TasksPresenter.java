package com.nomad.presenter;

import android.support.annotation.NonNull;

import com.nomad.contract.TasksContract;
import com.nomad.data.TaskRepository;
import com.nomad.data.model.Task;

public class TasksPresenter implements TasksContract.Presenter {
    private final TaskRepository mTaskRepository;
    private final TasksContract.View mView;

    public TasksPresenter(TaskRepository mTaskRepository, TasksContract.View mView) {
        this.mTaskRepository = mTaskRepository;
        this.mView = mView;
        mView.setPresenter(this);
    }

    @Override
    public void result(int requestCode, int resultCode) {

    }

    @Override
    public void loadTasks(boolean forceUpdate) {

    }

    @Override
    public void addNewTask() {

    }

    @Override
    public void openTaskDetails(@NonNull Task requestedTask) {

    }

    @Override
    public void start() {

    }
}
