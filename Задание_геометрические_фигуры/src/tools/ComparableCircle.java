package tools;

public class ComparableCircle extends Circle //интерфейс добавлен для соотвествия кода заданию, в реальности он избыточен, так как ComparableCircle наследует интерфейс Comparable от суперкласса GeometricObject
{
    public ComparableCircle( double radius, String color, boolean filled )
    {
        super( radius, color, filled );
    }

    public ComparableCircle( double radius )
    {
        super( radius );
    }

    public ComparableCircle()
    {
        //пустое тело
    }

    public ComparableCircle compareTo( ComparableCircle figure_to_compare )
    {
        if ( this.getArea() > figure_to_compare.getArea() )
        {
            return this;
        }
        else if ( this.getArea() < figure_to_compare.getArea() )
        {
            return figure_to_compare;
        }
        else
        {
            return null;
        }
    }
 
    public static void max( ComparableCircle figure1, ComparableCircle figure2 )
    {
        if ( figure1.compareTo( figure2 ) == figure1 )
        {
            System.out.println( "Первая фигура больше второй." );
        }
        else if ( figure1.compareTo( figure2 ) == figure2 )
        {
            System.out.println( "Вторая фигура больше первой." );
        }
        else
        {
            System.out.println( "Фигуры равны." );
        }
    }
}