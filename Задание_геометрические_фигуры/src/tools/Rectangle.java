package tools;

public class Rectangle extends GeometricObject implements Colorable
{
    private double width, height;

    public Rectangle( double width, double height, String color, boolean filled )
    {
        setWidth( width );
        setHeight( height );
        setColor(color);
        setFilled(filled);
    }

    public Rectangle( double width, double height )
    {
        setWidth( width );
        setHeight( height );
    }

    public Rectangle()
    {
        //пустое тело
    }

    public void setWidth( double width )
    {
        this.width = width;
    }

    public void setHeight( double height )
    {
        this.height = height;
    }

    public double getWidth()
    {
        return this.width;
    }

    public double getHeight()
    {
        return this.height;
    }

    public double getArea()
    {
        return this.width * this.height;
    }

    public double getPerimeter()
    {
        return (this.width + this.height) * 2;
    }

    public String toString()
    {
        return "Прямоугольник: ширина = " + this.width + ", высота = " + this.height + ".";
    }

    public void howToColor()
    {
        System.out.println( "Раскрасьте все четыре стороны." );
    }
}