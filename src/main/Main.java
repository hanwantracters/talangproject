package main;
import operation.*;
import Class.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        Set<student> stuset= new HashSet<>();
        while (true)
        {
            menu.Menu();
            switch (in.next())
            {
                case "1" -> add.addstudent(stuset);
                case "2" -> delete.deletestudent(stuset);
                case "3" -> search.searchstudent(stuset);
                case "4" -> show.Show(stuset);
                case "5" -> change.Change(stuset);
                case "6" -> outputdat.Outputdat(stuset);
                case "7" -> outputcsv.Outputcsv(stuset);
                case "8" -> inputdat.Inputdat(stuset);
                case "0" ->
                {
                    return;
                }
                default ->
                {
                    System.out.println("输入错误，请重新输入");
                    sleep.Sleep();
                }
            }
        }
    }
}
