package Modelo;

public class ModeloJogo extends Modelo {

	private String nome;
	private String genero;
	private String descricao;
	private String data_lancamento;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getData_lancamento() {
		return data_lancamento;
	}
	
	public void setData_lancamento(String data_lancamento) {
		this.data_lancamento = data_lancamento;
	}
	
	public void cadastrar() {
		Gamesiirados.Gamesiirados.listas.getLista_jogo().add(this);
	}
	
}
