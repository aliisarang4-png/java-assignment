import java.util.Scanner;

class DiscountCalculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        float originalPrice, discountPercent, discountAmount, finalPrice;

        System.out.print("Enter original selling price: ");
        originalPrice = sc.nextFloat();

        System.out.print("Enter discount percentage: ");
        discountPercent = sc.nextFloat();

        discountAmount = (originalPrice * discountPercent) / 100;
        finalPrice = originalPrice - discountAmount;

        System.out.println("Discounted Selling Price = " + finalPrice);
    }
}
