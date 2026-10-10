package org.example.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CadastroProdutoPage extends BasePage{

    @FindBy( id = "txt01")
    private WebElement txtNomeProduto;

    @FindBy ( id = "categoria")
    private WebElement selCategoria;

    @FindBy ( id = "venda")
    private WebElement selCanalVenda;

    @FindBy ( id = "txt02")
    private WebElement txtEstoqueMinimo;

    @FindBy ( xpath = "/html/body/div/form/fieldset/div[5]/input")
    private WebElement txtEstoqueMaximo;

    @FindBy ( id = "sim")
    private WebElement rbSim;

    @FindBy ( name = "venda")
    private WebElement rbNao;


    @FindBy ( xpath = "/html/body/div/form/div[3]/label/input")
    private WebElement cbUnidade;

    @FindBy ( xpath = "/html/body/div/form/div[4]/label/input")
    private WebElement cbCaixa;

    @FindBy ( xpath = "/html/body/div/form/div[5]/label/input")
    private WebElement cbPacote;

    @FindBy ( xpath = "/html/body/div/form/div[6]/label/input")
    private WebElement cbDuzia;

    @FindBy ( id = "elementosForm:cadastrar")
    private WebElement btnCadastrar;

    @FindBy ( linkText = "google")
    private WebElement linkGoogle;

    @FindBy ( partialLinkText = "GZH")
    private WebElement linkGZH;


    public CadastroProdutoPage(WebDriver driver){
        super(driver);
    }


    public CadastroProdutoPage informarNome(String nome){
        txtNomeProduto.sendKeys( nome );
        return this;
    }

    public CadastroProdutoPage informarEstoqueMinimo(String estMinimo){
        txtEstoqueMinimo.sendKeys( estMinimo );
        return this;
    }
    public CadastroProdutoPage informarEstoqueMinimo(double estMinimo){
        txtEstoqueMinimo.sendKeys( String.valueOf(estMinimo) );
        return this;
    }

    public CadastroProdutoPage informarEstoqueMaximo(String estMaximo){
        txtEstoqueMaximo.sendKeys( estMaximo );
        return this;
    }

    public CadastroProdutoPage selecionarCategoria(String categoria){
        Select dropdown = new Select( selCategoria );
        dropdown.selectByVisibleText( categoria );
        return this;
    }

    public CadastroProdutoPage selecionarCategoria(int indexCategoria){
        Select dropdown = new Select( selCategoria );
        dropdown.selectByIndex( indexCategoria );
        return this;
    }

//    public CadastroProdutoPage selecionarCanalVenda(String canal01, String canal02){
//        Select dropdown = new Select( selCanalVenda );
//        dropdown.selectByVisibleText( canal01);
//        dropdown.selectByVisibleText( canal02);
//        return this;
//    }

    public CadastroProdutoPage selecionarCanalVenda(String... canais){
        Select dropdown = new Select( selCanalVenda );
        for(String canal : canais){
            dropdown.selectByVisibleText( canal );
        }
        return this;
    }

    public CadastroProdutoPage selecionarSim(){
        rbSim.click();
        return this;
    }
    public CadastroProdutoPage selecionarNao(){
        rbNao.click();
        return this;
    }

    public CadastroProdutoPage selecionarUnidade(){
        cbUnidade.click();
        return this;
    }

    public CadastroProdutoPage selecionarCaixa(){
        cbCaixa.click();
        return this;
    }
    public CadastroProdutoPage selecionarDuzia(){
        cbDuzia.click();
        return this;
    }
    public CadastroProdutoPage selecionarPacote(){
        cbPacote.click();
        return this;
    }

    public String clicarGZH(){
        linkGZH.click();
        String titulo = driver.getTitle();
        driver.navigate().back();
        return titulo;
    }

    public String clicarGoogle(){
        linkGoogle.click();
        String url = driver.getCurrentUrl();
        driver.navigate().back();
        return url;
    }

    public CadastroProdutoPage clicarBtnCadastrar(){
        btnCadastrar.click();
        return this;
    }

    public String buscarResultadoCadastro(){
        return driver.getPageSource();
    }


}
