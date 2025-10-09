import java.util.ArrayList;
import java.util.List;

public class ItemPedido {
    private String nomeProduto;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(String nomeProduto, int quantidade, double precoUnitario) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double calcularSubtotal() {
        return quantidade * precoUnitario;
    }
}

public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>(); 

    public void adicionarItem(String nomeProduto, int quantidade, double preco) {
        ItemPedido novoItem = new ItemPedido(nomeProduto, quantidade, preco); 
        this.itens.add(novoItem);
    }

    public double valorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }
}

public class MainPedido {
    public static void main(String[] args) {
        Pedido meuPedido = new Pedido();

        meuPedido.adicionarItem("Teclado", 2, 150.00); 
        meuPedido.adicionarItem("Mouse", 1, 80.00);   

        double total = meuPedido.valorTotal();
        System.out.printf("O valor total do pedido é: R$ %.2f\n", total);
    }
}
