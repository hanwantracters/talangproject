package exception;
public class inputcheckAdd
{
    public static void InputcheckAdd(Double grade)
    {
        if (grade < 0 || grade > 100)
        {
            throw new inputExceptionAdd("您输入的分数范围不对，请重新输入");
        }
    }
}


