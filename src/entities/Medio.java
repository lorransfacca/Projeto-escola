package entities;

public class Medio extends Estudante {
	private int contadorBoletim;

	public Medio(int matricula, String cpf, double pontos, boolean status, String nome, int contadorBoletim) {
		super(matricula, cpf, pontos, status, nome);
		this.contadorBoletim = contadorBoletim;
	}

	public int getContadorBoletim() {
		return contadorBoletim;
	}

	public void setContadorBoletim(int contadorBoletim) {
		this.contadorBoletim = contadorBoletim;
	}
	
	
}
