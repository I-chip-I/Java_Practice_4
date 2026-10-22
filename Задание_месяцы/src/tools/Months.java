package tools;

public class Months
{
    private static final String[] months = { "январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь" };
    private static final int[] dom = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private static int year;

    private static String Get_month_name( int i_month_num )
    {
        return months[ i_month_num ];
    }

    private static int Get_month_days_quantity( int i_month_num )
    {
        return dom[ i_month_num ];
    }

    private static boolean Is_February( int i_month_num )
    {
        if ( i_month_num == 1 )
        {
            year = Input.Input_year();
            return true;
        }
        else
        {
            year = 0;
            return false;
        }
    }

    private static boolean Is_leap_year( )
    {
        if ( year % 100 == 0 && year % 400 != 0 )
        {
            return false;
        }
        else if ( year % 4 == 0 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private static int Get_February_days_quantity( int i_month_num )
    {
        if ( Is_leap_year() )
        {
            return dom[ i_month_num ] + 1;
        }
        else
        {
            return dom[ i_month_num ];
        }
    }

    public static void Display_month_info( int i_month_num )
    {
        if ( Is_February( i_month_num ) )
        {
            System.out.println( Get_month_name( i_month_num ) + ", " + year + " год, " + Get_February_days_quantity( i_month_num ) + " дней" );
        }
        else
        {
            System.out.println( Get_month_name( i_month_num ) + ", " + Get_month_days_quantity( i_month_num ) + " дней" );
        }
    }
}