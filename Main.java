public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Toyota";
        carro.modelo = "Corolla";
        carro.setAno(2020);
        carro.numeroPortas = 4;

        Moto moto = new Moto();
        moto.marca = "Honda";
        moto.modelo = "CB 500";
        moto.setAno(2019);
        moto.setCilindrada(500);

        System.out.println(carro.informacoesVeiculo());
        System.out.println(moto.informacoesVeiculo());
    }
}
