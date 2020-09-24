package dagger.dagger2.discopes.subcomponent

import dagger.Module
import dagger.Provides
import dagger.dagger2.SampleClass
import dagger.dagger2.SampleClass12
import dagger.dagger2.discopes.scopes.PerActivity


@Module
class ActivitySubModule {


    @Provides
    fun getNonSingleTonSampleClassInstance(): SampleClass? {
        return SampleClass()
    }
    @PerActivity
    @Provides
    fun getSampleClass123(): SampleClass12? {
        //Log.e("SSS","AppSampleClass "+appSampleClass.key)
        return SampleClass12()
    }
}