package domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre;
    private Integer legajo;
    private List<Materia> materiasAprobadas;

    //constructor:
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<>();
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(Materia ... materiasAprobadas) {
        Collections.addAll(this.materiasAprobadas, materiasAprobadas);
    }

}
