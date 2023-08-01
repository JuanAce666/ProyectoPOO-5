package org.example.validaciones;

import java.time.LocalDate;

public class OfertaValidacion {
    //metodos ordinarios
    public Boolean validarID (Integer ID){
        return true;
    }

    public Boolean validarTitulo(String Titulo){
        return true;
    }

    public Boolean validarDescripcion (String Descripcion){
        return true;
    }

    public Boolean validarFechainicio(LocalDate FechaInicio){
        return true;
    }

    public Boolean validarFechaFin(LocalDate FechaFin){
        return true;
    }

    public Boolean validarCostoPersona(Double CostoPersona){
        return true;
    }

    public Boolean validarIDLocal(Integer IDlocal){
        return true;
    }
}
