package org.example.modelos;

import org.example.validaciones.PersonaValidacion;

public class Persona {
    private int id;
    private String documento;
    private String nombre;
    private String correo;
    private int ubicacion;

    private PersonaValidacion validacion = new PersonaValidacion();

    public Persona() {
    }

    public Persona(int id, String documento, String nombre, String correo, int ubicacion) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Persona " +
                "id: " + id +
                ", documento: '" + documento + '\'' +
                ", nombre: '" + nombre + '\'' +
                ", correo: '" + correo + '\'' +
                ", ubicacion: " + ubicacion +
                ' ';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        try {
            this.validacion.validarNombre(nombre);
            this.nombre=nombre;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }
}
