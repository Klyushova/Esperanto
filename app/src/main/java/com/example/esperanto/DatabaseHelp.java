package com.example.esperanto;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelp extends SQLiteOpenHelper {
    private static final int Version = 1;
    private static final String Database_Name= "familieEsp.db";
    private static final String TABLE_NAME= "familieEsp";
    private static final String Column_nameEsp = "name";
    private static final String Column_nameRu = "description";
    private static final String Column_id = "id";

    private static SQLiteDatabase databasehelper;
    public DatabaseHelp(@Nullable Context context) {
        super(context, Database_Name, null, Version);
        databasehelper = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        updateDatabase(db, 1, 2);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }
    private void updateDatabase(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 1) {
            db.execSQL("CREATE TABLE familie (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "NAME TEXT, "
                    + "DESCRIPTION TEXT); ");
            insert(db, "patro", "отец");
            insert(db, "patrino", "мать");
        }

}

    private void insert(SQLiteDatabase db, String esp, String ru) {
        ContentValues cv=new ContentValues();
        cv.put(Column_nameEsp, esp);
        cv.put(Column_nameRu, ru);
        databasehelper.insert(TABLE_NAME, null, cv);
    }

    public static List<String> getAll() {
        Cursor cursor = databasehelper.query(
                TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                null
        );
        cursor.moveToFirst();
        ArrayList<String> result = new ArrayList<>();
        if (cursor.isAfterLast()) return result;
        do {
            result.add(

                    Integer.parseInt(cursor.getString(Integer.parseInt(Column_nameEsp))),
                            cursor.getString(Integer.parseInt(Column_nameRu))

            );
        } while (cursor.moveToNext());
        cursor.close();
        return result;
    }

}
