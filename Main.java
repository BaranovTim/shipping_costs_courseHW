import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total_cost = 0;
        
        Address first = new Address("Russia", "Moscow");
        Address second = new Address("Lithuania", "Vilnius");
        Address third = new Address("Canada", "Vancouver");

        Map<Address, Integer> costPerAddress = new HashMap<>();
        costPerAddress.put(first, 10000);
        costPerAddress.put(second, 15000);
        costPerAddress.put(third, 32000);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Заполнение нового заказа.\n" + //
                        "Введите страну: или end ");
            String user_country = scanner.nextLine();
            if (user_country.equalsIgnoreCase("end")) {
                break;
            }
            System.out.println("Введите город: ");
            String user_city = scanner.nextLine();

            System.out.println("Введите вес (кг):");
            Integer user_weight = scanner.nextInt();

            Address userAddress = new Address(user_country, user_city);
            Integer cost_per_kg = costPerAddress.get(userAddress);

            if (cost_per_kg != null) {
                int final_cost = user_weight * cost_per_kg;
                total_cost += final_cost;

                System.out.println("Стоимость доставки составит: " + final_cost + " руб.");
                System.out.println("Общая стоимость всех доставок: " + total_cost + " руб.");
            } else {
                System.out.println("Доставки по этому адресу нет");
            }
            System.out.println();
        }
        System.out.println("Общая стоимость всех доставок: " + total_cost + " руб.");
        scanner.close();


    }

}
