import java.math.BigDecimal;
import java.util.ArrayList;

public class Produto {
    private int id;
    private String nome;
    private BigDecimal preco;
    private int quantidade;
    public Produto(String nome, BigDecimal preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Produto(String nome, String preco, int quantidade) {
        this.nome = nome;
        this.preco = new BigDecimal(preco);
        this.quantidade = quantidade;
    }
    //método de retorno;
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public BigDecimal getPreco(){
        return preco;
    }
    public void setPreco(BigDecimal preco){
        this.preco = preco;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }


    @Override
    public String toString() {
        return "Nome: "+nome+ "\nPreço: "+preco + "\nQuantidade: "+quantidade+"\n" ;

    }

}

