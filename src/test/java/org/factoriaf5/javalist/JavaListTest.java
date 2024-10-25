package org.factoriaf5.javalist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class JavaListTest {
    private JavaList javaList;

    @BeforeEach
    public void setUp() {
        javaList = new JavaList();
    }

    @Test
    public void testListaDeDias() {
        List<String> dias = javaList.obtenerDias();
        assertEquals(7, dias.size());
        assertTrue(dias.contains("Lunes"));
        assertTrue(dias.contains("Domingo"));
    }

    @Test
    public void testObtenerDias() {
        List<String> dias = javaList.obtenerDias();
        assertEquals(7, dias.size());
    }

    @Test
    public void testObtenerLargo() {
        assertEquals(7, javaList.obtenerLargo());
    }

    @Test
    public void testEliminarDia() {
        assertTrue(javaList.eliminarDia("Lunes"));
        assertFalse(javaList.existeDia("Lunes"));
    }

    @Test
    public void testObtenerDiaExistente() {
        assertEquals("Martes", javaList.obtenerDia("Martes"));
    }

    @Test
    public void testObtenerDiaNoExistente() {
        assertNull(javaList.obtenerDia("Feriado"));
    }

    @Test
    public void testExisteDia() {
        assertTrue(javaList.existeDia("Miércoles"));
        assertFalse(javaList.existeDia("Feriado"));
    }

    @Test
    public void testOrdenarDias() {
        javaList.eliminarDia("Lunes");
        javaList.ordenarDias();
        List<String> dias = javaList.obtenerDias();
        assertEquals("Domingo", dias.get(0));
    }

    @Test
    public void testVaciarLista() {
        javaList.vaciarLista();
        assertEquals(0, javaList.obtenerLargo());
    }
}