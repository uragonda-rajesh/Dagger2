package dagger.dagger2;

/**
 * Created by Rajesh on 17-Dec-18.
 */


public class SampleClass {
    String key="";

    public SampleClass()
    {
        key=getRandomNumber();

    }
    public String getKey()
    {
        return key;
    }

    public String getRandomNumber()
    {
        return ""+Math.random() * ( 10000 - 1 );
    }
}
