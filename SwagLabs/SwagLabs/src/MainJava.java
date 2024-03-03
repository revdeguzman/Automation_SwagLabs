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
		obj.screenShot();
		
		obj.dropDown();
		System.out.println("============================================================");
		obj.screenShot();
		
		obj.addItems();
		obj.screenShot();
		obj.viewCart();
		System.out.println("============================================================");
		obj.screenShot();
		
		obj.checkOut();
		System.out.println("============================================================");
		
		obj.inputInfo();
		System.out.println("============================================================");
		obj.screenShot();
		
		obj.proceedCheckOut();
		System.out.println("============================================================");
		obj.screenShot();
		
		obj.checkOutOverview();
		System.out.println("============================================================");
		obj.screenShot();
		
		obj.CheckOutComplete();
		obj.sideMenu();
		obj.screenShot();
		System.out.println("============================================================");

		obj.menuLogout();
		System.out.println("============================================================");
		obj.screenShot();
		
		obj.closeBrowser();
		System.out.println("============================================================");
		
	}
}
