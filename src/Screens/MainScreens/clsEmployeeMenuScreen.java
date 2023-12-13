package Screens.MainScreens;

import java.util.Scanner;

import FK_Lib.clsInput;
import FK_Lib.clsUtil;
import Screens.ClientScreens.clsAddClientScreen;
import Screens.ClientScreens.clsDeleteClientScreen;
import Screens.ClientScreens.clsFindClientScreen;
import Screens.ClientScreens.clsUpdateClient;

public class clsEmployeeMenuScreen {

    private static Scanner scanner = new Scanner(System.in);

    private static enum enMainMenuChoice {
        _NewClintScreen, _UpdateClintScreen, _FindClintScreen, _DeleteClintScreen, _My_Account, _Logout
    };

    private static void GoToMainMenu() {

        System.out.print("\n\tPress Any Key to Go Back To Main Menu...");
        scanner.nextLine();
        try {
            clsUtil.Clear();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Show();
    }

    private static enMainMenuChoice ReadMainMenuChoice() {

        int Choice = clsInput.ReadInt("\t\t\tEnter Your Choice [1-6] : ", 1, 6);

        switch (Choice) {
            case 1:
                return enMainMenuChoice._NewClintScreen;
            case 2:
                return enMainMenuChoice._UpdateClintScreen;
            case 3:
                return enMainMenuChoice._DeleteClintScreen;
            case 4:
                return enMainMenuChoice._FindClintScreen;
            case 5:
                return enMainMenuChoice._My_Account;
            default:
                return enMainMenuChoice._Logout;
        }
    }

    private static void _Preform_Main_Menu_Choice(enMainMenuChoice Choice) {
        clsUtil.Clear();
        switch (Choice) {
            case _NewClintScreen: {
                clsAddClientScreen.Show();

                GoToMainMenu();
            }
            case _UpdateClintScreen: {
                clsUpdateClient.Show();
                GoToMainMenu();
            }
                break;
            case _FindClintScreen: {
                clsFindClientScreen.Show();
                GoToMainMenu();
            }
                break;
            case _DeleteClintScreen: {
                clsDeleteClientScreen.Show();
                GoToMainMenu();
            }
                break;
            case _My_Account: {
                clsEmployeeAccountScreen.Show();
                Show();
            }
                break;

            default: {

            }
                break;
        }
    }

    public static void Show() {
        clsUtil.Clear();
        clsMainScreen.DrawScreenHeader("\t\tM a i n  M e n u  S c r e e n \n");

        System.out.println("\n\t\t\t----------------------------------------------------------------\n");
        System.out.println("\t\t\t\t\t  ----> M a i n  M e n u  <----  << Employee >>\n");
        System.out.println("\t\t\t----------------------------------------------------------------\n");
        System.out.println("\t\t\t[1]  Add New Client.");
        System.out.println("\t\t\t[2]  Update Client Info.");
        System.out.println("\t\t\t[3]  Delete Client.");
        System.out.println("\t\t\t[4]  Find Client.");
        System.out.println("\t\t\t[5]  My Account.");
        System.out.println("\t\t\t[6]  Logout.");
        System.out.println("\n\t\t\t----------------------------------------------------------------\n");

        _Preform_Main_Menu_Choice(ReadMainMenuChoice());
    }
}
