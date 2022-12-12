package Modelo;

public abstract class Modelo {
	
	private Integer id;
	private Float valor;
	
	public abstract void cadastrar();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}
	
}
