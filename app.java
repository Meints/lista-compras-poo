public class app {
    public static void main(String[] args) {
        Produto p1 = new Produto("Maçã", 1.35f, 1.20f);
        Produto p2 = new Produto("Banana", 1.10f, 0.90f);
        Produto p3 = new Produto("Melancia", 10.00f, 9.0f);
        Produto p4 = new Produto("Abacate", 5.60f, 5.00f);
        Produto p5 = new Produto("Melão", 9.00f, 9.00f);
        Produto p6 = new Produto("Carambola", 4.60f, 4.35f);
        ListaDeCompras compras = new ListaDeCompras();
        compras.inserirLista(p1);
        compras.inserirLista(p2);
        compras.inserirLista(p3);
        compras.inserirLista(p4);
        compras.inserirLista(p5);
        compras.inserirLista(p6);
        compras.imprimirListaDeCompras();

    }
}
