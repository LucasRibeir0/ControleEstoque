
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        //Array(lista) do tipo produto, variável produtos = instância de um array vazio
        ArrayList<Produto> produtos = new ArrayList<>();


        Produto martelo = new Produto("Martelo","49.99",14);

        martelo.setQuantidade(25);
        Produto alicate = new Produto("Alicate","38.99",28);
        Produto chaveDeFenda = new Produto("Chave de fenda","12.99",52);
        produtos.add(martelo);
        produtos.add(alicate);
        produtos.add(chaveDeFenda);
        produtos.removeIf(produto -> produto.getNome().equals("Martelo"));

        System.out.println("Produtos restante no estoque: "+produtos.size());
        boolean atualizado = atualizarQuantidade(produtos,"Chave de fenda",600);
        retornoAtualizacao(atualizado);
        int total = calcularTotalEstoque(produtos);
        System.out.println("Total de unidades em estoque: "+total);
        listarProdutos(produtos);





    }
    //retorna o total de unidades de produtos no estoque
    public static int calcularTotalEstoque(ArrayList<Produto>produtos){
        int total = 0;
        for (Produto produto:produtos){
            total+= produto.getQuantidade();
        }
        return total;
    }
    public static void listarProdutos(ArrayList<Produto>produtos){
        for (Produto produto : produtos){

            System.out.println(produto);

            }


        }
        public static boolean atualizarQuantidade(ArrayList<Produto> produtos,
                                               String nome,int novaQuantidade){
        for (Produto produto: produtos){
            if (produto.getNome().equals(nome)){
                produto.setQuantidade(novaQuantidade);
                return true;
            }
        }return false;
        }
        public static void retornoAtualizacao(boolean atualizado){
            if (atualizado){
                System.out.println("Seu produto foi atualizado!");
            }else {
                System.out.println("Produto não localizado!");
            }
        }
    }

