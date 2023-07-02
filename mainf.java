import java.util.Scanner;

class myoptions implements fiction, nonfiction, bsnbooks, science_fantasy, novels, biography {

    public void myaccount() {

        System.out.println("Currently you don't have any books to return");
    }

    // methods related to books showcase

    public void books_showcase() {
        System.out.println("It's good to see that you want to explore books");
        System.out.println("Select 1 for fiction");
        System.out.println("Select 2 for non-fiction");
        System.out.println("Select 3 for business books");
        System.out.println("Select 4 for novels");  
        System.out.println("Select 5 for biographies");
        System.out.println("Select 6 for Science Fanstasy");
        Scanner scanner = new Scanner(System.in);
        String fonf = scanner.nextLine();
        scanner.close();
        type(fonf);

    }

    public static void type(String fonf) {
        switch (fonf.toLowerCase()) {
            case "1":
                System.out.println(marvel + " " + dcu);
                break;
            case "2":
                System.out.println(nnfbook);
                break;
            case "3":
                System.out.println(bsnbook);
                break;
            case "4":
                System.out.println(novel);
                break;
            case "5":
                System.out.println(biography);
                break;
            case "6":
                System.out.println(sci_fan);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

   public void new_arrivals() {
        System.out.println("Here are some new arrivals");
        System.out.println(newarr);

    }

    public void return_issue() {
        System.out.println("How neat!!!! You currently have no books to return!");
        System.out.println(".......");
        System.out.println("......");
        System.out.println("Want to issue any book?");
        System.out.println("......");
    }

    public void news_of_day() {
        System.out.println("News of the Day 1");
        System.out.println("News of the Day 2");
        System.out.println("News of the Day 3");
        System.out.println("News of the Day 4");
        System.out.println("News of the Day 5");
        System.out.println("News 6");
    }
}

interface new_arrive {
    String newarr = "New Arrival1 ,New Arrival2,New arrival3, New Arrival4 ,New Arrival5";
}

interface fiction {
    String marvel = "Ironman, Thor, Captain America, Ironman 2, Ironman 3, Spiderman, Ant-man, Captain Marvel";
    String dcu = "batman, superman, wonderwoman, flash, green lantern";
}

interface nonfiction {
    String nnfbook = "nonfiction 1, nonfiction 2, nonfiction 3, nonfiction 4";
}

interface bsnbooks {
    String bsnbook = "business 1, business 2, business 3, business 4";

}

interface novels {
    String novel = "novel1 , novel 2,novel3, novel4, novel5";
}

interface biography {
    String biography = "biography1, biography2, biography3, biogrpahy4, biography5";

}

interface science_fantasy {
    String sci_fan = "science1, science2, science3, science4, science5";
}

class menu extends myoptions {

    public void showopt() {
        System.out.println("Choose your desired option to proceed & it is case sensitive\n");
        System.out.println("1. My Account");
        System.out.println("2. Books Showcase");
        System.out.println("3. New Arrivals");
        System.out.println("4. Return/Issue Book");
        System.out.println("5. News of the Day");
        System.out.println("6. Exit");
    }

    public void actionahead(String option) {
boolean condition = true;

         while (condition) {
        switch (option) {
            case "1":
                myaccount();
                break;

            case "2":
                books_showcase();
                break;

            case "3":
                new_arrivals();
                break;

            case "4":
                return_issue();
                break;

            case "5":
                news_of_day();
                break;

            case "6":
                System.out.println("Exiting...");
                System.exit(0);
                break;
            case "7":
                // Additional case for returning back to the switch statement
                condition = false; // Set condition to false to exit the loop
                break;
            default:
                System.out.println("Invalid syntax, please enter correct input");

            }
            System.out.println("Choose your desired option to proceed:");
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextLine();
            

        }
    }

}

public class mainf {
    public static void main(String args[]) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Greetings of the Day!");
        menu showw = new menu();
        showw.showopt();
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        showw.actionahead(option);
        scanner.close();
    }
}
