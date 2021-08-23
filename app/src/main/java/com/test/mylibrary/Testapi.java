package com.test.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class Testapi {
    Context mContext;

    public Testapi(Context context) {
        mContext = context;
    }
    public void showToast() {
        Toast.makeText(mContext, "test", Toast.LENGTH_SHORT).show();
    }
    public void showToast2() {
        Toast.makeText(mContext, "test3333333333", Toast.LENGTH_SHORT).show();
    }
    public void showToast3() {
        Toast.makeText(mContext, "test showtoast3", Toast.LENGTH_SHORT).show();
    }
}
