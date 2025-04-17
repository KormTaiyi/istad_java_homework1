import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[][] stock = null;
        String[][] productName;
        int rows = 0, columns = 0;
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
                                    System.out.print(" [" + j + " - empty ] ");
                                } else {
                                    System.out.print("[ " + i + "," + j + " " + stock[i - 1][j - 1] + " ] ");
                                }
                            }
                            System.out.println();
                        }
                    }
                    break;
                }
                case 3:{
                    System.out.println("============= Insert Products =============");
                    System.out.print("[*] Available stock: ");
                    for(int i=1;i<=rows;i++){
                        System.out.print(i+ " | ");
                    }
                    System.out.print("\nInsert stock number: ");
                    int stockNumber= scanner.nextInt();


//                    dfakdo
                    if(stockNumber==rows){
                        for (int i = 1; i <= stock.length; i++) {
                            System.out.print("Stock[" + i + "] =>");
                            for (int j = 1; j <= stock[i - 1].length; j++) {
                                if (stock[i - 1][j - 1] == null) {
                                    System.out.print(" [" + j + " - empty ] ");
                                } else {
                                    System.out.print("[ " + i + "," + j + " " + stock[i - 1][j - 1] + " ] ");
                                }
                            }
                            System.out.println();
                        }
                    }
                    break;
                }
                case 4:{
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