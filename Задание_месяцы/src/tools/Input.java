package tools;

import java.util.Scanner;

public class Input
{
    private static final Scanner input = new Scanner( System.in );

    public static int Input_month_number()
    {
        while( true )
        {
            System.out.print( "Введите порядковый номер месяца: " );
            String input_month_num = input.nextLine().trim();

            try 
            {
                int int_month_num = Integer.parseInt( input_month_num );
                return int_month_num - 1;
            }
            catch ( NumberFormatException input_exception )
            {
                System.out.println( "Недопустимое число: введено не целое число." );
            }

        }

    }

    public static int Input_year()
    {
        while( true )
        {
            System.out.print( "Введите год: " );
            String input_year = input.nextLine().trim();

            try 
            {
                int year = Integer.parseInt( input_year );
                if ( year < 0 )
                {
                    throw new IllegalArgumentException( "Недопустимое число: введено отрицательное число." );
                }
                return year;
            }
            catch ( NumberFormatException input_exception )
            {
                System.out.println( "Недопустимое число: введено не целое число." );
            }
            catch ( IllegalArgumentException input_exception )
            {
                System.out.println( input_exception.getMessage() );
            }

        }
    }
}