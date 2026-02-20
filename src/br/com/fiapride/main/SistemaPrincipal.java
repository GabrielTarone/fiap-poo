package br.com.fiapride.main;

import br.com.fiapride.model.*;

// Importamos a classe Passageiro para que o sistema a reconheça
//import br.com.fiapride.model.Passageiro;
//
public class SistemaPrincipal {
	public static void main(String[] args) {
		// Dentro do main...// Fabriquei a primeira (Instância 1)
		LampadaRGB minhaLampada = new LampadaRGB();
		minhaLampada.cor = "Azul";
		minhaLampada.intensidade = 51;
		minhaLampada.marca = "Samsung";
		minhaLampada.pareado = "Sim";
		minhaLampada.bluetooth_ativo = true;
		// Fabriquei a segunda (Instância 2)
		LampadaRGB professorLampada = new LampadaRGB();
		professorLampada.cor = "Amarelo";
		professorLampada.intensidade = 92;
		professorLampada.marca = "Apple";
		professorLampada.pareado = "Sim";
		professorLampada.bluetooth_ativo = true;

		System.out.println("Minha Lâmpada é: " + minhaLampada.cor);
		System.out.println("A Lâmpada do professor é: " + professorLampada.cor);

//    public static void main(String[] args) {
//        // INSTANCIAÇÃO
//        // O comando 'new' aloca memória para um novo objeto.
//        // Criando o primeiro passageiro (Objeto 1)
//        Passageiro passageiro1 = new Passageiro();
//        passageiro1.nome = "Ana Silva";
//        passageiro1.saldo = 50.0;
//
//        // Criando o segundo passageiro (Objeto 2)
//        Passageiro passageiro2 = new Passageiro();
//        passageiro2.nome = "Carlos Souza";
//        passageiro2.saldo = 12.50;
//
//        // Exibindo os dados no Console
//        System.out.println("--- Sistema FiapRide ---");
//        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
//        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
//        
//        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
	}
}
