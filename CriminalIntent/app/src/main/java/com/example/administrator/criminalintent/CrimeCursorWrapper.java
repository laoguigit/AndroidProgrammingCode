package com.example.administrator.criminalintent;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.example.administrator.criminalintent.CrimeDbSchema.CrimeTable;

import java.util.Date;
import java.util.UUID;

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
public class CrimeCursorWrapper extends CursorWrapper {
    public CrimeCursorWrapper(Cursor cursor){
        super(cursor);
    }

    public Crime getCrime(){
        String uuidString = getString(getColumnIndex((CrimeTable.Cols.UUID)));
        String title = getString(getColumnIndex(CrimeTable.Cols.TITLE));
        long date = getLong(getColumnIndex(CrimeTable.Cols.DATE));
        int isSolved = getInt(getColumnIndex(CrimeTable.Cols.SOLVED));

        Crime crime = new Crime(UUID.fromString(uuidString));
        crime.setmTitle(title);
        crime.setmDate(new Date(date));
        crime.setmSolved(isSolved != 0);

        return crime;
    }
}
