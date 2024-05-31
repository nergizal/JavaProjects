import java.util.Scanner;
public class switchcase {
    private static final int maxbooknumber= 100;
    private static String[] books= new String[maxbooknumber];
    private static int booknumber= 0;

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
            while(true){
            System.out.println("Welcome to the Book Library Management System");
            System.out.println("1. Add book");
            System.out.println("2. Delete book");
            System.out.println("3. List books");
            System.out.println("4. Search for Books");
            System.out.println("5. Exit");
            System.out.print("Please make your choice: ");

            int yourchoice= scanner.nextInt();
            scanner.nextLine();

            switch(yourchoice) {
                case 1:
                    add(scanner);
                    break;
                case 2:
                    delete(scanner);
                    break;
                case 3:
                    list();
                    break;
                case 4:
                    search(scanner);
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid selection! Please try again.");
            }
        }
    }

    public static void add(Scanner scanner) {
        System.out.print("Please enter the name of the book you want to add: ");
        String newbook= scanner.nextLine();

        if (booknumber< maxbooknumber) {
            books[booknumber++]= newbook;
            System.out.println(newbook + " added successfully.");
        } else {
            System.out.println("The library is full, and new books cannot be added.");
        }
    }

    public static void delete(Scanner scanner) {
        System.out.print("Please enter the name of the book you want to delete: ");
        String deletedbook= scanner.nextLine();

        boolean find= false;
        for (int i= 0; i< booknumber; i++) {
            if (books[i].equalsIgnoreCase(deletedbook)) {
                for (int j= i; j< booknumber - 1; j++) {
                    books[j] = books[j + 1];
                }
                booknumber--;
                find= true;
                System.out.println(deletedbook + " successfully deleted.");
                break;
            }
        }

        if(!find) {
            System.out.println("The book could not find.");
        }
    }

    public static void list() {
        if(booknumber== 0) {
            System.out.println("The library is empty now.");
        } else {
            System.out.println("Book List:");
            for (int i= 0; i< booknumber; i++) {
                System.out.println((i + 1) + ". " + books[i]);
            }
        }
    }

    public static void search(Scanner scanner) {
        System.out.print("Please enter the name of the book you want to search: ");
        String searchedbook= scanner.nextLine();

        boolean find= false;
        for (int i= 0; i< booknumber; i++) {
            if (books[i].equalsIgnoreCase(searchedbook)) {
                System.out.println(searchedbook + " found.");
                find= true;
                break;
            }
        }

        if (!find) {
            System.out.println(searchedbook + " not found.");
        }
    }
}