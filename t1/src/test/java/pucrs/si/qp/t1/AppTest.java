package pucrs.si.qp.t1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;



public class AppTest 
{
	@Test
    public void testEscaleno()
    {
        int actual = App.identificaTriangulo(2, 3, 4);
        int expected = tipos.ESCALENO.value();
        assertEquals(expected, actual);
    }
	@Test
    public void testEquilatero()
    {
        int actual = App.identificaTriangulo(5, 5, 5);
        int expected = tipos.EQUILATERO.value();
        assertEquals(expected, actual);
    }
	@Test
    public void testIsosceles()
    {
        int actual = App.identificaTriangulo(6, 6, 7);
        int expected = tipos.ISOSCELES.value();
        assertEquals(expected, actual);
    }
	@Test
    public void testInvalido()
    {
        int actual = App.identificaTriangulo(6, 6, -7);
        int expected = tipos.INVALIDO.value();
        assertEquals(expected, actual);
    }

	//----------------------------
	
	
	
	@Test
	public void valorZero() {
		int actual = App.identificaTriangulo(8, 0, 9);
        int expected = tipos.INVALIDO.value();
        assertEquals(expected, actual);
	}
	
	@Test
	public void linha() {
		int actual = App.identificaTriangulo(1, 2, 3);
        int expected = tipos.NAOETRIANGULO.value();
        assertEquals(expected, actual);
	}
	@Test
	public void linhaLonga() {
		int actual = App.identificaTriangulo(1, 2, 8);
        int expected = tipos.NAOETRIANGULO.value();
        assertEquals(expected, actual);
	}
	@Test
	public void todosZero() {
		int actual = App.identificaTriangulo(0, 0, 0);
        int expected = tipos.NAOETRIANGULO.value();
        assertEquals(expected, actual);
	}
	@Test
	public void numerosReais() {
		int actual = App.identificaTriangulo(1/2, 3/4, 5);
        int expected = tipos.INVALIDO.value();
        assertEquals(expected, actual);
	}
	@Test
	public void variantesDe7() {
		int actual = App.identificaTriangulo(1, 2, 3);
        int expected = tipos.NAOETRIANGULO.value();
        assertEquals(expected, actual);
	}
	@Test
	public void variantesDe9() {
		int actual = App.identificaTriangulo(8, 1, 2);
        int expected = tipos.NAOETRIANGULO.value();
        assertEquals(expected, actual);
	}
	/*
	@Test
	public void numParInvalidos() {
		int actual = App.identificaTriangulo(7, 8);
        int expected = tipos.INVALIDO.value();
        assertEquals(expected, actual);
	}
	*/
	
}
	
	
