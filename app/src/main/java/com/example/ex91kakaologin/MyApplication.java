package com.example.ex91kakaologin;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        KakaoSdk.init(this, "df80dfe5a8234e75ab40280a50a31239");
    }
}
