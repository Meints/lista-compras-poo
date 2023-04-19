public class Produto {
    private String nome;
    private float precoPago,precoDesejado;
    private int quant;
    private Produto proximo;
    
    public Produto(String nome, float precoPago, float precoDesejado) {
        this.quant = 1;
        this.nome = nome;
        this.precoPago = precoPago;
        this.precoDesejado = precoDesejado;
        this.proximo = null;
    }
    public Produto(int quant,String nome, float precoPago, float precoDesejado){
        this.nome = nome;
        this.precoPago = precoPago;
        this.precoDesejado = precoDesejado;
        this.setQuant(quant);
        this.proximo = null;
    }

    public String descricaoProduto(){
        return "Nome: " + nome + " Preco: " + precoPago + " Preco Desejado: " + precoDesejado;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPrecoDesejado(float precoDesejado) {
        if (precoDesejado >= 0) {
            this.precoDesejado = precoDesejado;
        }
    }
    public void setPrecoPago(float precoPago) {
        if (precoPago >= 0) {
            this.precoPago = precoPago;
        }
    }
    public void setQuant(int quant) {
        if (quant >= 1) {
            this.quant = quant;
        }
    }
    public int getQuant() {
        return quant;
    }
    public String getNome() {
        return nome;
    }
    public float getPrecoDesejado(){
        return precoDesejado;
    }
    public float getPrecoPago(){
        return precoPago;
    }
    public void setProximo(Produto proximo) {
        this.proximo = proximo;
    }
    public Produto getProximo() {
        return proximo;
    }
    public String getDescricao() {
        return descricaoProduto();
    }
}