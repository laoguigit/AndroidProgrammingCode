package com.example.administrator.criminalintent;

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
public class CrimeDbSchema {
    public static final class CrimeTable{
        public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
        }
    }
}
