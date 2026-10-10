import org.example.base.BaseTest;
import org.example.pages.CadastroProdutoPage;
import org.openqa.selenium.devtools.latest.log.Log;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CadastroProdutoTest extends BaseTest {



    @Test
    public void validarCadastro(){
        CadastroProdutoPage page = new CadastroProdutoPage( getDriver() );

        String resultado = page.informarNome("Coca-Cola")
                .selecionarCategoria( 0 )
                .selecionarCanalVenda("WhatsApp" , "Instagram")
                .informarEstoqueMinimo(25.5)
                .informarEstoqueMaximo("50")
                .selecionarSim()
                .selecionarCaixa()
                .selecionarPacote()
                .clicarBtnCadastrar()
                .buscarResultadoCadastro();

        Assert.assertTrue( resultado.contains("Nome: Coca-Cola") );
        Assert.assertTrue( resultado.contains("Categoria:alimento") );
        Assert.assertTrue( resultado.contains("Estoque Minimo: 25.5") );
        Assert.assertTrue( resultado.contains("Estoque Máximo:50") );
        Assert.assertTrue( resultado.contains("Disponibilizar para venda imediata?: sim") );

     //   Assert.assertEquals( resultado, "Formas de Venda: Caixa Pacote " );

        Assert.assertTrue( resultado.contains("Formas de Venda:  Caixa  Pacote ") );
        Assert.assertTrue( resultado.contains("Canais de Venda: WhatsApp  Instagram ") );

    }

    @Test
    public void validarLinks(){
        CadastroProdutoPage page = new CadastroProdutoPage( getDriver() );
        Assert.assertEquals( page.clicarGoogle(),"https://www.google.com/" );
        Assert.assertEquals( page.clicarGZH() ,"Empresas: Últimas Notícias | GZH");
    }
}
