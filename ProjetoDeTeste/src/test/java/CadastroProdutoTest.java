import org.example.base.BaseTest;
import org.example.pages.CadastroProdutoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CadastroProdutoTest extends BaseTest {

    @Test
    public void validarLinks(){
        CadastroProdutoPage page = new CadastroProdutoPage( getDriver() );
        Assert.assertEquals( page.clicarGoogle() ,
                "https://www.google.com.br/" );
        Assert.assertEquals( page.clicarGZH() ,
                "empresas: Últimas Notícias | GZH");
    }
}
