package com.taofeek.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class NotekeeperOpenHelper extends SQLiteOpenHelper {
    public static String DATABASE_NAME = "NoteKeeper.db";
    public static int DATABASE_VERSION = 1;

    public NotekeeperOpenHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(NoteKeeperDatabaseContract.CourseInfoEntry.SQL_CREATE_TABLE);
        db.execSQL(NoteKeeperDatabaseContract.NoteInfoEntry.SQL_CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
