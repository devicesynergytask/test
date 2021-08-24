package com.test.mylibrary;

import android.content.Context;
import android.widget.Toast;


public class Testapi {
    Context mContext;

    public Testapi(Context context) {
        mContext = context;
    }
    public void showToast() {
        Toast.makeText(mContext, "Testapi call!!!", Toast.LENGTH_SHORT).show();
    }
}
