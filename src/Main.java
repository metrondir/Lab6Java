import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> SurnamePlaceBirthCatalog = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputSurname;
            String inputPlaceBirthday;
            String inputProgramOption;

            SurnamePlaceBirthCatalog.put("Shevchenko", "Lviv");
            SurnamePlaceBirthCatalog.put("Volynets", "Kyiv");
            SurnamePlaceBirthCatalog.put("Gaba", "Vinytsya");
            SurnamePlaceBirthCatalog.put("Pasichnyi", "Dnipro");
            SurnamePlaceBirthCatalog.put("Mykolenko", "Symu");
            SurnamePlaceBirthCatalog.put("Zinchenko", "Cherivntsi");
            SurnamePlaceBirthCatalog.put("Yarmolenko", "Chernihiv");
            SurnamePlaceBirthCatalog.put("Rebrov", "Charkiv");
            SurnamePlaceBirthCatalog.put("Mydruk", "London");
            SurnamePlaceBirthCatalog.put("Konoplyanka", "Luhansk");

            System.out.println("Enter the option of program");
            System.out.println("Option '0' - exit the program");
            System.out.println("Option '1' - search for an item");
            System.out.println("Option '2' - insert new record");
            System.out.println("Option '3' - delete an item");
            System.out.println("Option '4' - review the hashmap");

            inputProgramOption = br.readLine();

            while (!inputProgramOption.equals("0")) {
                switch (inputProgramOption) {
                    case "1":
                        System.out.println("Enter the surname of the person you are searching for:");
                        inputSurname = br.readLine();
                        if (SurnamePlaceBirthCatalog.containsKey(inputSurname))
                            System.out.println(inputSurname + " was born in " + SurnamePlaceBirthCatalog.get(inputSurname));
                        else
                            System.out.println("Sorry, the person you are searching for is not in the catalog.");
                        break;

                    case "2":
                        System.out.println("Enter the surname of the person you want to insert:");
                        inputSurname = br.readLine();
                        System.out.println("Enter the birthplace of the person:");
                        inputPlaceBirthday = br.readLine();
                        SurnamePlaceBirthCatalog.put(inputSurname, inputPlaceBirthday);
                        System.out.println(inputSurname + " was added to the catalog.");
                        break;

                    case "3":
                        System.out.println("Enter the surname of the person you want to delete:");
                        inputSurname = br.readLine();
                        if (SurnamePlaceBirthCatalog.containsKey(inputSurname)) {
                            SurnamePlaceBirthCatalog.remove(inputSurname);
                            System.out.println(inputSurname + " was deleted from the catalog.");
                        } else {
                            System.out.println("Sorry, the person you want to delete is not in the catalog.");
                        }
                        break;

                    case "4":
                        System.out.println("Catalog contents:");
                        for (String surname : SurnamePlaceBirthCatalog.keySet()) {
                            System.out.println(surname + " was born in " + SurnamePlaceBirthCatalog.get(surname));
                        }
                        break;

                    default:
                        System.out.println("Invalid option selected. Please enter a valid option.");
                        break;
                }

                System.out.println("Enter the option of program");
                System.out.println("Option '0' - exit the program");
                System.out.println("Option '1' - search for an item");
                System.out.println("Option '2' - insert new record");
                System.out.println("Option '3' - delete an item");
                System.out.println("Option '4' - review the hashmap");
                inputProgramOption = br.readLine();
            }

            System.out.println("Exiting program...");

        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
    }