package EjerciciosJavi;

public class Estudiante { 
	String nombre; 
	String codigo; 
	Double nota; 
	Double nota2;   

	@test
	public Estudiante(String nombre, String codigo, Double nota, Double nota2) { 
		super(); 
		this.nombre = nombre; 
		this.codigo = codigo; 
		this.nota = nota; 
		this.nota2 = nota2;	
		}
	@test
	public String getNombre() { 
		return nombre;	
		} 
	@test
	public void setNombre(String nombre) { 
		this.nombre = nombre;	
		} 
	@test
	public String getCodigo() { 
		return codigo;	
		} 
	@test
	public void setCodigo(String codigo) { 
		this.codigo = codigo;	
		}
	@test
	public Double getNota() { 
		return nota;	
		}
	@test
	public void setNota(Double nota) { 
		this.nota = nota;	
		}
	@test
	public Double getNota2() { 
		return nota2;	
		}
	@test
	public void setNota2(Double nota2) { 
		this.nota2 = nota2;	
		} 
	} 
