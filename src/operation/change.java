package operation;
import exception.operationProtect;
import main.sleep;
import Class.student;
import java.util.Scanner;
import java.util.Set;
import static exception.operationProtect.judge;

public class change
{
    public static void Change(Set<student> stuset)
    {
        while (true)
        {
            if(stuset.isEmpty())
            {
                System.out.println("暂时不存在该学生，请先返回主菜单添加学生");
                sleep.Sleep();
                return;
            }
            Scanner in=new Scanner(System.in);
            System.out.println("请输入您要修改的学生的名字");
            String aimName=in.nextLine();
            for (student st:stuset)
            {
                if (aimName.equals(st.studentname))
                {
                    System.out.println("请输入学生修改后的姓名");
                    st.studentname=in.nextLine();
                    System.out.println("添加姓名成功");
                    System.out.println("下面您将修改该同学语文，数学，英语三科的成绩");
                    System.out.print("\n");
                    add.addgrade("语文",st);
                    add.addgrade("数学",st);
                    add.addgrade("英语",st);
                    System.out.println("您已修改完所有信息");
                    sleep.Sleep();
                    return;
                }
            }
            //查询失败
            System.out.println("修改失败，不存在这个学生，键入0重新进入修改模块，键入1返回主菜单");
            operationProtect.OperationProtect();
            if (judge==1)
            {
                judge=0;
                return;
            }
        }
    }
}
