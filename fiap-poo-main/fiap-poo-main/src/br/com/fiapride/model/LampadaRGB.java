package br.com.fiapride.model;

public class LampadaRGB {

    public String cor;
    public int intensidade;
    public String marca;
    public String pareado;
    public Boolean bluetooth_ativo;
    
    public void alterarCor(String hexcor) {
        // Regra de negócio: O valor da cor precisa ser um código hexadecimal
        if (hexcor == "#000000 - Preto") {
            System.out.println("Erro: O valor do hexadecimal deve ser maior que zero (Não pode ser Preto).");
            return; // Interrompe a execução do método
        }
        if (hexcor == "#FF0000 - Vermelho") { // - Vermelho

	        this.cor = hexcor;
	        return;
        }
        else {
	        System.out.println("Não foi possível identificar o código da cor");

        }
      }
    public void alterarIntensidade(int novaIntensidade) {
    	// Regra de negócio: O valor da intensidade não pode ser negativo
        if (intensidade < 0) {
            System.out.println("Erro: O valor de intensidade deve ser maior que zero.");
            return; // Interrompe a execução do método
        }
        
        this.intensidade += novaIntensidade; 
    	// Regra de negócio: Checagem se o valor novo seria menor do que zero
        if (intensidade < 0) {
            System.out.println("Erro: O valor de intensidade deve ser maior que zero.");
            return;
        }
        
    }
}
