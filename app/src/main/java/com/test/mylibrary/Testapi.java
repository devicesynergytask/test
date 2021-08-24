package com.test.mylibrary;

import android.content.Context;

import com.test.myaar.Aarapi;

public class Testapi {
    Context mContext;

    public Testapi(Context context) {
        mContext = context;
    }
    public void showToast() {
        Aarapi aarapi = new Aarapi(mContext);
        aarapi.showToast();
    }
}
