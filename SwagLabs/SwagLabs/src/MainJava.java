import java.io.IOException;

public class MainJava extends SeleniumJava {
	public static void main(String[] args) throws InterruptedException, IOException {

		SeleniumJava obj = new SeleniumJava();
		
		obj.launchBrowser();
		System.out.println("============================================================");
		
		obj.maxWindow();
		System.out.println("============================================================");
		
		obj.navigateURL();
		System.out.println("============================================================");
		
		obj.userLogin();
		System.out.println("============================================================");
		
		obj.homePage();
		System.out.println("============================================================");
		
		obj.dropDown();
		System.out.println("============================================================");
		
		obj.addItems();
		System.out.println("============================================================");
		
		obj.checkOut();
		System.out.println("============================================================");
		
		obj.inputInfo();
		System.out.println("============================================================");
		
		System.out.println("============================================================");

		obj.checkOutOverview();
		System.out.println("============================================================");
		
		obj.CheckOutComplete();
		obj.sideMenu();
		System.out.println("============================================================");

		obj.menuLogout();
		System.out.println("============================================================");
		
		obj.closeBrowser();
		System.out.println("============================================================");

		//By: Rev Christian
		//For Testing purposes only.
	}
}
