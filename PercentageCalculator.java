import java.util.Scanner;

class PercentageCalculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        float obtainedMarks, totalMarks, percentage;

        System.out.print("Enter obtained marks: ");
        obtainedMarks = sc.nextFloat();

        System.out.print("Enter total marks: ");
        totalMarks = sc.nextFloat();

        percentage = (obtainedMarks / totalMarks) * 100;

        System.out.println("Percentage = " + percentage + "%");
    }
}

