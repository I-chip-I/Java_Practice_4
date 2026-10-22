package tools;

public class Square extends GeometricObject implements Colorable
{
    private double side;

    public Square( double side, String color, boolean filled )
    {
        setSide( side );
        setColor(color);
        setFilled(filled);
    }

    public Square( double side )
    {
        setSide( side );
    }

    public Square()
    {
        setSide( 0 );
    }
    public void setSide( double side )
    {
        this.side = side;
    }

    public double getSide()
    {
        return this.side;
    }

    public double getArea()
    {
        return Math.pow( this.side, 2 );
    }

    public double getPerimeter()
    {
        return this.side * 4;
    }

    public String toString()
    {
        return "Квадрат: сторона = " + this.side + ".";
    }

    public void howToColor()
    {
        System.out.println( "Раскрасьте все четыре стороны." );
    }
}