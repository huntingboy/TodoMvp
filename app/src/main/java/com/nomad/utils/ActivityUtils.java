package com.nomad.utils;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.nomad.todomvp.R;
import com.nomad.todomvp.fragment.TasksFragment;

public class ActivityUtils {
    public static void addFragmentToActivity(FragmentManager supportFragmentManager, TasksFragment mTasksFragment, int contentFrame) {
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.contentFrame, mTasksFragment);
        fragmentTransaction.commit();
    }
}
