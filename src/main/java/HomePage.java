import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage extends BasePage{

    SearchBox searchBox;
    By cartCountLocator = By.className("header__basket--count");
    By cartShoppingBagLocator = By.className("header__icon -shoppingBag");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox();
    }

    public boolean isProductCountUp() {
        return getCartCount() > 0 ;
    }

    public void goToCart() {
        click(cartShoppingBagLocator);
    }

    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }
}
