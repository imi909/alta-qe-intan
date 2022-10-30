package com.example.pageObject;

import cucumber.api.java.eo.Se;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage {
    public static WebDriver driver;

    public InventoryPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private static WebElement productSort;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private static WebElement chartBackpack;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private static WebElement chartBikeLight;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private static WebElement chartBoltTshirt;
    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    private static WebElement chartFleeceJacket;
    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    private static WebElement chartOnesie;
    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    private static WebElement chartTshirtRed;
    @FindBy(css = ".shopping_cart_link")
    private static WebElement shoppingCart;
    @FindBy(id = "remove-sauce-labs-backpack")
    private static WebElement removeChartBackpack;
    @FindBy(id = "remove-sauce-labs-bike-light")
    private static WebElement removeChartBikeLight;
    @FindBy(xpath = "//button[@id='checkout']")
    private static WebElement buttonCheckout;
    @FindBy(xpath = "//input[@id='first-name']")
    private static WebElement inputFirstName;
    @FindBy(xpath = "//input[@id='last-name']")
    private static WebElement inputLastName;
    @FindBy(xpath = "//input[@id='postal-code']")
    private static WebElement inputPostalCode;
    @FindBy(css = "#continue")
    private static WebElement buttonContinue;
    @FindBy(css = ".summary_subtotal_label")
    private static WebElement subtotalLabel;
    @FindBy(css = ".summary_tax_label")
    private static WebElement taxLabel;
    @FindBy(css = ".summary_total_label")
    private static WebElement totalLabel;
    @FindBy(css = "#finish")
    private static WebElement buttonFinish;
    @FindBy(css = ".complete-header")
    private static WebElement headerComplete;
    @FindBy(css = "#back-to-products")
    private static WebElement buttonBackHome;


    public void setProductSort(String sortProduct){
        productSort.click();
        Select a = new Select(productSort);
        a.selectByVisibleText(sortProduct);
    }

    public void setChartBackpack(){
        chartBackpack.click();
    }
    public void setChartBikeLight(){
        chartBikeLight.click();
    }
    public void setChartBoltTshirt(){
        chartBoltTshirt.click();
    }
    public void setChartFleeceJacket(){
        chartFleeceJacket.click();
    }
    public void setChartOnesie(){
        chartOnesie.click();
    }
    public void setChartTshirtRed(){
        chartTshirtRed.click();
    }
    public void setShoppingCart(){
        shoppingCart.click();
    }
    public void setRemoveChartBackpack(){
        removeChartBackpack.click();
    }
    public void setRemoveChartBikeLight(){
        removeChartBikeLight.click();
    }
    public void setButtonCheckout(){
        buttonCheckout.click();
    }
    public void setInputFirstName(String user){
        inputFirstName.sendKeys(user);
    }
    public void setInputLastName(String user){
        inputLastName.sendKeys(user);
    }
    public void setInputPostalCode(String user){
        inputPostalCode.sendKeys(user);
    }
    public void setButtonContinue(){
        buttonContinue.click();
    }
    public String setSubTotalLabel(){
        return subtotalLabel.getText();
    }
    public String setTaxLabel(){
        return taxLabel.getText();
    }
    public String setTotalLabel(){
        return totalLabel.getText();
    }
    public void setButtonFinish(){
        buttonFinish.click();
    }
    public String setHeaderComplete(){
        return headerComplete.getText();
    }
    public void setButtonBackHome(){
        buttonBackHome.click();
    }
}
