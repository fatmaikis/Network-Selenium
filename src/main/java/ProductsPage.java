import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {

    By ceketLocator = By.className("resultInfo__title") ;
    By productNameLocator = By.id("product__title");


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductsPage() {

        return isDisplayed(ceketLocator);

    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }
}
