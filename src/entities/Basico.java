package entities;

public class Basico extends Estudante {
	private int diaAniversario;

	public Basico(int matricula, String cpf, double pontos, boolean status, String nome, int diaAniversario) {
		super(matricula, cpf, pontos, status, nome);
		this.diaAniversario = diaAniversario;
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	public void bonusAniversario(int dia) {
		if(diaAniversario == dia) {
			super.adicionarNota(getPontos() * 0.1);
		}
	}
	
	public void tirarNota(double pontos) {
		if (pontos < super.getPontos()) {
			super.tirarNota(pontos);	
		}
		else {
			System.out.println("A NOTA NÃO PODE FICAR NEGATIVA!");
		}
	}
}
