package dagger.dagger2.discopes.subcomponent

import dagger.Subcomponent
import dagger.dagger2.activities.LoginActivitySubComp
import dagger.dagger2.discopes.ActivityModule
import dagger.dagger2.discopes.scopes.PerActivity


@PerActivity
@Subcomponent(modules = [ActivityModule::class])
interface ActSubComponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): ActSubComponent
    }

    fun inject(page: LoginActivitySubComp)
}