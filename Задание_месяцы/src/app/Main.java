package app;

import tools.Input;
import tools.Months;

public class Main
{
    public static void main(String[] args)
    {
        while( true )
        {
            try 
            {
                int month_num = Input.Input_month_number();
                Months.Display_month_info( month_num );
                break;
            }
            catch ( ArrayIndexOutOfBoundsException month_num_exception )
            {
                System.out.println( "Недопустимое число: месяца с введённым номером не существует." );
            }
        }
    }
}