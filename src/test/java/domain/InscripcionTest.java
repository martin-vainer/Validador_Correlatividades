package domain;

import org.junit.Assert;
import org.junit.Test;

public class InscripcionTest {

    @Test

    public void inscripcionQueCumpleCorrelativas(){

        Materia paradigmas = new Materia("Paradigmas de la programacion");
        Materia algoritmos = new Materia("Algoritmos y Estructura de Datos");
        Materia discreta = new Materia("Matematica Discreta");

        paradigmas.setCorrelativas(algoritmos,discreta);

        Alumno pepe = new Alumno("Pepe");
        pepe.setMateriasAprobadas(algoritmos,discreta);

        Inscripcion inscripcionPueba1 = new Inscripcion(pepe);
        inscripcionPueba1.setMateriasInscripcion(paradigmas);

        Assert.assertTrue(inscripcionPueba1.aprobada());

    }

    public void inscripcionQueNoCumpleCorrelativas(){

        Materia analisisDeSistemas = new Materia("Análisis de Sistemas");
        Materia paradigmas = new Materia("Paradigmas de la programacion");
        Materia algoritmos = new Materia("Algoritmos y Estructura de Datos");
        Materia discreta = new Materia("Matematica Discreta");
        Materia sistemasYOrganizaciones = new Materia("Sistemas y organizaciones");

        analisisDeSistemas.setCorrelativas(algoritmos,sistemasYOrganizaciones);

        //mismo alumno
        Alumno pepe = new Alumno("Pepe");
        pepe.setMateriasAprobadas(algoritmos,discreta);

        Inscripcion inscripcionPueba2 = new Inscripcion(pepe);
        inscripcionPueba2.setMateriasInscripcion(analisisDeSistemas,paradigmas);

        Assert.assertFalse(inscripcionPueba2.aprobada());

    }

}
