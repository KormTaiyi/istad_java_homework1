import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[][] stock = null;
        String productName;
        int stockNumber;
        int rows = 0;
        int opt = 0;
        while (true){
            System.out.print("""
             
              Welcome to Java Product Stock Program
                    1. Set up Stock
                    2. View Stock
                    3. Insert Product To Stock
                    4. Update Product from Stock
                    5. Delete Product from stock
                    6. View insert history
                    7. View Update history
                    8. Exit program
              """);
            System.out.print("Choose one option: ");

            if(scanner.hasNextInt()){
                opt= scanner.nextInt();
            }else{
                System.out.println("❌ Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }

            scanner.nextLine();
            switch (opt){
                case 1: {
                    System.out.println("============= Set Up Stock =============");
                    System.out.print("Input number of stock: ");
                    rows = scanner.nextInt();

                    stock = new String[rows][];

                    for (int i = 0; i < rows; i++) {
                        System.out.print("Input number of catalogue for stock[" + (i + 1) + "]: ");
                        int cols = scanner.nextInt();
                        stock[i] = new String[cols];
                    }

                    System.out.println("Set up success\n");
                    break;
                }

                case 2: {
                    if (stock == null) {
                        System.out.println("\nStock not set up yet. Please set it up first.");
                    } else {
                        System.out.println("============= View Stock =============");
                        for (int i = 1; i <= stock.length; i++) {
                            System.out.print("Stock[" + i + "] =>");
                            for (int j = 1; j <= stock[i - 1].length; j++) {
                                if (stock[i - 1][j - 1] == null) {
                                    System.out.print("[" + j + " - empty ] ");
                                } else {
                                    System.out.print("[" + j + " - " + stock[i - 1][j - 1] + " ] ");
                                }
                            }
                            System.out.println();
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("============= Insert Products =============");
                    System.out.print("[*] Available stock: ");
                    for (int i = 1; i <= rows; i++) {
                        System.out.print(i + " | ");
                    }

                    System.out.print("\nInsert stock number: ");
                    stockNumber = Integer.parseInt(scanner.nextLine());

                    if (stockNumber >= 1 && stockNumber <= stock.length) {
                        int index = stockNumber - 1;
                        System.out.print("Stock[" + stockNumber + "] =>");
                        for (int j = 0; j < stock[index].length; j++) {
                            if (stock[index][j] == null) {
                                System.out.print(" [" + (j + 1) + " - empty ] ");
                            } else {
                                System.out.print(" [" + (j + 1) + " " + stock[index][j] + " ] ");
                            }
                        }
                        System.out.println();
                        System.out.print("Input number of category to put product: ");
                        int putNumber = scanner.nextInt();
                        scanner.nextLine();
                        if (putNumber >= 1 && putNumber <= stock[index].length) {
                            if (stock[index][putNumber - 1] == null) {
                                System.out.print("Insert product's name: ");
                                productName = scanner.nextLine();
                                stock[index][putNumber - 1] = productName;
                                System.out.println("✅ Product inserted successfully");
                            } else {
                                System.out.println("❌ That slot is already occupied.");
                            }
                        } else {
                            System.out.println("❌ Invalid category number.");
                        }
                    } else {
                        System.out.println("Invalid stock number.");
                    }
                    break;
                }
                case 4: {
                    System.out.println("============= Update Products =============");
                    System.out.print("[*] Available stock: ");
                    for (int i = 1; i <= rows; i++) {
                        System.out.print(i + " | ");
                    }

                    System.out.print("\nInput stock number: ");
                    stockNumber = scanner.nextInt();
                    scanner.nextLine();

                    int index = stockNumber - 1;

                    if (stockNumber >= 1 && stockNumber <= stock.length) {
                        System.out.print("Stock[" + stockNumber + "] =>");
                        for (int j = 0; j < stock[index].length; j++) {
                            if (stock[index][j] == null) {
                                System.out.print(" [" + (j + 1) + " - empty ] ");
                            } else {
                                System.out.print("[" + (j + 1) + " - " + stock[index][j] + " ] ");
                            }
                        }

                        System.out.print("\nInput old name to update: ");
                        String oldName = scanner.nextLine();
                        for (int j = 0; j < stock[index].length; j++) {
                            if (oldName.equals(stock[index][j])) {
                                System.out.print("Input new name to update: ");
                                String newName = scanner.nextLine();
                                stock[index][j] = newName;
                                System.out.println("✅ Product updated successfully.");
                                break;
                            }
                        }
                    } else {
                        System.out.println("❌ Invalid stock number.");
                    }
                    break;
                }
                case 5:{
                    break;
                }
                case 6:{
                    break;
                }
                case 7:{
                    break;
                }
                case 8:{
                    System.exit(0);
                }
                default:
                    System.out.println("PLease try again!");
            }
        }
    }
//    System.out.print("Press to continue....");
}