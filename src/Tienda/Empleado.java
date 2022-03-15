
package Tienda;

public class Empleado {
    int id, telefono;
    String dni, nom, direccion,user;
    
    public Empleado(){
        
    }

    public Empleado(int id, String dni, String nom, int telefono, String direccion, String user) {
        this.id = id;
        this.dni = dni;
        this.nom = nom;
        this.telefono = telefono;
        this.direccion = direccion;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
}
