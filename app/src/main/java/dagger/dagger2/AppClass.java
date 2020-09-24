package dagger.dagger2;

/**
 * Created by Rajesh on 17-Dec-18.
 */


public class AppClass {
    String key="";

    public AppClass()
    {
        key=getRandomNumber();

    }
    public String getKey()
    {
        return "AppClass "+key;
    }

    public String getRandomNumber()
    {
        return ""+Math.random() * ( 10000 - 1 );
    }
}
