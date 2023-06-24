package consulta_exp_usuario;

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
     * Consulta los departamentos pororden de nombre
     *
     * @return Lista de departamentos
     */
    public ResultSet obtenerDocumentos() {
        String SQL = "SELECT * FROM documento order by autor";

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
    /*ResultSet obtenerDepartamentos(String text) {
        String SQL = "SELECT * FROM departamento where nombre LIKE '%?1%' order by nombre";
        SQL = SQL.replace("?1", text);
        try {
            BDconexion conexion = new BDconexion();
            conexion.conectar();
            ResultSet resultado = conexion.ejecutarConsulta(SQL);
            return resultado;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return null;
        }
    }*/
}
