package com.example.kotlintodo.util

import android.app.Activity

val <T> T.exhaustive: T
    get() = this

const val ADD_TASK_RESULT_OK = Activity.RESULT_FIRST_USER
const val EDIT_TASK_RESULT_OK = Activity.RESULT_FIRST_USER + 1