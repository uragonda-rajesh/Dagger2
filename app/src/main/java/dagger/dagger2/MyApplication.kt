package dagger.dagger2

import android.app.Application
import dagger.dagger2.discopes.*
import dagger.dagger2.discopes.dependentcomponent.AppDepComponent
import dagger.dagger2.discopes.dependentcomponent.DaggerAppDepComponent
import dagger.dagger2.discopes.subcomponent.AppSubComponent
import dagger.dagger2.discopes.subcomponent.DaggerAppSubComponent

/**
 * Created by Rajesh on 17-Dec-18.
 */

class MyApplication : Application() {

    companion object {
        var appComponent: AppSubComponent? = null
        var appDepComponent: AppDepComponent? = null

        }

    override fun onCreate() {

        appComponent= DaggerAppSubComponent.builder()
                .appModule(AppModule())
                .build()

        appDepComponent= DaggerAppDepComponent.builder().build()

        super.onCreate()
    }

}