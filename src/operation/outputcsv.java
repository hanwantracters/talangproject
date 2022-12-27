package operation;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import Class.*;
import main.sleep;

public class outputcsv
{
    public static void Outputcsv(Set<student> stuset)
    {
        if(stuset.isEmpty())
        {
            System.out.println("暂时不存在学生信息，请先返回主菜单添加学生");
            sleep.Sleep();
            return;
        }
        Scanner in=new Scanner(System.in);
        System.out.println("请输入要写入的文件的路径");
        String pathname=in.nextLine();
        File oos=new File(pathname);
        BufferedWriter bufferedWriter;
        {
            try
            {
                oos.createNewFile();
                bufferedWriter = new BufferedWriter(new FileWriter(oos));
                bufferedWriter.write("姓名\t\t语文成绩\t\t数学成绩\t\t英语成绩\t\t");
                bufferedWriter.newLine();
                for (student st:stuset)
                {
                    bufferedWriter.write(st.studentname+"\t\t");
                    Set<Map.Entry<String, Double>> courenameAndgrade = st.stumap.entrySet();
                    for (Map.Entry<String, Double> me:courenameAndgrade)
                    {
                        bufferedWriter.write(me.getValue().toString()+"\t\t");
                    }
                    bufferedWriter.newLine();
                }
                bufferedWriter.flush();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        }
    }


}
