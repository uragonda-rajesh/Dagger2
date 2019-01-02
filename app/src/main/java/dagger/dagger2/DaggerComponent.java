package dagger.dagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Rajesh on 17-Dec-18.
 */

@Singleton
@Component(modules = {DaggerMyModule.class})
public interface DaggerComponent {
    void inject(MainActivity mainActivity);

    void inject(Main2Activity main2Activity);
}
