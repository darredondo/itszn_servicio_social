package consulta_exp_admin;

/**
 *
 * @author Cesar
 */
public class estudiante {
    int idEstudiante;
    String Nombre;
    String Apellido_pat;
    String Apellido_mate;
    String Sexo;
    int Edad;
    int No_Control;

    @Override
    public String toString() {
        return "estudiante{" + "idEstudiante=" + idEstudiante + ", Nombre=" + Nombre + ", Apellido_pat=" + Apellido_pat + ", Apellido_mate=" + Apellido_mate + ", Sexo=" + Sexo + ", Edad=" + Edad + ", No_Control=" + No_Control + '}';
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido_pat() {
        return Apellido_pat;
    }

    public String getApellido_mate() {
        return Apellido_mate;
    }

    public String getSexo() {
        return Sexo;
    }

    public int getEdad() {
        return Edad;
    }

    public int getNo_Control() {
        return No_Control;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido_pat(String Apellido_pat) {
        this.Apellido_pat = Apellido_pat;
    }

    public void setApellido_mate(String Apellido_mate) {
        this.Apellido_mate = Apellido_mate;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setNo_Control(int No_Control) {
        this.No_Control = No_Control;
    }
    
    
}
