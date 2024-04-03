package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasInscripcion;

    //constructor:
    public Inscripcion(Alumno alumno){
        this.alumno = alumno;
        this.materiasInscripcion = new ArrayList<>();
    }

    //getter materiasInscripcion:
    public List<Materia> getMateriasInscripcion() {
        return materiasInscripcion;
    }

    //setter materiasInscripcion:
    public void setMateriasInscripcion(Materia ... materiasInscripcion) {
        Collections.addAll(this.materiasInscripcion, materiasInscripcion);
    }

    public List<Materia> listaCorrelativasTotal(){
        return
                this.materiasInscripcion
                .stream()
                .flatMap(m -> m.getCorrelativas().stream())
                .collect(Collectors.toList());
    }
    //método principal:
    public boolean aprobada() {
        return new HashSet<>(this.listaCorrelativasTotal()).containsAll(alumno.getMateriasAprobadas());
    }

// ANALISIS:
// materiasInscripcion
// [ [ [] , [] ] , [ [], [] ] ]


}
