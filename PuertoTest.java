

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PuertoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PuertoTest
{
    /**
     * Default constructor for test class PuertoTest
     */
    public PuertoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test001()
    {
        Puerto puerto1 = new Puerto();
        Velero velero1 = new Velero(5, "aaa", 12, 1997);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(500, "fte", 25, 2006);
        Yate yate1 = new Yate(2, 600, "abc", 25, 2000);
        Cliente cliente1 = new Cliente("TDF", "45564632Q");
        Cliente cliente2 = new Cliente("Bove", "dgfsgsgsd");
        Cliente cliente3 = new Cliente("Dani", "asfcxwer");
        Cliente cliente4 = new Cliente("Kraken", "uhjmalk");
        Cliente cliente5 = new Cliente("Anibal", "Lecter");
        assertEquals(0, puerto1.addAlquiler(2, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(6, cliente2, embarcac1));
        assertEquals(2, puerto1.addAlquiler(4, cliente3, yate1));
        assertEquals(151500, puerto1.liquidarAlquiler(1), 0.1);
        assertEquals(-1, puerto1.liquidarAlquiler(-7), 0.1);
        assertEquals(-1, puerto1.liquidarAlquiler(1), 0.1);
        assertEquals(1, puerto1.addAlquiler(7, cliente4, velero1));
    }

    @Test
    public void forBove()
    {
        Puerto puerto1 = new Puerto();
        Cliente cliente1 = new Cliente("Bove", "fgh5");
        Cliente cliente2 = new Cliente("Anibal", "Lecter");
        Cliente cliente3 = new Cliente("Kraken", "uhjmalk");
        Cliente cliente4 = new Cliente("Danikun", "kunkun");
        Velero velero1 = new Velero(2, "abc", 6, 1998);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(500, "def", 4, 2000);
        Yate yate1 = new Yate(2, 500, "ghi", 25, 2006);
        assertEquals(0, puerto1.addAlquiler(3, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(5, cliente2, embarcac1));
        assertEquals(2, puerto1.addAlquiler(6, cliente2, embarcac1));
        assertEquals(3, puerto1.addAlquiler(7, cliente3, yate1));
        assertEquals(150240, puerto1.liquidarAlquiler(2), 0.1);
        assertEquals(-1, puerto1.liquidarAlquiler(25), 0.1);
        assertEquals(-1, puerto1.liquidarAlquiler(-6), 0.1);
        assertEquals(-1, puerto1.liquidarAlquiler(2), 0.1);
        assertEquals(2, puerto1.addAlquiler(2, cliente4, yate1));
    }
    
    @Test
    public void testPuerto01()
    {
        Velero velero1 = new Velero(4, "ABC", 20, 1989);
        Yate yate1 = new Yate(10, 20000, "GGG", 40, 1999);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(3000, "JKJ", 22, 2001);
        Cliente cliente1 = new Cliente("Juan Magan", "33444555K");
        Cliente cliente2 = new Cliente("Paulina Rubio", "27666777O");
        Cliente cliente3 = new Cliente("Enrique Iglesias", "90888777G");
        Puerto puerto1 = new Puerto();
        assertEquals(0, puerto1.addAlquiler(5, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(2, cliente2, yate1));
        assertEquals(2, puerto1.addAlquiler(3, cliente3, embarcac1));
        Velero velero2 = new Velero(1, "BBB", 15, 2010);
        Cliente cliente4 = new Cliente("Julio Iglesias", "23444555K");
        assertEquals(3, puerto1.addAlquiler(10, cliente4, velero2));
        Cliente cliente5 = new Cliente("Pedro Duque", "89777444K");
        Yate yate2 = new Yate(8, 40000, "YYY", 45, 2012);
        assertEquals(-1, puerto1.addAlquiler(1, cliente5, yate2));
        puerto1.verEstadoAmarres();
        assertEquals(800 + (300 * 20010), puerto1.liquidarAlquiler(1), 0.1);
        assertEquals(1, puerto1.addAlquiler(1, cliente5, yate2));
        puerto1.verEstadoAmarres();
    }
}


