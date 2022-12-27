package exception;

import java.util.Scanner;

public class operationProtect
{
    public static int judge=0;
    public static void  OperationProtect()
    {
        Scanner in=new Scanner(System.in);
        while (true)
        {
            try
            {
                String selection=in.nextLine();
                inputcheckSearch.InputcheckSearch(selection);
                if (selection.equals("0"))
                {
                }
                else if(selection.equals("1"))
                {
                    judge=1;
                }
                return;
            }
            catch (inputcheckExceptionSearch e)
            {
                e.printStackTrace();
                System.out.println("请再次输入正确的选择");
            }
        }
    }
}
