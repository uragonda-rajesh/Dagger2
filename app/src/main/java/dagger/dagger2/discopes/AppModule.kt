package dagger.dagger2.discopes

import dagger.Module
import dagger.Provides
import dagger.dagger2.AppClass
import dagger.dagger2.AppSampleClass
import dagger.dagger2.discopes.scopes.AppScope

@Module
class AppModule {

    @AppScope
    @Provides
    fun getAppSampleCalss(): AppSampleClass {
        return AppSampleClass()
    }

    @AppScope
    @Provides
    fun getAppCalss(): AppClass {
        return AppClass()
    }
}