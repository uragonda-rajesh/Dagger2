package dagger.dagger2.discopes

import dagger.Module
import dagger.Provides
import dagger.dagger2.SampleClass
import dagger.dagger2.SampleClass12
import dagger.dagger2.discopes.scopes.PerActivity


@Module
class ActivityModule {

    @PerActivity
    @Provides
    fun getNonSingleTonSampleClassInstance(): SampleClass {
        return SampleClass()
    }
    @PerActivity
    @Provides
    fun getSampleClass12(): SampleClass12 {
        return SampleClass12()
    }
}