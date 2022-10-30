package step_definitions;


import com.example.pageObject.InventoryPage;
import com.example.pageObject.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PurchaseSteps {

    private WebDriver webDriver;

    public PurchaseSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User sort product list by \"(.*)\"")
    public void selectProductCart(String sortProduct) throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Thread.sleep(3000);
        inventoryPage.setProductSort(sortProduct);
    }
    @Then("User click add to chart on the chosen item")
    public void selectItem() throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Thread.sleep(3000);
        inventoryPage.setChartBackpack();
        inventoryPage.setChartBikeLight();
        inventoryPage.setChartBoltTshirt();
        inventoryPage.setChartFleeceJacket();
        inventoryPage.setChartOnesie();
        inventoryPage.setChartTshirtRed();
    }

    @Then("User click the shopping cart")
    public void shoppingCart() throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Thread.sleep(3000);
        inventoryPage.setShoppingCart();
    }

    @And("User click remove button on the chosen item")
    public void removeChart() throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Thread.sleep(3000);
        inventoryPage.setRemoveChartBackpack();
        inventoryPage.setRemoveChartBikeLight();
    }

    @Then("User click checkout button")
    public void buttonCheckout() throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Thread.sleep(3000);
        inventoryPage.setButtonCheckout();
    }

    @Then("User input \"(.*)\" as firstName and \"(.*)\" as lastName and \"(.*)\" as postalCode")
    public void inputCredential(String firstName, String lastName, String postalCode) throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Thread.sleep(3000);
        inventoryPage.setInputFirstName(firstName);
        inventoryPage.setInputLastName(lastName);
        inventoryPage.setInputPostalCode(postalCode);
    }

    @And("User click continue button")
    public void buttonContinue() throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Thread.sleep(3000);
        inventoryPage.setButtonContinue();
    }

    @Then("User should get \"(.*)\" as expected item total")
    public void subTotal(String subTotal) throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Thread.sleep(3000);
        inventoryPage.setSubTotalLabel();
        Assert.assertEquals(subTotal, inventoryPage.setSubTotalLabel());
    }

    @And("User should get \"(.*)\" as expected tax")
    public void taxLabel(String taxLabel) throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Thread.sleep(3000);
        inventoryPage.setTaxLabel();
        Assert.assertEquals(taxLabel, inventoryPage.setTaxLabel());
    }

    @And("User should get \"(.*)\" as expected total")
    public void totalLabel(String totalLabel) throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Thread.sleep(3000);
        inventoryPage.setTotalLabel();
        Assert.assertEquals(totalLabel, inventoryPage.setTotalLabel());
    }

    @Then("User click finish button")
    public void buttonFinish() throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Thread.sleep(3000);
        inventoryPage.setButtonFinish();
    }


    @And("User should get \"(.*)\" as expected succes order")
    public void headerComplete(String complete) throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Thread.sleep(3000);
        inventoryPage.setHeaderComplete();
        Assert.assertEquals(complete, inventoryPage.setHeaderComplete());
    }

    @And("User click back home button")
    public void buttonBackHome() throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Thread.sleep(3000);
        inventoryPage.setButtonBackHome();
    }
}