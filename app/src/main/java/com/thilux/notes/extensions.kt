package com.thilux.notes

import android.app.Activity
import android.content.Context
import com.thilux.notes.db.NotesDatabaseOpenHelper

val Context.database: NotesDatabaseOpenHelper
    get() = NotesDatabaseOpenHelper.getInstance(applicationContext)