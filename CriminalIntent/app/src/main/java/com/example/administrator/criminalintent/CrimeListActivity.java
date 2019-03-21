package com.example.administrator.criminalintent;

import android.support.v4.app.Fragment;

public class CrimeListActivity extends SinglerFragmentActivity {
    @Override
    protected Fragment CreateFragment() {
        return new CrimeListFragment();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_masterdetail;
    }
}
