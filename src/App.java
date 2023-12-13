
import CORE.Bank;
import CORE.Employee;
import Screens.MainScreens.clsLoginScreen;

public class App {
    public static void main(String[] args) {

        while (true) {
            Bank bank = new Bank();

            if (!clsLoginScreen.Show()) {
                break;
            }

            Bank.Save_ALL_Records_To_File();
        }
    }
}
