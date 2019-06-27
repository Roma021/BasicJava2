import java.util.*;
import java.util.Objects;


public class Main {


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        CreateBookClass newBook1 = new CreateBookClass();

        newBook1.setTitle("Adventure One");
        newBook1.setAuthor("John Author");
        newBook1.setDescription("The story of a man experiencing an adventure");
        newBook1.setPrice(20.00);
        newBook1.setInStock(true);

        ArrayList<Objects> bookList = new ArrayList<>();


        CreateBookClass newBook2 = new CreateBookClass("Adventure Two", "Tori Norris", "a Story about absolutely nothing", 20.00, false);

        CreateBookClass newBook3 = new CreateBookClass("Bible", "God", "The Beginning & The End", 20.00, true);

        CreateBookClass newBook4 = new CreateBookClass("The Shining", "Stephen King", "A man and his family move into a haunted hotel", 20.00, true);

        CreateBookClass newBook5 = new CreateBookClass("Elegent Universe", "Brian Something", "String Theory", 20.00, true);


        System.out.println("This is the list of books: \n" +
                newBook1.bookTitle() + "\n" +
                newBook2.bookTitle() + "\n" +
                newBook3.bookTitle() + "\n" +
                newBook4.bookTitle() + "\n" +
                newBook5.bookTitle() + "\n");

        System.out.println("Which book would you like and how many orders? ");
        System.out.println("Book: ");
        String bookTitle = keyboard.next();
        System.out.println("Number: ");
        int reqNumber = keyboard.nextInt();

        boolean chooseBook = true;

        while (chooseBook) {

            if (bookTitle == newBook1.bookTitle()) {
                System.out.println("You chose:\n");
                System.out.println(newBook1.displayMessage());
                System.out.println("Total cost: ");
                System.out.print(newBook1.findPrice(newBook1, reqNumber));
                break;
            } else if (bookTitle == newBook2.bookTitle()) {
                System.out.println("You chose:\n");
                System.out.println(newBook2.displayMessage());
                System.out.println("Total cost: ");
                System.out.print(newBook2.findPrice(newBook2, reqNumber));
                break;
            } else if (bookTitle == newBook3.bookTitle()) {
                System.out.println("You chose:\n");
                System.out.println(newBook3.displayMessage());
                System.out.println("Total cost: ");
                System.out.print(newBook3.findPrice(newBook2, reqNumber));
                break;
            } else if (bookTitle == newBook4.bookTitle()) {
                System.out.println("You chose:\n");
                System.out.println(newBook4.displayMessage());
                System.out.println("Total cost: ");
                System.out.print(newBook4.findPrice(newBook2, reqNumber));
                break;
            } else if (bookTitle == newBook5.bookTitle()) {
                System.out.println("You chose:\n");
                System.out.println(newBook5.displayMessage());
                System.out.println("Total cost: ");
                System.out.print(newBook5.findPrice(newBook2, reqNumber));
                break;
            } else {
                System.out.println("Sorry. We do not have the book you are looking for." +
                        "\nWould you like to pick another book? Y/N");
                String answer = keyboard.next();
                if (answer.charAt(0) == 'Y' || answer.charAt(0) == 'y') {
                    chooseBook = true;
                } else {
                    chooseBook = false;
                }
            }
        }

        System.out.println("\n\n" + newBook1.displayMessage());

        System.out.println("\n\n" + newBook2.displayMessage());

        System.out.println("\n\n" + newBook3.displayMessage1());


        System.out.println("How many books would you like to order?: ");


    }
}
