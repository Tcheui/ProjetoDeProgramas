
public class Sensor {
	String cor;
	double resolucao;
	int framesPorSegundo;
	
	Sensor(){
		this("Azul", 512.0, 240);
	}
	
	Sensor(String cor, double resolucao, int framesPorSegundo){
		this.cor = cor;
		this.resolucao = resolucao;
		this.framesPorSegundo = framesPorSegundo; 
	}
	
	double getMPixelsPorSegundo() {
		return (double) this.resolucao * this.framesPorSegundo;
	}
	
	String getDescricao() {
		return "Sensor: " + "cor=" + this.cor + ", resolucao=" + this.resolucao + "Mp" + ", framesPorSegundo=" + this.framesPorSegundo + "fps" + ", mPixelsPorSegundo=" + this.getMPixelsPorSegundo() + "Mpps.";
	}
	
}
