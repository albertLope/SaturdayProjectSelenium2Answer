import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMe {

    /*
    NOTE: Create your own account in the website in manual part

    Navigate to website http://a.testaddressbook.com/sign_in

    Click on sign up button

    Automation part
        Navigate to http://a.testaddressbook.com/sign_in

        Enter the username and password

        Click on sign in button

        Click on Addresses

        Click on new address button

        Enter the first name "Fernando"

        Enter the last name  "Torres"

        Enter the address 1 "Anfield Rd"

        Enter the address 2 "Anfield"

        Enter the city "Liverpool"

        Enter the Zipcode "L4 0TH"

        Click on United States

        Enter the birthday "03/20/1984"

        Enter the age "36"

        Enter the WebSite "https://www.google.com/"

        Enter the phone "8625747878"

        Click on Climbing and Dancing

        Enter the Note "Never Back Down"

        Click on Create Address button

        Verify the first name as "Fernando"

        Verify the last name as "Torres"

        Click on Addresses

        Click on Edit button

        Change the first name as "Peter"

        Change the last name as "Crouch"

        Click on Update address

        Verify the first name as "Peter"

        Verify the last name as "Crouch"

        Click on Addresses

        Click on Destroy

        Address should be removed


     */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("http://a.testaddressbook.com/sign_in");

        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("session_email"));
        username.sendKeys("makoklu32@gmail.com");

        WebElement password = driver.findElement(By.id("session_password"));
        password.sendKeys("China1949.");

        WebElement signInButton = driver.findElement(By.xpath("//input[@value='Sign in']"));
        signInButton.click();

        WebElement buttonAddress = driver.findElement(By.xpath("//a[@data-test='addresses']"));
        buttonAddress.click();

        Thread.sleep(2000);

        WebElement newAddress = driver.findElement(By.linkText("New Address"));
        newAddress.click();

        Thread.sleep(2000);
        String name=  "techno";
        WebElement inputFirstName = driver.findElement(By.id("address_first_name"));
        inputFirstName.sendKeys(name);

        String last = "Study";
        WebElement inputLastName = driver.findElement(By.id("address_last_name"));
        inputLastName.sendKeys(last);

        WebElement inputAddress = driver.findElement(By.id("address_street_address"));
        inputAddress.sendKeys("123 Main");

        WebElement inputAddress2 = driver.findElement(By.id("address_secondary_address"));
        inputAddress2.sendKeys("none");

        WebElement City = driver.findElement(By.id("address_city"));
        City.sendKeys("hell");

        WebElement zipCode = driver.findElement(By.id("address_zip_code"));
        zipCode.sendKeys("07072");

        WebElement unitedStatesRadioButton = driver.findElement(By.xpath("//label[text()='United States']"));
        unitedStatesRadioButton.click();

        WebElement dateOfBirth = driver.findElement(By.id("address_birthday"));
        dateOfBirth.sendKeys("11112000");

        WebElement ageInput = driver.findElement(By.id("address_age"));
        ageInput.sendKeys("25");

        WebElement websiteInput = driver.findElement(By.id("address_website"));
        websiteInput.sendKeys("https://www.google.com/");

        WebElement phoneInput = driver.findElement(By.id("address_phone"));
        phoneInput.sendKeys("8625744557");

        WebElement climbingCheckBox = driver.findElement(By.xpath("//label[text()='Climbing']"));
        climbingCheckBox.click();

        WebElement DancingCheckBox = driver.findElement(By.xpath("//label[text()='Dancing']"));
        DancingCheckBox.click();

        WebElement noteInput = driver.findElement(By.id("address_note"));
        noteInput.sendKeys("There is no Note");

        WebElement createAddressButton = driver.findElement(By.xpath("//input[@value='Create Address']"));
        createAddressButton.click();

        WebElement firstName = driver.findElement(By.xpath("//span[@data-test='first_name']"));
        String fName = firstName.getText();

        Assert.assertEquals(fName , name);

        WebElement lastname = driver.findElement(By.xpath("//span[@data-test='last_name']"));
        String lName = lastname.getText();

        Assert.assertEquals(last , lName);

        buttonAddress = driver.findElement(By.xpath("//a[@data-test='addresses']"));
        buttonAddress.click();

        Thread.sleep(2000);

        WebElement EditButton = driver.findElement(By.linkText("Edit"));
        EditButton.click();

        Thread.sleep(2000);

        String name2 = "King";
        inputFirstName = driver.findElement(By.id("address_first_name"));
        inputFirstName.clear();
        inputFirstName.sendKeys(name2);

        String last2 = "Salah";
        inputLastName = driver.findElement(By.id("address_last_name"));
        inputLastName.clear();
        inputLastName.sendKeys(last2);

        WebElement updateAddressButton = driver.findElement(By.xpath("//input[@value='Update Address']"));
        updateAddressButton.click();

        Thread.sleep(2000);

        firstName = driver.findElement(By.xpath("//span[@data-test='first_name']"));
        fName = firstName.getText();

        Assert.assertEquals(fName , name2);

        lastname = driver.findElement(By.xpath("//span[@data-test='last_name']"));
        lName = lastname.getText();

        Assert.assertEquals(lName , last2);

        buttonAddress = driver.findElement(By.xpath("//a[@data-test='addresses']"));
        buttonAddress.click();

        Thread.sleep(2000);

        WebElement destroyButton = driver.findElement(By.linkText("Destroy"));
        destroyButton.click();

        driver.switchTo().alert().accept();



    }


}
