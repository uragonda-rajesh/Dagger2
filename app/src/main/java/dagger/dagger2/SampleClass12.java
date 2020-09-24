package dagger.dagger2;

/**
 * Created by Rajesh on 17-Dec-18.
 */


public class SampleClass12 {
    String key="";

    public SampleClass12()
    {
        key=getRandomNumber();

    }
    public String getKey()
    {
        return "SampleClass12 "+ key;
    }

    public String getRandomNumber()
    {
        return ""+Math.random() * ( 10000 - 1 );
    }
}
