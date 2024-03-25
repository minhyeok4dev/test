package com.example.myapplication;

import android.app.Application;

import com.flarelane.FlareLane;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // 아래 코드 추가
        // 알림 권한 팝업 타이밍을 제어하려면 세 번째 파라미터를 false로 설정 후 적절한 시점에 .subscribe() 함수 실행
        FlareLane.initWithContext(this, "a43cdc82-0ea5-4fdd-aebc-1940fe99b6c3", true);
    }
}
