package zloykurd.developer.androidmvvmlogin;

import android.app.Application;
import android.content.Context;
import android.util.Log;

public class MyApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("App","Started");

    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

    }
}
