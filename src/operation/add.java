package operation;
import main.sleep;
import Class.student;
import exception.inputExceptionAdd;
import exception.inputcheckAdd;
import java.util.Scanner;
import java.util.Set;

public class add
{
    public static void addstudent(Set<student> stuset)
    {
        Scanner in=new Scanner(System.in);
        student s1=new student();
        System.out.println("请输入学生的姓名");
        s1.studentname=in.nextLine();
        System.out.println("添加姓名成功");
        System.out.println("下面您将添加该同学语文，数学，英语三科的成绩");
        System.out.print("\n");
        addgrade("语文",s1);
        addgrade("数学",s1);
        addgrade("英语",s1);
        stuset.add(s1);
        System.out.println("所有信息添加成功！");
        sleep.Sleep();
    }
    public static void addgrade(String coursename,student s1)
    {
        System.out.println("请输入学生的"+coursename+"成绩，范围是【0，100】");
        Scanner in=new Scanner(System.in);
        while (true)
        {
            try
            {
                Double grade=in.nextDouble();
                inputcheckAdd.InputcheckAdd(grade);
                s1.stumap.put(coursename,grade);
                System.out.println("添加"+coursename+"成绩成功");
                break;
            }
            catch (inputExceptionAdd e)
            {
                e.printStackTrace();
                System.out.println("请再次输入正确范围内的"+coursename+"成绩");
            }
        }
    }
}
