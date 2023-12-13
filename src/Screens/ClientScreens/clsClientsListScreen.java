package Screens.ClientScreens;

import CORE.Bank;
import Screens.MainScreens.clsMainScreen;

public class clsClientsListScreen extends clsMainScreen {

    public static void Show() {
        DrawScreenHeader("\t\tC l i e n t s  L i s t  S c r e e n");
        displayAllClients();
    }

    public static void displayAllClients() {
        System.out.println("\n\t\t  ---------------------------------------------------------------------------\n");
        System.out.println("\t\t\t\t    L i s t  o f  < " + Bank.Client_List.size() + " >  C l i e n t ( s )\n");
        System.out.println("\t\t  ---------------------------------------------------------------------------");
        System.out.printf("\t\t  | %-4s | %-15s | %-15s | %-15s | %-10s |\n",
                "ID", "First Name", "Last Name", "Phone", "Username");
        System.out.println("\t\t  ---------------------------------------------------------------------------");

        for (int i = 0; i < Bank.Client_List.size(); i++) {
            String id = Bank.Client_List.get(i).GetID();
            String firstName = Bank.Client_List.get(i).GetFirstName();
            String lastName = Bank.Client_List.get(i).GetLastName();
            String phone = Bank.Client_List.get(i).GetPhone();
            String username = Bank.Client_List.get(i).GetUsername();

            System.out.printf("\t\t  | %-4s | %-15s | %-15s | %-15s | %-10s |\n",
                    id, firstName, lastName, phone, username);
        }

        System.out.println("\t\t  ---------------------------------------------------------------------------");
    }

}