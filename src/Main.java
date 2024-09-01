import java.time.LocalDate;
import java.util.Locale;

public class Main {
    //Task 1
    public static void printLeapYearStatus(int year) {
        System.out.println("Task 1");
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }
    public static void main(String[] args) {
        int year = 2024;
        printLeapYearStatus(year);
    }

    //Task 2
    public static void recommendApplicationVersion(int clientOs, int deviceYear) {
        System.out.println("Task 2");
        boolean deviceIsOld = isDeviceOld(deviceYear);
        String resultMessages= "Установите ";
        if (deviceIsOld) {
           resultMessages = resultMessages + "Lite ";
        }
        resultMessages = resultMessages + "версию для ";
        if (clientOs == 0) {
            resultMessages = resultMessages + "iOS";
        } else {
            resultMessages = resultMessages + "Android";
        }
        System.out.println(resultMessages);
    }
    public static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
    }

    public static void printSetSystem(int clientDeviceYear, int clientDevice) {
        String version = "";
        if (clientDeviceYear < 2015) {
            version = "облегченную";
        }
        String device = "";
        if (clientDevice == 0) {
            device = "IOS";
        } else if (clientDevice == 1) {
            device = "Android";
        }
        System.out.printf("Установите %s версию приложения для %s по ссылке", version, device);
    }
    //Task 3
    public static void printDeliveryDays(int deliveryDistance) {
        System.out.println(calculateDeliveryDays(deliveryDistance));
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays++;
        } else if (deliveryDistance > 100) {
            return -1;
        }
        return deliveryDays;
    }
}