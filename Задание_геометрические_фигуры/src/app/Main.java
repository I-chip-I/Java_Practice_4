package app;

import java.util.Scanner;

import tools.GeometricObject;
import tools.Circle;
import tools.Colorable;
import tools.ComparableCircle;
import tools.Rectangle;
import tools.Square;
import tools.Triangle;

import exception_handlers.IllegalTriangleException;

public class Main
{

	public static void main(String[] args) 
    {
        Scanner input = new Scanner( System.in );

        System.out.println( "Задание 1-3." );
        while (true)
        {
            try
            {
                System.out.println( "Введите значение первой стороны треугольника: " );
                double side1 = input.nextDouble();

                System.out.println( "Введите значение второй стороны треугольника: " );
                double side2 = input.nextDouble();

                System.out.println( "Введите значение третьей стороны треугольника: " );
                double side3 = input.nextDouble();

                System.out.println( "Введите цвет треугольника: " );
                String color = input.next();

                System.out.println( "Треугольник закрашен? Если да, введите true, в противном случае введите false. " );
                boolean filled = input.nextBoolean();

		        Triangle triangle_1 = new Triangle( side1, side2, side3, color, filled );
                System.out.println( triangle_1.toString() );
                System.out.println( "Периметр фигуры равен " + triangle_1.getPerimeter() + "." );
                System.out.println( "Площадь фигуры равна " + triangle_1.getArea() + "." );
                if ( triangle_1.getColor() != null )
                {
                    System.out.println( "Цвет фигуры - " + triangle_1.getColor() + "." );
                }
                else
                {
                    System.out.println( "Цвет фигуры не указан." );
                }
                String user_answer;
                if ( triangle_1.isFilled() )
                {
                    user_answer = "Фигура имеет заливку: введено значение true.";
                }
                else
                {
                    user_answer = "Фигура не имеет заливки: введено значение false.";
                }
                System.out.println( user_answer );
                break;
            }
            catch (IllegalTriangleException input_exception)
            {
                System.out.println( input_exception.getMessage() );;
            }
        }

        System.out.println( "\n" );
        System.out.println( "Задание 3. Использование метода интерфейса, реализованного в классе GeometricObject" );
        Circle circle_1 = new Circle( 4 );
        System.out.println( circle_1.toString() );
        Circle circle_2 = new Circle( 1, "red", true );
        System.out.println( circle_2.toString() );
        GeometricObject.max( circle_1, circle_2 );
        
        System.out.println( "\n" );
        Rectangle rectangle_1 = new Rectangle( 2, 4 );
        System.out.println( rectangle_1.toString() );
        Rectangle rectangle_2 = new Rectangle( 5, 2 );
        System.out.println( rectangle_2.toString() );
        GeometricObject.max( rectangle_1, rectangle_2 );

        System.out.println( "\n" );
        System.out.println( "Задание 3. Использование метода интерфейса, реализованного в классе ComparableCircle" );
        ComparableCircle circle_3 = new ComparableCircle( 9 );
        System.out.println( circle_3.toString() );
        ComparableCircle circle_4 = new ComparableCircle( 9 );
        System.out.println( circle_4.toString() );
        ComparableCircle.max( circle_3, circle_4 );

        System.out.println( "\n" );
        ComparableCircle circle_5 = new ComparableCircle( 7 );
        System.out.println( circle_5.toString() );
        GeometricObject rectangle_3 = new Rectangle( 8, 3, "white", false );
        System.out.println( rectangle_3.toString() );
        ComparableCircle.max( circle_5, rectangle_3 );

        System.out.println( "\n" );
        System.out.println( "Задание 4." );
        GeometricObject figures[] = { new Triangle(), new Square(), new Circle( 3, "blue", true ), new Square( 2, "purple", false ), new Rectangle( 3, 4, "green", true ) };
        for (int i = 0; i < 5; i++ )
        {
            System.out.println( figures[i].toString() );
            System.out.println( "Площадь фигуры равна " + figures[i].getArea() );
            ((Colorable) figures[i]).howToColor();
        }
	}
}