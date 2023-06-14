package consulta_exp_admin;

import commons.BDconexion;
import java.sql.ResultSet;

/**
 *
 * @author Cesar
 */
public class Controlestudiantes {

    public ResultSet obtenerEstudiantes() {
        String SQL = "SELECT * FROM estudiante order by Nombre";

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

    ResultSet obtenerEstudiantes(String text) {
        String SQL = "SELECT * FROM estudiante where Nombre LIKE '%?1%' order by Nombre";
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
    }

    ResultSet obtenerDocumentos(int ID) {
        String SQL = "SELECT * FROM documento D inner join expediente E "
                + " on D.Expediente_idExpediente=E.idExpediente "
                + " where E.Estudiante_idEstudiante=?1";
        SQL = SQL.replace("?1", String.valueOf(ID));
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
