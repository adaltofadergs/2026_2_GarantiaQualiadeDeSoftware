package org.example.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroProdutoPage extends BasePage{

    @FindBy( id = "txt01")
    private WebElement txtNomeProduto;

    @FindBy ( id = "categoria")
    private WebElement selCategoria;

    @FindBy ( id = "venda")
    private WebElement selCanalVenda;

    public CadastroProdutoPage(WebDriver driver){
        super(driver);
    }
}
