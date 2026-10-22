package tools;

public class Circle extends GeometricObject implements Colorable
{
    private double radius;

    public Circle( double radius, String color, boolean filled )
    {
        setRadius( radius );
        setColor(color);
        setFilled(filled);
    }

    public Circle( double radius )
    {
        setRadius( radius );
    }

    public Circle()
    {
        //пустое тело
    }

    public void setRadius( double radius )
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public double getDiameter()
    {
        return this.radius * 2;
    }

    public double getArea()
    {
        return Math.PI * Math.pow( this.radius, 2 );
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * this.radius;
    }

    public String toString()
    {
        return "Круг: радиус = " + this.radius + ".";
    }

    public void howToColor()
    {
        System.out.println( "Раскрасьте все четыре стороны." );
    }
}