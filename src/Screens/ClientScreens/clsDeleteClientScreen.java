package Screens.ClientScreens;

import CORE.Client;
import FK_Lib.clsInput;
import FK_Lib.clsUtil;
import Screens.MainScreens.clsMainScreen;

public class clsDeleteClientScreen extends clsMainScreen {
    private static void Reset() {
        clsUtil.Clear();
        clsMainScreen.DrawScreenHeader("\t\tD e l e t e  C l i e n t  S c r e e n");
    }

    private static void Print(Client Object) {
        // No GUI Inside Core Class
        System.out.println("\n\t\t\t--------------------->> Client Card <<---------------------");
        System.out.println("\t\t\t   ID               : " + Object.GetID());
        System.out.println("\t\t\t   Full Name        : " + Object.GetFirstName() + " " + Object.GetLastName());
        System.out.println("\t\t\t   Phone            : " + Object.GetPhone());
        System.out.println("\t\t\t   Username         : " + Object.GetUsername());
        System.out.println("\t\t\t   Password         : " + Object.GetPassword());
        System.out.println("\t\t\t-----------------------------------------------------------");
    }

    public static void Show() {
        clsMainScreen.DrawScreenHeader("\t\tD e l e t e  C l i e n t  S c r e e n");
        String FullName_Or_AccountNumber = clsInput.ReadText("Enter Full Name Or Account Number  : ");
        char Answer;
        Reset();
        if (Client.IsExist(FullName_Or_AccountNumber)) {
            Client Client_To_Delete = Client.Find(FullName_Or_AccountNumber);
            Print(Client_To_Delete);
            Answer = clsInput.ReadAnswer("\n\nAre You Sure You Want To Delete This Account[Y-N] : ");
            if (Answer == 'Y' || Answer == 'y') {

                Client_To_Delete.Delete();
                Reset();
                System.out.println("\nClient Deleted Successfully :-) :-)");
            } else {
                Reset();
                System.out.println("\nProcess Has Been Canceled :-) :-)");
            }
        } else {
            System.out.println("\n\tClient Not Found!!");
        }

    }

}
