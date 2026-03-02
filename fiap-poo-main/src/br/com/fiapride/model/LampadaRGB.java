package br.com.fiapride.model;

public class LampadaRGB  {

    private String cor;
    private int intensidade;
    private String marca;
    private String pareado;
    private Boolean bluetooth_ativo;
}
    
public LampadaRGB (String cor, int intensidade, String marca) {
		this.setCor("Amarelo");
		this.setIntensidade(51);
		this.setMarca("Samsung");
	
	}
    
    
    public String getCor() {
    	return this.cor;
    }
    
    public int getIntensidade() {
    	return this.intensidade;
    }
    
    public String getMarca() {
    	return this.marca;
    }
    
    public String getPareado() {
    	return this.pareado;
    }
    
    public Boolean getBluetooth_ativo() {
    	return this.bluetooth_ativo;
    }
    
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
