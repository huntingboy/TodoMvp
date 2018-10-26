package com.nomad.todomvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.nomad.data.Injection;
import com.nomad.presenter.TasksPresenter;
import com.nomad.todomvp.fragment.TasksFragment;
import com.nomad.utils.ActivityUtils;

public class MainActivity extends AppCompatActivity {

    private TasksFragment mTasksFragment;
    private TasksPresenter mTasksPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (mTasksFragment == null) {
            mTasksFragment = TasksFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), mTasksFragment, R.id.contentFrame);
        }

        mTasksPresenter = new TasksPresenter(Injection.provideTasksRepository(getApplicationContext()), mTasksFragment);
    }
}
