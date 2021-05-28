package entities;

public abstract class Estudante {
	private int matricula;
	private String cpf;
	private double pontos;
	private boolean status;
	private String nome;
	
	public Estudante(int matricula, String cpf, double pontos, boolean status, String nome) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.pontos = pontos;
		this.status = status;
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getMatricula() {
		return matricula;
	}

	public double getPontos() {
		return pontos;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void adicionarNota(double pontos) {
		this.pontos += pontos;
	}
	
	public void tirarNota(double pontos) {
		this.pontos -= pontos;
	}
}
