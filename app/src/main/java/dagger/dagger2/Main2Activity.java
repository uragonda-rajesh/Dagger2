package dagger.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;
import javax.inject.Named;

public class Main2Activity extends AppCompatActivity {

    @Inject
    @Named("SingleTon")
    SampleClass sampleClass;
    @Inject
    @Named("NonSingleTon")
    SampleClass sampleClass_Non_singleton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MyApplication.getMyComponent().inject(this);


        //String rr = sampleClass.getKey();
        TextView tv = findViewById(R.id.tv);
        tv.setText(sampleClass.getKey() + "\n" + sampleClass_Non_singleton.getKey());

    }
}
