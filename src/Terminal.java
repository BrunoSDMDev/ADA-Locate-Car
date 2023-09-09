import modelo.Carro;
import modelo.ClienteFisico;
import modelo.ClienteJuridico;
import modelo.Tamanho;
import servico.CarroServico;

import java.util.ArrayList;

public class Terminal {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ClienteFisico joao = new ClienteFisico("João", "Campinas", new ArrayList<>(), "123456789-0");
        ClienteJuridico empresaJoao = new ClienteJuridico("Empresa","Campinas",new ArrayList<>());

        System.out.println(joao.toString());
        System.out.println(empresaJoao.toString());

        Carro carro = new Carro(1, "BMW", "Bmw", "azul", " sadasda", Tamanho.MEDIO );



    }
}