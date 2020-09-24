package dagger.dagger2.discopes.subcomponent

import dagger.Component
import dagger.Module
import dagger.dagger2.AppSampleClass
import dagger.dagger2.discopes.AppModule
import dagger.dagger2.discopes.scopes.AppScope

@AppScope
@Component(modules = [AppModule::class])
interface AppSubComponent {

    //This function tells dependentcomponent how to access AppSampleClass‘s implementation, even with a different scope.
    fun sampleClass() : AppSampleClass

    // 1. Subcomponent can only be built through AppComponent
    fun subComponent(): ActSubComponent.Builder

    // 3. Declaring the Subcomponents that depend on AppComponent
    @Module(subcomponents = [ActSubComponent::class])
    class SubcomponentModules

}

