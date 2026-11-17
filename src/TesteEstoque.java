public class TesteEstoque {
    static void main() {
        Estoque estoque = new Estoque();
        Produto martelo = new Produto("Martelo","49.99",14);
        Produto alicate = new Produto("Alicate","12.99",45);
        estoque.adicionarProduto(martelo);
        estoque.adicionarProduto(alicate);
        estoque.listarProdutos();
        boolean atualizado = estoque.atualizarQuantidade("Martelo",30);
        if (atualizado) {
            System.out.println("Seu produto foi atualizado!");

        }else {
            System.out.println("Não foi possível atualizar!");
        }
        estoque.listarProdutos();
        boolean remove = estoque.removerProduto("Alicate");
        estoque.retornoRemover(remove);
        estoque.listarProdutos();
        boolean furadeira = estoque.removerProduto("Furadeira");
        estoque.retornoRemover(furadeira);
        int total = estoque.calcularTotalEstoque();
        System.out.println("Total do estoque: "+total);
        System.out.println("Total estoque: "+ estoque.calcularTotalEstoque());

    }
}
