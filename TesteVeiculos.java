package veiculos;

public class TesteVeiculos {

    public static void main(String[] args) {
        
        Carro carro1 = new Carro("Ford", "Focus", 4);
        Moto moto1 = new Moto("Honda", "CB 500F", 500);
        Carro carro2 = new Carro("Fiat", "Uno", 2);
        
        Veiculo[] frota = new Veiculo[3];
        frota[0] = carro1;
        frota[1] = moto1;
        frota[2] = carro2;
        
        System.out.println("--- Exibindo a Frota de Veículos ---");
        
        for (Veiculo v : frota) {
            v.exibirInfo(); 
            System.out.println("-------------------------------------");
        }
    }
}
