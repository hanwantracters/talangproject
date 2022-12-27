package operation;
import Class.*;

import java.io.*;
import java.util.Scanner;
import java.util.Set;

public class inputdat
{
    public static void Inputdat(Set<student> stuset)
    {
        System.out.println("需要注意的是，目标读取文件被读取的第一个数据应该是int类型，值是本程序student类型对象的数量，剩下的数据是本程序student类型对象的数据类型和值");
        System.out.println("所以请注意读取顺序和内容，作者建议读取的文件最好是由本程序输出的dat文件，负责可能导致读取失败");
        System.out.println("请输入要读入的文件的路径");

        while (true)
        {
            try
            {
                Scanner in=new Scanner(System.in);
                String pathname=in.nextLine();
                File oos=new File(pathname);
                oos.createNewFile();
                ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(oos));
                int size = objectInputStream.readInt();
                for (int i=0;i<size;i++)
                {
                    student st=(student)objectInputStream.readObject();
                    stuset.add(st);
                }
                break;
            }
            catch (IOException | ClassNotFoundException e)
            {
                System.out.println("您输入的文件地址有误，请重新输入");
            }
        }
    }
}
