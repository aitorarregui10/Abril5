package com.softtek.presentacion;

import java.time.*;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;


public class Fechas {
    public static void main(String[] args) {

        // inicio de Curso y sumar 10 días
        LocalDateTime inicioCurso = LocalDateTime.of(2024,4,2,10,0,0);
        LocalDateTime diezDespues = inicioCurso.plusDays(5);
        System.out.println("El inicio del curso fue "+ inicioCurso + "\nDiez días después es: "+ diezDespues);

        //Hora actual y la de Australia
        ZonedDateTime fechaHoy = ZonedDateTime.now();
        ZoneId sydney = ZoneId.of("Australia/Sydney");
        ZonedDateTime fechaHoySydney = ZonedDateTime.now(sydney);
        System.out.println("La fecha de hoy es: " + fechaHoy + "\n En Australia son las: " + fechaHoySydney);

        // Días del Calendario
        LocalDate dia100 = LocalDate.ofYearDay(2024, 100);
        System.out.println("El día número 100 del  2024 es: " + dia100);
        LocalDate diaNavidad = LocalDate.of(2024, 12, 25);
        LocalDate diaNocheVieja = LocalDate.of(2024, 12, 31);
        Boolean compararFechasBeforeNavNV = diaNavidad.isBefore(diaNocheVieja);
        Boolean compararFechasAfterNavNV = diaNavidad.isAfter(diaNocheVieja);
        System.out.println("El día de Navidad es: "+ diaNavidad + "y el de Noche Vieja es: "+ diaNocheVieja +
                "\n El día de Navidad es anterior al de Nochevieja nos sale: " + compararFechasBeforeNavNV +
                "\n Pero el día de Navidad es posterior al de Nochevieja nos sale: " + compararFechasAfterNavNV);

        // Calcular la fecha resultante sumando 35 semanas al 15 de marzo de 2024
        LocalDate dia15M = LocalDate.of(2024, 3, 15);
        LocalDate diaResultado = dia15M.plusWeeks(35);
        System.out.println("El día resultante de añadir las 35 semanas es: "+ diaResultado);

        // Calcular los años trabajados en una empresa de un empleado que inició a trabajar el 6 de Julio de 2012

        LocalDate diaInicioTrabajar = LocalDate.of(2012, 7, 6);
        LocalDate hoy = LocalDate.now();

        int añosTrabajados = hoy.getYear() - diaInicioTrabajar.getYear();

        System.out.println("El empleado ha trabajado " + añosTrabajados + " años.");


        //Calcular la edad de una persona que nació el 7 de agosto de 2007

        LocalDate nacio = LocalDate.of(2007, 8, 7);

        int edad = hoy.getYear() - nacio.getYear();

        System.out.println("La persona tiene " + edad + " años.");


        // Calcular la fecha en que se tiene que iniciar un proyecto si su duración
        // es 200 días y se tiene que entregar el 2 de octubre de 2024

        LocalDate deadLine = LocalDate.of(2024, 10, 2);
        LocalDate diaComienzo = deadLine.minusDays(200);

        System.out.println("Si quieres acabar en plazo este proyecto debes comenzar el: " + diaComienzo);

        //Si un proyecto inicia el 15 de marzo y termina el 20 de octubre cuál es su periodo.

        LocalDate deadLine2 = LocalDate.of(2024, 10, 20);
        LocalDate diaComienzo2 = LocalDate.of(2024, 3, 15);

        long diasProyecto = ChronoUnit.DAYS.between(diaComienzo2, deadLine2);

        System.out.println("El periodo de plazo de este proyecto es de " + diasProyecto + " días.");


    }
}
