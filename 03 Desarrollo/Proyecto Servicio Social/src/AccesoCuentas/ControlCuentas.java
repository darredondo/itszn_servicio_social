/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoCuentas;

import Commons.BDconexion;
import java.sql.ResultSet;

/**
 *
 * @author HP
 */
public class ControlCuentas {

    //Obtener las cuentas de usuario

    public ResultSet accesoCuentas(String tipo,String usuario, String clave) {
        String SQL = "SELECT * FROM usuario U " +
" where U.tipoUsuario='?1' and U.UsuarioCuenta='?2' and U.clave='?3';";
        SQL=SQL.replace("?1", tipo);
        SQL=SQL.replace("?2", usuario);
        SQL=SQL.replace("?3", clave);

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
