package Testing.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public static void main(String[] args) {

        System.out.println("hello world");
        System.setProperty("web-driver.chrome.driver", "\"C:\\Users\\ranjit\\IdeaProjects\\InstagramBot\\chromedriver.exe\"");

        WebDriver driver = new ChromeDriver();

        // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;

        // URL of the login website
//        driver.get("C:\\JavaCodes\\LearnJava\\src\\LearnTryCatch\\BruteForce\\DemoLogin.html");
        driver.get("https://www.instagram.com/?hl=en");

        // Maximize window size of browser
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id = 'Name']")).sendKeys("ranjit");

        String[] Messages = new String[10];
        Messages[0] = "one";
        Messages[1] = "two";
        Messages[2] = "three";
        Messages[3] = "root#123";
        for (int i = 0; i <= Messages.length; i++) {
            driver.findElement(By.xpath("//input[@id = 'Disc']")).sendKeys(Messages[i]);
            driver.findElement(By.xpath("//button[@id = 'oks']")).click();
        }

    }
}
