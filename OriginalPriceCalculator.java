import java.util.Scanner;

class OriginalPriceCalculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        float discountedPrice, discountPercent, originalPrice;

        System.out.print("Enter discounted selling price: ");
        discountedPrice = sc.nextFloat();

        System.out.print("Enter discount percentage: ");
        discountPercent = sc.nextFloat();

        originalPrice = discountedPrice / (1 - (discountPercent / 100));

        System.out.println("Original Selling Price = " + originalPrice);
    }
}
