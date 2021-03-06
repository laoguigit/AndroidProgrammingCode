package com.example.administrator.criminalintent;

import java.util.Date;
import java.util.UUID;

//表项的数据类，M
public class Crime {
    UUID mId;
    String mTitle;
    Date mDate;
    boolean mSolved;
    String mSuspect;

    public String getmSuspect() {
        return mSuspect;
    }

    public void setmSuspect(String mSuspect) {
        this.mSuspect = mSuspect;
    }

    public Crime(UUID id){
        mId = id;
        mDate = new Date();
    }


    public Crime(){
        this(UUID.randomUUID());
    }

    public UUID getmId() {
        return mId;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public String getPhotoFilename(){
        return "IMG_" + getmId().toString() + ".jpg";
    }
}

