package exception;

public class inputcheckSearch
{
    public static void InputcheckSearch(String selection)
    {
        if (selection.equals("0")||selection.equals("1"))
        {

        }
        else
        {
            throw new inputcheckExceptionSearch("您输入的选择有误，请重新输入");
        }
    }
}
