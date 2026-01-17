import java.util.Scanner;

class CircleCalculation
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        float radius, area, circumference;
        float pi = 3.14f;

        System.out.print("Enter radius of circle: ");
        radius = sc.nextFloat();

        area = pi * radius * radius;
        circumference = 2 * pi * radius;

        System.out.println("Area of circle = " + area);
        System.out.println("Circumference of circle = " + circumference);
    }
}
