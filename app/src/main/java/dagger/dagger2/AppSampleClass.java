package dagger.dagger2;

/**
 * Created by Rajesh on 17-Dec-18.
 */


public class AppSampleClass {
    String key="";

    public AppSampleClass()
    {
        key=getRandomNumber();

    }
    public String getKey()
    {
        return "AppSampleClass "+key;
    }

    public String getRandomNumber()
    {
        return ""+Math.random() * ( 10000 - 1 );
    }
}
