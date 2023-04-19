import java.util.Scanner;
public class ListaDeCompras {
    private Produto inicio;
    private int tamanho;
    private float limitar;
    private int cont = 0;

    public ListaDeCompras() {
        this.inicio = null;
        this.tamanho = 0;
    }

    Scanner sc = new Scanner(System.in);

    public boolean listaVazia() {
        return inicio == null;
    }

    public void inserirLista(Produto produto) {
        Produto p = produto;
        if (listaVazia()) {
            if (cont == 0) {
                limitar();
                cont++;
            }
            if (totalNaListaDeCompras()+p.getPrecoPago() < limitar || limitar == 0) {
                p.setProximo(null);
                inicio = p;
                tamanho++;
            }
            else{
                System.out.println("Impossível adicionar " + p.getNome() +", valor ficará maior que o máximo");
            }
        } else {
            if (totalNaListaDeCompras()+p.getPrecoPago() < limitar || limitar == 0) {
                Produto aux = inicio;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(p);
            p.setProximo(null);
            tamanho++;
            }
            else{
                System.out.println("Impossível adicionar " + p.getNome() +", valor ficará maior que o máximo");
            }
        }
    }

    public void imprimirListaDeCompras() {
        int contProduto = 0;
        Produto aux = this.inicio;
        System.out.println("A lista conta com " + tamanhoLista() + " produtos.");
        while (aux != null) {
            contProduto++;
            System.out.println(
                    "Produto " + contProduto + ": " + aux.getNome() + " preço: $" + aux.getPrecoPago());
            aux = aux.getProximo();
        }
        System.out.println("Total: " + totalNaListaDeCompras());
    }

    public float totalNaListaDeCompras() {
        float soma = 0.0f;
        Produto aux = this.inicio;
        while (aux != null) {
            soma += aux.getPrecoPago();
            aux = aux.getProximo();
        }
        return soma;
    }

    public void limitar() {
        System.out.println("Deseja limiter a compra? 0 - para não limitar a compra $ se sim digite em quantos $");
        limitar = sc.nextFloat();
    }

    public int tamanhoLista() {
        if (listaVazia()) {
            return tamanho;
        } else {
            return tamanho;
        }
    }
}
