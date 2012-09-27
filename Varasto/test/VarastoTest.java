/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import varasto.Varasto;

/**
 *
 * @author ppoojala
 */
public class VarastoTest {

    public VarastoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @Test
    public void hello() {
    }

    @Test
    public void konstruktoriLuoTyhjanVaraston() {
        Varasto varasto = new Varasto(10);

        assertEquals(0, varasto.getSaldo(), 0.001);
    }

    @Test
    public void uudellaVarastollaOikeaTilavuus() {
        Varasto varasto = new Varasto(10);

        assertEquals(10, varasto.getTilavuus(), 0.001);
    }
}
