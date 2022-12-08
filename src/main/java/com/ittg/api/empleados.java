package com.ittg.api;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class empleados {
	@Id
	@GeneratedValue
	private long id;
    private String nombre;
    private String apellidos; 
public empleados() {
// TODO Auto-generated constructor stub
}
public empleados(Long id, String nombre, String apellidos) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.apellidos = apellidos;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

}
