package org.factoriaf5.javalist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaList {
    private List<String> dias;

    public JavaList() {
        dias = new ArrayList<>();
        ListaDeDias();
    }

    public void ListaDeDias() {
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miércoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sábado");
        dias.add("Domingo");
    }

    public List<String> obtenerDias() {
        return new ArrayList<>(dias);
    }

    public int obtenerLargo() {
        return dias.size();
    }

    public boolean eliminarDia(String dia) {
        return dias.remove(dia);
    }

    public String obtenerDia(String dia) {
        return dias.contains(dia) ? dia : null;
    }

    public boolean existeDia(String dia) {
        return dias.contains(dia);
    }

    public void ordenarDias() {
        Collections.sort(dias);
    }

    public void vaciarLista() {
        dias.clear();
    }
}