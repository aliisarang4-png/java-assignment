import java.util.Scanner;

class TrapezoidArea
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        float a, b, h, area;

        System.out.print("Enter length of first parallel side: ");
        a = sc.nextFloat();

        System.out.print("Enter length of second parallel side: ");
        b = sc.nextFloat();

        System.out.print("Enter height (perpendicular distance): ");
        h = sc.nextFloat();

        area = h * (a + b) / 2;

        System.out.println("Area of Trapezoid = " + area);
    }
}
