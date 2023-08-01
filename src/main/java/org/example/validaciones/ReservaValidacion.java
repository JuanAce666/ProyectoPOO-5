package org.example.validaciones;

import java.time.LocalDate;

public class ReservaValidacion {
    //metodos ordinarios
    public Boolean validarUsuario(Integer Usuario){
        return true;
    }

    public Boolean validarID(Integer ID){
        return true;
    }

    public Boolean validarOferta(Integer oferta){
        return true;
    }

    public Boolean validarCostototal(Double costoTotal){
        return true;
    }

    public Boolean validarFechaReserva(LocalDate FechaReserva){
        return true;
    }
}
