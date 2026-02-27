package br.com.fiapride.main;

import br.com.fiapride.model.LampadaRGB;

public class SistemaPrincipal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dentro do main...// Fabriquei a primeira (Instância 1)
		LampadaRGB minhaLampada = new LampadaRGB();
		minhaLampada.cor = "#0000FF - Azul";
		minhaLampada.intensidade = 51;
		minhaLampada.marca = "Samsung";
		minhaLampada.pareado = "Sim";
		minhaLampada.bluetooth_ativo = true;
		// Fabriquei a segunda (Instância 2)
		LampadaRGB professorLampada = new LampadaRGB();
		professorLampada.cor = "#FFFF00 - Amarelo";
		professorLampada.intensidade = 92;
		professorLampada.marca = "Apple";
		professorLampada.pareado = "Sim";
		professorLampada.bluetooth_ativo = true;

		System.out.println("Minha Lâmpada é: " + minhaLampada.cor);
		System.out.println("A Lâmpada do professor é: " + professorLampada.cor);
		
		System.out.println();
		
		System.out.println("Alterando cor... -> Vermelho");
        minhaLampada.alterarCor("#FF0000 - Vermelho");
		System.out.println("Minha Lâmpada é: " + minhaLampada.cor);
		System.out.println("Alterando cor... -> Preto");
        minhaLampada.alterarCor("#000000 - Preto");
		
		
		System.out.println();
		
		System.out.println("Alterando intensidade... -> +100");
        minhaLampada.alterarIntensidade(100);
		System.out.println("Intensidade da minha Lâmpada é: " + minhaLampada.intensidade);
		System.out.println("Alterando intensidade... -> -200");
        minhaLampada.alterarIntensidade(-200);



	}

}
