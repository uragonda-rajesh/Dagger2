package dagger.dagger2.discopes.dependentcomponent

import dagger.Component
import dagger.dagger2.activities.MainActivityDependent
import dagger.dagger2.discopes.ActivityModule
import dagger.dagger2.discopes.scopes.PerActivity
import dagger.dagger2.discopes.subcomponent.AppSubComponent

@PerActivity
@Component(modules = [ActivityModule::class],dependencies = [AppDepComponent::class])
interface ActivityComponent {
    fun inject(mainActivityDependent: MainActivityDependent)
}