package com.example.esperanto;

import android.provider.BaseColumns;

public final class Res {
    private Res(){}
    public static final class RESEntry implements BaseColumns {
        public final static String TABLE_NAME = "vseresult";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_NAME = "name";
        public final static String COLUMN_RES = "result";

    }
}
