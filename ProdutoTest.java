import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.*;

public class ProdutoTest {
    Produto produto;
    String nome;
    float precoPago, precoDesejado;
    int quant;

    @Before
    public void setUp() {
    nome = "banana";
    precoDesejado = 1.45f;
    precoPago = 1.60f;
    quant = 2;
    produto = new Produto(quant,nome, precoPago, precoDesejado);
    }

    @Test
    public void atributosIniciadosCorretamente(){
        assertEquals(produto.getNome(), nome);
        assertTrue(produto.getPrecoPago() == precoPago);
        assertTrue(produto.getPrecoDesejado() == precoDesejado);
        assertEquals(produto.getQuant(), quant);
    }

    @Test
    public void descricaoProduto(){
        Produto novProduto = new Produto(nome, precoPago, precoDesejado);
        assertEquals(produto.descricaoProduto(), novProduto.descricaoProduto());
    }

    @Test
    public void precoDesejadoMaiorQueZero(){
        float valor = produto.getPrecoDesejado();
        produto.setPrecoDesejado(-5);
        assertTrue(valor == produto.getPrecoDesejado());
    }

    @Test
    public void precoPagoMaiorQueZero(){
        float valor = produto.getPrecoPago();
        produto.setPrecoPago(-3);
        assertTrue(valor == produto.getPrecoPago());
    }

    @Test
    public void quantidadeMaiorOuIgualUm(){
        int quantidade = produto.getQuant();
        produto.setQuant(-6);
        assertEquals(quantidade, produto.getQuant());
    }
}
