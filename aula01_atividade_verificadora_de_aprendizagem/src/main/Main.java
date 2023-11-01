package main;

import fabrica_de_auto.Caminhao;
import fabrica_de_auto.FabricaDeAuto;
import fabrica_de_auto.FabricaFiat;
import fabrica_de_auto.FabricaFord;
import fabrica_de_auto.Onibus;
import fabrica_de_auto.Popular;
import fabrica_de_auto.Sedan;

public class Main {

    public static void main(String[] args) {
    	 // Criar uma fábrica da Fiat
        FabricaDeAuto fabricaFiat = new FabricaFiat();

        // Criar um Sedan da Fiat
        Sedan siena = fabricaFiat.criarSedan();
        siena.exibirInfoSedan();

        // Criar um Carro Popular da Fiat
        Popular palio = fabricaFiat.criarPopular();
        palio.exibirInfoPopular();

        // Criar um Ônibus da Fiat
        Onibus fiatBus = fabricaFiat.criarOnibus();
        fiatBus.exibirInfoOnibus();

        // Criar uma fábrica da Ford
        FabricaDeAuto fabricaFord = new FabricaFord();

        // Criar um Sedan da Ford
        Sedan fiestaSedan = fabricaFord.criarSedan();
        fiestaSedan.exibirInfoSedan();

        // Criar um Carro Popular da Ford
        Popular fiesta = fabricaFord.criarPopular();
        fiesta.exibirInfoPopular();

        // Criar um Caminhão da Ford
        Caminhao fordTruck = fabricaFord.criarCaminhao();
        fordTruck.exibirInfoCaminhao();

    }
    
}
