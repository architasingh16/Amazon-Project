/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author archita
 */
public class AmazonTestNG {
    private WebDriver driver;
  private String baseUrl;
    
    public AmazonTestNG() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
         System.setProperty("webdriver.chrome.driver", "c:\\data\\edgedriver.exe");
    driver = new EdgeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
      
  @Test
  public void testAmazonTestCase() throws Exception {
    driver.get("https://www.amazon.com/");
    driver.findElement(By.id("ap_email")).click();
    driver.findElement(By.id("ap_email")).clear();
    driver.findElement(By.id("ap_email")).sendKeys("archita.singh16@gmail.com");
    driver.findElement(By.xpath("//input[@id='continue']")).click();
    driver.findElement(By.id("ap_password")).clear();
    driver.findElement(By.id("ap_password")).sendKeys("!Archishri123");
    driver.findElement(By.id("signInSubmit")).click();
  }
  @Test
  public void testProduct1() throws Exception {
    driver.get("https://www.amazon.com/gp/yourstore/home?path=%2Fgp%2Fyourstore%2Fhome&signIn=1&useRedirectOnSuccess=1&action=sign-out&ref_=nav_AccountFlyout_signout");
    driver.findElement(By.linkText("Holiday Gift Guide")).click();
    driver.get("https://www.amazon.com/gcx/Holiday-Gift-Guide/gfhz/events/?categoryId=HOL22-HUB&ref_=nav_cs_holgiftguide");
    driver.findElement(By.xpath("//img[@alt='Holiday Deals']")).click();
    driver.get("https://www.amazon.com/deals/ref=hol22_DT_gf_md_nav_main_W1_2.5_1?pf_rd_r=TT5Y9TR7DYM0GJF77W3B&pf_rd_p=32e8d583-34b3-4883-b051-e32675e8e41e&pf_rd_m=ATVPDKIKX0DER&pf_rd_s=top-slot-2&pf_rd_t=&pf_rd_i=");
    driver.findElement(By.xpath("//img[@alt='Godinger Barware, Drinkware, and Gifts']")).click();
    driver.get("https://www.amazon.com/deal/28d5a3e6?showVariations=true&ref=dlx_deals_gd_dcl_img_3_28d5a3e6_dt_sl15_25");
    driver.findElement(By.xpath("//div[@id='octopus-dlp-asin-stream']/ul/li/span/div/div/a/div")).click();
    driver.get("https://www.amazon.com/Godinger-Cigar-Glass-Fashioned-Indented/dp/B07KX64VT8?ref_=Oct_DLandingS_D_28d5a3e6_60");
    driver.findElement(By.id("add-to-cart-button")).click();
    driver.findElement(By.xpath("//span[@id='attach-sidesheet-checkout-button']/span/input")).click();
    driver.get("https://www.amazon.com/gp/cart/desktop/go-to-checkout.html?proceedToCheckout=Proceed&cartInitiateId=1670302702388&ref_=dp_atch_dss_proceed");
  }
    @Test
  public void testProduct3() throws Exception {
          driver.get("https://www.amazon.com/gp/yourstore/home?path=%2Fgp%2Fyourstore%2Fhome&signIn=1&useRedirectOnSuccess=1&action=sign-out&ref_=nav_AccountFlyout_signout");
    //driver.get("https://www.amazon.com/");
    driver.findElement(By.linkText("Holiday Gift Guide")).click();
    driver.findElement(By.xpath("//img[@alt='Kids 9-11']")).click();
    driver.findElement(By.xpath("//img[contains(@src,'https://m.media-amazon.com/images/I/51cNU2ffBvS._AC_SY164_.jpg')]")).click();
    driver.findElement(By.xpath("//span[@id='dropdown_selected_size_name']/span/span")).click();
    driver.findElement(By.id("native_dropdown_selected_size_name_6")).click();
    driver.findElement(By.xpath("//img[@alt='Caramel/Pink']")).click();
    driver.findElement(By.id("add-to-cart-button")).click();
    
  }
}