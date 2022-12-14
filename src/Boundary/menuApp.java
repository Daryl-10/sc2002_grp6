package Boundary;

import java.util.Scanner;

public class menuApp {

    private static Scanner sc;

    public static void main(String[] args) {

        initialize();

        int menuChoice;
        boolean exitMenu = false;
        sc = new Scanner(System.in);

        do {
            System.out.println("----------------------");
            System.out.println("-----MOBLIMA MENU-----");
            System.out.println("----------------------");
            System.out.println("(1) Admin ");
            System.out.println("(2) Movie Goer");
            System.out.println("(3) Register New Admin Account");
            System.out.println("(4) Exit");
            System.out.println("");
            System.out.print("Select choice:");

            menuChoice = sc.nextInt();

            System.out.println("");

            switch (menuChoice) {
                case 1:
                    adminLoginMenu();
                    break;

                case 2:
                    movieGoerMenu();
                    break;

                case 3:
                    registerAdminAccountMenu();
                    break;

                case 4:
                    exitMenu = true;
                    System.out.println("Terminating...");
                    System.out.println("");
                    break;

                default:
                    System.out.println("Please enter a correct number");
                    System.out.println("");

            }
        }

        while (!exitMenu);

    }

    private static void initialize() {
        // create cinema, cineplex and other presets
    }

    public static void adminLoginMenu() {
        // admin login menu

        int adminChoice;
        boolean exitMenu = false;

        do {
            System.out.println("----------------------");
            System.out.println("--MOBLIMA ADMIN MENU--");
            System.out.println("----------------------");
            System.out.println("(1) Create/Update/Delete Movie Listing");
            System.out.println("(2) Create/Update/Delete Movie Session");
            System.out.println("(3) Search Movie Listing(s)");
            System.out.println("(4) View Movie Details");
            System.out.println("(5) Log Out");
            System.out.println("");
            System.out.print("Select choice:");

            adminChoice = sc.nextInt();

            System.out.println("");

            switch (adminChoice) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    exitMenu = true;
                    System.out.println("Logging Out...");
                    System.out.println("");
                    break;

                default:
                    System.out.println("Please enter a correct number");
                    System.out.println("");
            }
        } while (!exitMenu);
    }

    public static void movieGoerMenu() {
        // movie goer menu
        int movieGoerChoice;
        boolean exitMenu = false;
        ;

        do {
            System.out.println("----------------------");
            System.out.println("--MOBLIMA MOVIE MENU--");
            System.out.println("----------------------");
            System.out.println("(1) Search Movie Listing");
            System.out.println("(2) View Top 5 Movies");
            System.out.println("(3) View Movie Details");
            System.out.println("(4) Check Available Seats");
            System.out.println("(5) Book Tickets");
            System.out.println("(6) View Booking History");
            System.out.println("(7) Rate Movie");
            System.out.println("(8) Exit");
            System.out.println("");
            System.out.print("Select choice:");

            movieGoerChoice = sc.nextInt();

            System.out.println("");

            switch (movieGoerChoice) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    exitMenu = true;
                    System.out.println("Exiting...");
                    System.out.println("");
                    break;
                    
                default:
                    System.out.println("Please enter a correct number");
                    System.out.println("");

            }
        } while (!exitMenu);
    }

    public static void registerAdminAccountMenu() {
        // register new admin menu
    }
}
