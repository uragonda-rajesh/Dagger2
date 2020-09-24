package dagger.dagger2.discopes.dependentcomponent;

import javax.inject.Singleton;

import dagger.Component;
import dagger.dagger2.discopes.AppModule;

/**
 * Created by Rajesh on 17-Dec-18.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppDepComponent {
    //void inject(MainActivity mainActivity);
    //void inject(Main2Activity main2Activity);
    //void inject(LoginActivity loginActivity);
}
