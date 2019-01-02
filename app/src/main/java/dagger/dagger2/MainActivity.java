package dagger.dagger2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    @Inject
    @Named("SingleTon")
    SampleClass sampleClass;
    @Inject
    @Named("NonSingleTon")
    SampleClass sampleClass_Non_singleton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyApplication.getMyComponent().inject(this);


        //String rr = sampleClass.getKey();
        TextView tv=findViewById(R.id.tv);
        tv.setText(sampleClass.getKey()+"\n"+sampleClass_Non_singleton.getKey());
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i= new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });
    }
}
