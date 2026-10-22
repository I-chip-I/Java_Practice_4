package tools;

import exception_handlers.IllegalTriangleException;

public class Triangle extends GeometricObject implements Colorable
{
    private double side1, side2, side3;

    public Triangle( double side1, double side2, double side3, String color, boolean filled ) throws IllegalTriangleException
    {
        if ( checkSides( side1, side2, side3 ) != true )
        {
            throw new IllegalTriangleException( "Треугольник со сторонами " + side1 + ", " + side2 + " и " + side3 + " не существует." );
        }

        setSide1( side1 );
        setSide2( side2 );
        setSide3( side3 );
        setColor( color );
        setFilled( filled );
    }

    public Triangle( double side1, double side2, double side3 ) throws IllegalTriangleException
    {
        if ( checkSides( side1, side2, side3 ) != true )
        {
            throw new IllegalTriangleException( "Треугольник со сторонами " + side1 + ", " + side2 + " и " + side3 + " не существует." );
        }

        setSide1( side1 );
        setSide2( side2 );
        setSide3( side3 );
    }

    public Triangle()
    {
        setSide1( 1 );
        setSide2( 1 );
        setSide3( 1 );
    }

    public boolean checkSides( double side1, double side2, double side3 )
    {
        if ( side1 + side2 <= side3)
        {
            return false;
        }

        if ( side1 + side3 <= side2)
        {
            return false;
        }

        if ( side2 + side3 <= side1)
        {
            return false;
        }

        return true;
    }

    public void setSide1( double side1 )
    {
        this.side1 = side1;
    }

    public void setSide2( double side2 )
    {
        this.side2 = side2;
    }

    public void setSide3( double side3 )
    {
        this.side3 = side3;
    }

    public double getSide1()
    {
        return this.side1;
    }

    public double getSide2()
    {
        return this.side2;
    }
    
    public double getSide3()
    {
        return this.side3;
    }

    public double getArea()
    {
        double s = ( this.side1 + this.side2 + this.side3 ) / 2;
        return Math.sqrt( s * ( s - this.side1 ) * ( s - this.side2 ) * ( s - this.side3 ) );
    }

    public double getPerimeter()
    {
        return this.side1 + this.side2 + this.side3;
    }

    public String toString()
    {
        return "Треугольник: сторона 1 = " + this.side1 + ", сторона 2 = " + this.side2 + ", сторона 3 = " + this.side3 + ".";
    }

    public void howToColor()
    {
        System.out.println( "Раскрасьте все три стороны." );
    }
}