package tools;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject>
{
    private String color; 
    private boolean filled;
    private Date date;

    public GeometricObject( String color, boolean filled )
    {
        setColor( color );
        setFilled( filled );
    }

    public GeometricObject()
    {
        setColor( null );
        setFilled( false );
    }

    public void setColor( String color )
    {
        this.color = color;
    }

    public void setFilled( boolean filled )
    {
        this.filled = filled;
    }

    public void dateCreated()
    {
        this.date = new Date();
    }

    public String getColor()
    {
        return this.color;
    }

    public boolean isFilled()
    {
        return this.filled;
    }

    public Date getDateCreated()
    {
        return this.date;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public GeometricObject compareTo( GeometricObject figure_to_compare )
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

    public static void max( GeometricObject figure1, GeometricObject figure2 )
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

    public abstract String toString();
}