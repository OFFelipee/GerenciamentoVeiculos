// Classe Carro que herda de Veiculo e adiciona o atributo numeroPortas
public class Carro extends Veiculo {
    public int numeroPortas; 

    public Carro() {}

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String informacoesVeiculo() {
        return "Carro: marca=" + marca +
               ", modelo=" + modelo +
               ", ano=" + getAno() +
               ", numeroPortas=" + numeroPortas;
    }
}