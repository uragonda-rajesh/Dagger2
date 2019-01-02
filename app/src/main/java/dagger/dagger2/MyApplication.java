package dagger.dagger2;

import android.app.Application;

/**
 * Created by Rajesh on 17-Dec-18.
 */

public class MyApplication extends Application {

    private static DaggerComponent daggerComponent;
    @Override
    public void onCreate() {
        daggerComponent = DaggerDaggerComponent.builder()
                .daggerMyModule(new DaggerMyModule())
                .build();
        super.onCreate();
    }
    public static DaggerComponent getMyComponent() {
        return daggerComponent;
    }
}
