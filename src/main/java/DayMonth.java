import java.util.Scanner;

public class DayMonth {
    public static void main(String[] args) {
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you want counts day?");
        month = scanner.nextInt();
        switch (month) {
            case 1:
            case 5:
            case 3:
            case 7:
            case 8:
            case 10:
            case 12: {
                System.out.println("Thang  " + month + " co 31 ngay");
                break;
            }
            case 2: {
                System.out.println("Thang 2 co 28 ngay");
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                System.out.println("Thang " + month + "co 30 ngay");
                break;
            }
        }
    }
}
