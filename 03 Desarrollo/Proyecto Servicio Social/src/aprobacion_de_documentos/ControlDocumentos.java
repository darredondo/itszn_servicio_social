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
        String SQL = "SELECT * FROM documento";
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
    
    public boolean Actualizar(Documento control) {
       
        String SQL = "UPDATE documento SET estado = '?1' WHERE Titulo = '?2'";
        SQL = SQL.replace("?1", control.getEvaluacion());
        SQL = SQL.replace("?2", control.getNombre());

        try {
            BDconexion conexion = new BDconexion();
            conexion.conectar();
            conexion.ejecutarActualizacion(SQL);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return false;
        }
    }
}
