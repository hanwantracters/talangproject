package main;

public class sleep
{
    public static void Sleep()
    {
        try
        {
            Thread.sleep(1000*2);
        }
        catch (Exception e)
        {

            System.out.println("Got an exception!");

        }
    }
}
