package operation;
import Class.student;
import main.sleep;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Set;

public class outputdat
{
    public static void Outputdat(Set<student> stuset)
    {
        if(stuset.isEmpty())
        {
            System.out.println("暂时不存在学生信息，请先返回主菜单添加学生");
            sleep.Sleep();
            return;
        }
            try
            {
                Scanner in=new Scanner(System.in);
                System.out.println("请输入要写入的文件的路径");
                String pathname=in.nextLine();
                File oos=new File(pathname);
                oos.createNewFile();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(oos));
                objectOutputStream.writeInt(stuset.size());
                for (student st:stuset)
                {
                    objectOutputStream.writeObject(st);
                }
                objectOutputStream.flush();
                objectOutputStream.close();

            }
            catch (IOException e)
            {
                System.out.println("您输入的文件地址有误，请重新输入");
            }
    }
}
