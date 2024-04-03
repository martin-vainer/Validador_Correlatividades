package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    //constructor:
    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }

    //GETTER correlativas de materia:
    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    //SETTER correlativas de materia:
    //TODO borrar...
    public void agregarCorrelativas(Materia correlativas) {
        this.correlativas.add(correlativas);
    }

    public void setCorrelativas(Materia ... materiasCorrelativas) {
        Collections.addAll(this.correlativas, materiasCorrelativas);
    }

}
