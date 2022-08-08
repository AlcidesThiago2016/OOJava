package digitalinnovation.com.EstruturaBasicaOO.Metodos;

import digitalinnovation.com.EstruturaBasicaOO.Metodos.Carro;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW Serie");
        carro1.setCapacidadeTanque(59);

        System.out.println("Informações Veiculo :" + carro1.getModelo());
        System.out.println("Informações Modelo :" + carro1.getModelo());
        System.out.println("Informações Cor :" + carro1.getCor());
        System.out.println("Informações Capacidade Tanque :" +carro1.getCapacidadeTanque());
        System.out.println("Valor Litro Combustivel : R$ " + carro1.totalValorTanque(6.39));

        //Carro carro2 = new Carro("cinza","Mercedes-Benz Classe C", 66);
    }
}
