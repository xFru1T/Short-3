import java.util.Scanner;
class Short {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print short number: ");
        short num = scanner.nextShort();
        System.out.println("Binary string short number: " + Integer.toString(num, 2));

        }
    }
