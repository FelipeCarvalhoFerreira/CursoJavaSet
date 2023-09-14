package model.entties;

import java.util.Objects;

public class Usuario {
	
	private Integer codigoUnico;

	public Usuario() {
	}

	public Usuario(Integer codigoUnico) {
		this.codigoUnico = codigoUnico;
	}

	public Integer getCodigoUnico() {
		return codigoUnico;
	}

	public void setCodigoUnico(Integer codigoUnico) {
		this.codigoUnico = codigoUnico;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoUnico);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(codigoUnico, other.codigoUnico);
	}

	@Override
	public String toString() {
		return "Usuario: " + codigoUnico;
	}
	
	
	
	

}
