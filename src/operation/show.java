package operation;
import Class.student;
import main.sleep;
import java.util.Map;
import java.util.Set;
public class show
{
    public static void Show(Set<student> stuset)
    {
        System.out.println("下面将显示所有学生的个体信息，包括姓名，语数英三科成绩");
        System.out.println("姓名\t\t语文成绩\t\t数学成绩\t\t英语成绩\t\t");
        for (student st:stuset)
        {
            Set<Map.Entry<String, Double>> courenameAndgrade = st.stumap.entrySet();
            System.out.printf("%s\t\t",st.studentname);
            for (Map.Entry<String, Double> me:courenameAndgrade)
            {
                System.out.printf("%s\t\t",me.getValue());
            }
            System.out.print("\n");
        }
        sleep.Sleep();
    }
}
