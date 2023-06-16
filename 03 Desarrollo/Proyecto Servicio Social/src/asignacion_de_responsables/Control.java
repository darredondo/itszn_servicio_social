package asignacion_de_responsables;

import Commons.BDconexion;
import java.sql.ResultSet;

/**
 * *
 * Clase de tipo control para la gestión de departamentos. Esta clase transforma
 * los datos de departamento en instrucciones SQL.
 *
 * @author Darre
 */
public class Control {

    /**
     * *
     * Consulta los estudiantes pororden de nombre
     *
     * @return Lista de departamentos
     */
    public ResultSet obtenerEstudiante() {
        String SQL = "SELECT * FROM Estudiante order by nombre";

        try {
            BDconexion conexion = new BDconexion();
            conexion.conectar();
            ResultSet resultado = conexion.ejecutarConsulta(SQL);
            return resultado;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
    
    public ResultSet obtenerResponsable() {
        String SQL = "SELECT * FROM Accesor order by nombre";

        try {
            BDconexion conexion = new BDconexion();
            conexion.conectar();
            ResultSet resultado = conexion.ejecutarConsulta(SQL);
            return resultado;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return null;
        }
    }

    void agregarExpediente(int idestudiante, int idasesor) {
        //Genreamos el SQL para un nuevo expediente
        String SQL="insert into expediente values ('?1', '?2', '?3', '?4')";
        SQL = SQL.replace("?1", String.valueOf("1"));
        SQL = SQL.replace("?2", String.valueOf(idestudiante));
        SQL = SQL.replace("?3", String.valueOf(idasesor));
        SQL = SQL.replace("?4", String.valueOf("5"));
        
        try{
            BDconexion conexion = new BDconexion();
            conexion.conectar();
            conexion.ejecutarActualizacion(SQL);
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
}
