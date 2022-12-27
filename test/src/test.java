import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class test
{
    public static void main(String[] args)
    {
        //获得控制台内容
        PrintStream oldPrintStream = System.out; //将原来的System.out交给printStream 对象保存
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos)); //设置新的out
        System.out.println("5555555");
        System.setOut(oldPrintStream);
        //System.out.println(bos.toString());
    }
}
