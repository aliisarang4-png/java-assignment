import java.util.Scanner;

class PowerCalculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        float volts, amps, watts;

        System.out.print("Enter voltage (in volts): ");
        volts = sc.nextFloat();

        System.out.print("Enter current (in amperes): ");
        amps = sc.nextFloat();

        watts = volts * amps;

        System.out.println("Power (in Watts) = " + watts);
    }
}
