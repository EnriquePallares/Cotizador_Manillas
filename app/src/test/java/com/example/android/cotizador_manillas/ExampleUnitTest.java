package com.example.android.cotizador_manillas;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void cuero_martillo_Oro(){
        int cantidad = 1, cmbMateriales = 1, cmbDije = 1, cmbTipo = 1, result;
        result = 100;
        assertEquals(result, Metodos.totalCompra(cantidad, cmbMateriales, cmbDije, cmbTipo), 0);
    }

    @Test
    public void cuero_martillo_oroRosa(){
        int cantidad = 1, cmbMateriales = 1, cmbDije = 1, cmbTipo = 2, result;
        result = 100;
        assertEquals(result, Metodos.totalCompra(cantidad, cmbMateriales, cmbDije, cmbTipo), 0);
    }

    @Test
    public void cuero_martillo_Plata(){
        int cantidad = 1, cmbMateriales = 1, cmbDije = 1, cmbTipo = 3, result;
        result = 80;
        assertEquals(result, Metodos.totalCompra(cantidad, cmbMateriales, cmbDije, cmbTipo), 0);
    }

    @Test
    public void cuero_martillo_Niquel(){
        int cantidad = 1, cmbMateriales = 1, cmbDije = 1, cmbTipo = 4, result;
        result = 70;
        assertEquals(result, Metodos.totalCompra(cantidad, cmbMateriales, cmbDije, cmbTipo), 0);
    }

    @Test
    public void cuero_ancla_Oro(){
        int cantidad = 1, cmbMateriales = 1, cmbDije = 2, cmbTipo = 1, result;
        result = 120;
        assertEquals(result, Metodos.totalCompra(cantidad, cmbMateriales, cmbDije, cmbTipo), 0);
    }

    @Test
    public void cuero_ancla_oroRosa(){
        int cantidad = 1, cmbMateriales = 1, cmbDije = 2, cmbTipo = 2, result;
        result = 120;
        assertEquals(result, Metodos.totalCompra(cantidad, cmbMateriales, cmbDije, cmbTipo), 0);
    }

    @Test
    public void cuero_ancla_Plata(){
        int cantidad = 1, cmbMateriales = 1, cmbDije = 2, cmbTipo = 3, result;
        result = 100;
        assertEquals(result, Metodos.totalCompra(cantidad, cmbMateriales, cmbDije, cmbTipo), 0);
    }

    @Test
    public void cuero_ancla_Niquel(){
        int cantidad = 1, cmbMateriales = 1, cmbDije = 2, cmbTipo = 4, result;
        result = 90;
        assertEquals(result, Metodos.totalCompra(cantidad, cmbMateriales, cmbDije, cmbTipo), 0);
    }

    @Test
    public void cuerda_martillo_Oro(){
        int cantidad = 1, cmbMateriales = 2, cmbDije = 1, cmbTipo = 1, result;
        result = 90;
        assertEquals(result, Metodos.totalCompra(cantidad, cmbMateriales, cmbDije, cmbTipo), 0);
    }

    @Test
    public void cuerda_martillo_OroRosa(){
        int cantidad = 1, cmbMateriales = 2, cmbDije = 1, cmbTipo = 2, result;
        result = 90;
        assertEquals(result, Metodos.totalCompra(cantidad, cmbMateriales, cmbDije, cmbTipo), 0);
    }

    @Test
    public void cuerda_martillo_Plata(){
        int cantidad = 1, cmbMateriales = 2, cmbDije = 1, cmbTipo = 3, result;
        result = 70;
        assertEquals(result, Metodos.totalCompra(cantidad, cmbMateriales, cmbDije, cmbTipo), 0);
    }

    @Test
    public void cuerda_martillo_Niquel(){
        int cantidad = 1, cmbMateriales = 2, cmbDije = 1, cmbTipo = 4, result;
        result = 50;
        assertEquals(result, Metodos.totalCompra(cantidad, cmbMateriales, cmbDije, cmbTipo), 0);
    }

    @Test
    public void cuerda_ancla_Oro(){
        int cantidad = 1, cmbMateriales = 2, cmbDije = 2, cmbTipo = 1, result;
        result = 110;
        assertEquals(result, Metodos.totalCompra(cantidad, cmbMateriales, cmbDije, cmbTipo), 0);
    }

    @Test
    public void cuerda_ancla_OroRosa(){
        int cantidad = 1, cmbMateriales = 2, cmbDije = 2, cmbTipo = 2, result;
        result = 110;
        assertEquals(result, Metodos.totalCompra(cantidad, cmbMateriales, cmbDije, cmbTipo), 0);
    }

    @Test
    public void cuerda_ancla_Plata(){
        int cantidad = 1, cmbMateriales = 2, cmbDije = 2, cmbTipo = 3, result;
        result = 90;
        assertEquals(result, Metodos.totalCompra(cantidad, cmbMateriales, cmbDije, cmbTipo), 0);
    }

    @Test
    public void cuerda_ancla_Niquel(){
        int cantidad = 1, cmbMateriales = 2, cmbDije = 2, cmbTipo = 4, result;
        result = 80;
        assertEquals(result, Metodos.totalCompra(cantidad, cmbMateriales, cmbDije, cmbTipo), 0);
    }

    @Test
    public void cambiarMoneda(){
        int dolares = 100, result;
        result = 320000;
        assertEquals(result, Metodos.cambiarMoneda(dolares), 0);
    }
}