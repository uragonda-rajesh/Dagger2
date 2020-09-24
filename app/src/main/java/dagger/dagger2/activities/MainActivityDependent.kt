package dagger.dagger2.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import dagger.dagger2.AppSampleClass
import dagger.dagger2.MyApplication
import dagger.dagger2.R
import dagger.dagger2.SampleClass12
import dagger.dagger2.discopes.dependentcomponent.DaggerActivityComponent
import dagger.dagger2.discopes.dependentcomponent.DaggerAppDepComponent


import javax.inject.Inject

class MainActivityDependent : AppCompatActivity() {



    lateinit var appSampleClass: AppSampleClass
        //@Inject set
    lateinit var SampleClass: SampleClass12
        //@Inject set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.tv)

        /*
        * method 1
        * activityComponent is intiated here and it stays in the memory for the lifetime of this activity
        * appcompoenent instance will be same
        * but activityComponent and sampleClass will be created new for each activity instance.
        * ======================
        * */
        var appDepComponent= MyApplication.appDepComponent;
        var activityDepComponent= DaggerActivityComponent.builder()
                .appDepComponent(appDepComponent).build()
        activityDepComponent.inject(this)

        //#################################################
        /*
        * Method 2
        * Result : appComponent & activityComponent have same instance supplied for every instance of the activity
        * but sampleClass is created for every instance of activity
        * */
        /* var appcompoenent=MyApplication.appComponent
         var activityComponent=MyApplication.activityComponent
         */
        //########################################################
        tv.text = appSampleClass?.getKey()+"  \n" + SampleClass?.getKey()
        Log.e("SSS", appDepComponent.toString())
        Log.e("SSS", activityDepComponent.toString())
        Log.e("SSS", appSampleClass.toString())
        //Log.e("SSS", sampleClass12.toString())


    }
}