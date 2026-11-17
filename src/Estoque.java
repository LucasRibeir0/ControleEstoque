import java.util.ArrayList;
public class Estoque {
    //Lista que armazena referências para objetos Produto
    private ArrayList<Produto>produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    public void listarProdutos(){
        for (Produto produto: produtos){
            System.out.println("Produto: "+produto+"\n");
        }
    }
    public boolean atualizarQuantidade(String nome,int novaQuantidade){
        for (Produto produto:produtos){
            if (produto.getNome().equals(nome)){
                produto.setQuantidade(novaQuantidade);
                return true;
            }
            }

        return false;
    }
    public boolean removerProduto(String nome){
        return produtos.removeIf(produto -> produto.getNome().equals(nome));

    }

    public void retornoRemover(boolean remove){
        if (remove){
             System.out.println("Produto removido!");
        }else {
            System.out.println("Erro de remoção!");
        }
    }
    public int calcularTotalEstoque(){
        int total = 0;
        for (Produto produto:produtos){
            total+= produto.getQuantidade();
        }
        return total;
    }


}
