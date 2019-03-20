package com.example.administrator.criminalintent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.administrator.criminalintent.CrimeDbSchema.CrimeTable;

/*

 * describe of the source file
 *
 * @ingroup com.example.administrator.criminalintent
 *
 * @author Feng Xiang (h256852)
 *
 * @date 2019/3/20
 *
 * @mail<Xiang.Feng@Honeywell.com>
 *
 * Copyright 2018 Honeywell Corp. All right reserved.
 *
 */
public class CrimeBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "crimeBase.db";

    public CrimeBaseHelper(Context context){
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "
                + CrimeTable.NAME
                + "("          +     " _id integer primary key autoincrement, "
                +CrimeTable.Cols.UUID   + ", "
                + CrimeTable.Cols.TITLE + ", "
                +CrimeTable.Cols.DATE + ", "
                + CrimeTable.Cols.SOLVED + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
