package dagger.dagger2;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
class DaggerMyModule {

    /*@Provides
    public SampleInterface getInterfaceInst()
    {
        return new Sa
    }*/
    @Provides
    @Named("NonSingleTon")
    public SampleClass getNonSingleTonSampleClassInstance() {
        return new SampleClass();
    }

    @Provides
    @Singleton
    @Named("SingleTon")
    public SampleClass getSampleClassInstance() {
        return new SampleClass();
    }

}