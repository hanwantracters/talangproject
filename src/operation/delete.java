package operation;
import exception.*;
import main.sleep;
import Class.student;
import java.util.Scanner;
import java.util.Set;
import static exception.operationProtect.judge;
public class delete
{
    public static void deletestudent(Set<student> stuset)
    {
        while (true)
        {
            if(stuset.isEmpty())
            {
                System.out.println("暂时不存在学生信息，请先返回主菜单添加学生");
                sleep.Sleep();
                return;
            }
            Scanner in=new Scanner(System.in);
            System.out.println("请输入您要删除的学生的名字");
            String stuname=in.nextLine();
            for (student stu:stuset)
            {
                if (stuname.equals(stu.studentname))
                {
                    stuset.remove(stu);
                    System.out.println("您已删除成功");
                    return;
                }
            }
            //删除失败
            System.out.println("不存在您要删除的学生，键入0重新进入删除模块，键入1返回主菜单");
            operationProtect.OperationProtect();
            if (judge==1)
            {
                judge=0;
                return;
            }
        }
    }
}
