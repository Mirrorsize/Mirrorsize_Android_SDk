package com.example.ms_android_sdk;

import com.android.volley.VolleyError;

public interface CallBack {

    void onSuccess(String result);

    void onError(VolleyError error);
}
