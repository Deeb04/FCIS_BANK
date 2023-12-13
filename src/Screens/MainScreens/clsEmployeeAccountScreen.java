package Screens.MainScreens;

import java.util.Scanner;

import FK_Lib.clsInput;
import FK_Lib.clsUtil;

public class clsEmployeeAccountScreen extends clsMainScreen {

    private static Scanner scanner = new Scanner(System.in);

    private static enum enChoice {
        _Display_Account, _Update_Account, _Logout
    };

    private static void _Go_To_Main_Menu() {
        System.out.print("\n\tPress Any Key to Go Back To Main Menu...");
        scanner.nextLine();
        clsUtil.Clear();
        Show();
    }

    private static enChoice _Read_Main_Menu_Choice() {
        int Choice = clsInput.ReadInt("\t\t\tEnter Your Choice [1-3] : ", 1, 3);

        switch (Choice) {
            case 1:
                return enChoice._Display_Account;
            case 2:
                return enChoice._Update_Account;
            default:
                return enChoice._Logout;
        }

    }

    private static void _Preform_Main_Menu_Choice(enChoice Choice) {
        clsUtil.Clear();
        switch (Choice) {
            case _Display_Account: {
                System.out.println("Write Code To Display Account Information");
                //
                _Go_To_Main_Menu();
            }
                break;
            case _Update_Account: {
                System.out.println("Write Code To Update Account Information");
                _Go_To_Main_Menu();
            }
                break;
            case _Logout: {

            }

        }

    }

    public static void Show() {
        clsUtil.Clear();
        clsMainScreen.DrawScreenHeader("\t\tM y  A c c o u n t  S c r e e n \n");

        System.out.println("\n\t\t\t----------------------------------------------------------------\n");
        System.out.println("\t\t\t\t     ----> M y  A c c o u n t  <----    << Employee >>\n");
        System.out.println("\t\t\t----------------------------------------------------------------\n");
        System.out.println("\t\t\t[1]  Display Account.");
        System.out.println("\t\t\t[2]  Update Account.");
        System.out.println("\t\t\t[3]  Main Menu.");
        System.out.println("\n\t\t\t----------------------------------------------------------------\n");

        _Preform_Main_Menu_Choice(_Read_Main_Menu_Choice());

    }

}
