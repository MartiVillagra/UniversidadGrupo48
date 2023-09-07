/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo48.Entidades;

/**
 *
 * @author Nova
 */
public class Materia {
     private int idMatreia;
    private String nombre;
    private int anioMateria;
    private boolean activo;

    public Materia() {
    }

    public Materia(String nombre, int anioMateria, boolean activo) {
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.activo = activo;
    }

    public Materia(int idMatreia, String nombre, int anioMateria, boolean activo) {
        this.idMatreia = idMatreia;
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.activo = activo;
    }

    public int getIdMatreia() {
        return idMatreia;
    }

    public void setIdMatreia(int idMatreia) {
        this.idMatreia = idMatreia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioMateria() {
        return anioMateria;
    }

    public void setAnioMateria(int anioMateria) {
        this.anioMateria = anioMateria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
