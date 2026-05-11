package br.com.fiapride.main;

import br.com.fiapride.model.LampadaRGB;

public class TesteLâmpadaRGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---Teste LâmpadaRGB");
		
        // 1. Instanciando o objeto (criando o espaço na memória)
		LampadaRGB minhaLampada = new LampadaRGB();
        
        // 2. Definindo os atributos diretamente
		minhaLampada.cor = "#0000FF - Azul";
		minhaLampada.intensidade = 51;
		minhaLampada.marca = "Samsung";
		minhaLampada.pareado = "Sim";
		minhaLampada.bluetooth_ativo = true;
        
		// 2.5 Mostrando os valores-base
		System.out.println("Valores-base");
		System.out.println();
		
		System.out.println("Cor da minha Lâmpada é: " + minhaLampada.getCor());
		System.out.println("Intensidade da minha Lâmpada é: " + minhaLampada.getIntensidade());
		System.out.println("Marca da minha Lâmpada é: " + minhaLampada.getMarca());
		System.out.println("Minha Lâmpada está pareada?: " + minhaLampada.getPareado());
		System.out.println("Minha Lâmpada está conectada ao Bluetooh?: " + minhaLampada.getBluetooth_ativo());
		
        // 3. Testando algum comportamento (se você criou na Aula 02)
		System.out.println();
		System.out.println("Métodos");
		System.out.println();

		System.out.println("Alterando cor... -> Vermelho");
        minhaLampada.alterarCor("#FF0000 - Vermelho");
		System.out.println("Alterando intensidade... -> +100");
        minhaLampada.alterarIntensidade(100);
		System.out.println();
        
        // 4. Imprimindo o resultado no console
		System.out.println("Resultados:");
		System.out.println();
		System.out.println("Cor da minha Lâmpada é: " + minhaLampada.getCor());
		System.out.println("Intensidade da minha Lâmpada é: " + minhaLampada.getIntensidade());
        
		
    }
	
}
