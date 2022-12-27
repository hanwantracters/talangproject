package operation;
import Class.*;
import exception.*;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import main.*;
import static exception.operationProtect.judge;
public class search
{
    public static void searchstudent(Set<student> stuset)
    {
        while (true)
        {
            Scanner in=new Scanner(System.in);
            System.out.println("请输入您要查找的学生的名字");
            String aimName=in.nextLine();
            for (student st:stuset)
            {
                if (aimName.equals(st.studentname))
                {
                    //信息获取
                    Set<Map.Entry<String, Double>> courenameAndgrade = st.stumap.entrySet();
                    System.out.println("查询成功，下面是这名学生的信息");
                    System.out.print("姓名\t\t");
                    System.out.printf("%s",st.studentname);
                    System.out.print("\n\n");
                    System.out.print("科目\t\t成绩");
                    System.out.print("\n");
                    for (Map.Entry<String, Double> me:courenameAndgrade)
                    {
                        System.out.println(me.getKey()+"\t\t"+me.getValue());
                    }
                    sleep.Sleep();
                    return;
                }
            }
            //查询失败
            System.out.println("查询失败，键入0重新查询，键入1返回主菜单");
            operationProtect.OperationProtect();
            if (judge==1)
            {
                judge=0;
                return;
            }
        }
    }
}
