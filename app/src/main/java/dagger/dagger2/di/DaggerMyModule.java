package dagger.dagger2.di;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.dagger2.SampleClass;

@Module
public class DaggerMyModule {

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