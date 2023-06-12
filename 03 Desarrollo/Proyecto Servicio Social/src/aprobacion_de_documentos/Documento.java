/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprobacion_de_documentos;

/**
 *
 * @author aguer
 */
public class Documento {
    int idDocumento;
    String nombre;
    String evaluacion;

    @Override
    public String toString() {
        return "Documento{" + "idDocumento=" + idDocumento + ", nombre=" + nombre + ", evaluacion=" + evaluacion + '}';
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(String evaluacion) {
        this.evaluacion = evaluacion;
    }
    
    
}
