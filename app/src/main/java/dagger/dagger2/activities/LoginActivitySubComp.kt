package dagger.dagger2.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import dagger.dagger2.AppSampleClass
import dagger.dagger2.MyApplication
import dagger.dagger2.R
import dagger.dagger2.SampleClass12
import javax.inject.Inject


class LoginActivitySubComp : AppCompatActivity() {


    lateinit var appSampleClass: AppSampleClass
        @Inject set
    lateinit var SampleClass: SampleClass12
       @Inject set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        val tv = findViewById<TextView>(R.id.tv)

        //simple component
        /*MyApplication.appComponent?.inject(this);
        tv.text=sampleClass?.getKey()*/

        //@@@@@@@ subsomponents @@@@@@@@@@@@
        /*
        * Appcomponent - same instance will be supplied for all activity instance
        * actSubComponent - new instance will be created for every activity instance
        * SampleClass12 - new instance will be created for every activity instance
         */

        var appcompoenent = MyApplication.appComponent

        var actSubComponent = MyApplication.appComponent?.subComponent()?.build()
        actSubComponent?.inject(this)
        tv.text = "Login Screen \n"+appSampleClass?.getKey()+" \n " + SampleClass?.getKey()
        Log.e("SSS", appcompoenent.toString())
        //Log.e("SSS", actSubComponent.toString())
        Log.e("SSS", SampleClass.toString())
        //Log.e("SSS", appClass.toString())

    }
}