package GestionDepartamentos;
/***
 * Clase de tipo ENTIDAD, enpaqueta la información del departamento.
 * Los datos coinciden con la tabla de DEPARTAMENTO de la BD 
 * @author Darre
 */
public class Departamento {
    int idDepartamento;
    String nombre;
    String edificio;

    @Override
    public String toString() {
        return "Departamento{" + "idDepartamento=" + idDepartamento + ", nombre=" + nombre + ", edificio=" + edificio + '}';
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }
    
    
}
