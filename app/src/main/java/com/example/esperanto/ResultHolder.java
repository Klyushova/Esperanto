package com.example.esperanto;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ResultHolder extends SQLiteOpenHelper {
    private static final int VERSION = 1;

    private static final String DATABASE_NAME = "result.db";
    private static final String TABLE_NAME = "Result";

    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_DESCRIPTION = "result";
    private static final String COLUMN_COUNT = "count";

    private static final int NUM_COLUMN_ID = 0;
    private static final int NUM_COLUMN_NAME = 1;
    private static final int NUM_COLUMN_DESCRIPTION = 2;
    private static final int NUM_COLUMN_COUNT = 3;
    private final SQLiteDatabase database;

    public ResultHolder(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION);
        database = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + " TEXT, " +
                COLUMN_DESCRIPTION + " TEXT, " +
                COLUMN_COUNT + " INTEGER); ";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    @Override
    public synchronized void close() {
        super.close();
        database.close();
    }
    private void insertResult(String nameDi, String share){
        String name = nameDi;
        String shared = share;


//        ResultHolder mDbHelper = new ResultHolder(this);

//        SQLiteDatabase db = mDbHelper.getWritableDatabase();
//
//        ContentValues values = new ContentValues();
//        values.put(Res.RESEntry.COLUMN_NAME, name);
//        values.put(Res.RESEntry.COLUMN_RES, shared);
//
//
//        // Вставляем новый ряд в базу данных и запоминаем его идентификатор
//        long newRowId = db.insert(Res.RESEntry.TABLE_NAME, null, values);
    }
}
