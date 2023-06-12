package aprobacion_de_documentos;

import Commons.BDconexion;
import java.sql.ResultSet;

/**
 * *
 * Clase de tipo control para la gestión de departamentos. Esta clase transforma
 * los datos de departamento en instrucciones SQL.
 *
 * @author Darre
 */
public class ControlDocumentos {

    /**
     * *
     * Recibe un departamento nuevo y lo almacena en la base de datos.
     *
     * @param nuevo
     */
    /*public void agregarDepartamento(Departamento nuevo) {
        //Generamos el SQL para insertar un nuevo departamento
        String SQL = "insert into departamento values(null, '?1','?2')";
        SQL = SQL.replace("?1", nuevo.getNombre());
        SQL = SQL.replace("?2", nuevo.getEdificio());

        try {
            BDconexion conexion = new BDconexion();
            conexion.conectar();
            conexion.ejecutarActualizacion(SQL);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
*/
    /**
     * *
     * Consulta los departamentos pororden de nombre
     *
     * @return Lista de departamentos
     */
    public ResultSet obtenerDepartamentos() {
        String SQL = "SELECT * FROM departamento order by nombre";

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

    /**
     * *
     * Consulta los departamentos que coinciden con el filtro de texto
     *
     * @param text - Filtro de nombre de departamento
     * @return Lista de departamentos
     */
    ResultSet obtenerDocumentos(String responsable) {
        String SQL = "SELECT * FROM documento where responsable= '?1'";
        SQL = SQL.replace("?1", responsable);
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
}
