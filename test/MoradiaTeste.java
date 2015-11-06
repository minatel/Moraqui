/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import moraqui.entity.GerenciarMoradia;

/**
 *
 * @author Thayna
 */
public class MoradiaTeste {
    
    public MoradiaTeste() {
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
    // @Test
    // public void hello() {}
    @Test
    public void TesteCep() {
        GerenciarMoradia ger = new GerenciarMoradia();
        ger.setCep("-1");
        assertEquals(ger.TesteCepNegativo(), false);
    }
    @Test
    public void TesteTipo() {
        GerenciarMoradia ger = new GerenciarMoradia();
        ger.setTipo("edificio");
        assertEquals(ger.TesteTipoMoradia(), false);
    }
    @Test
    public void TesteArea() {
        GerenciarMoradia ger = new GerenciarMoradia();
        ger.setArea("-1");
        assertEquals(ger.TesteAreaNegativa(), false);
    }
    @Test
    public void TesteGenero() {
        GerenciarMoradia ger = new GerenciarMoradia();
        ger.setGenero("qualquercoisa");
        assertEquals(ger.TesteGeneroDiferente(), false);
    }
    @Test
    public void TesteQuantidadeMoradores() {
        GerenciarMoradia ger = new GerenciarMoradia();
        ger.setQuantMorador("-1");
        assertEquals(ger.TesteQuantMoradores(), false);
    }
    @Test
    public void TesteValor() {
        GerenciarMoradia ger = new GerenciarMoradia();
        ger.setValor("-1");
        assertEquals(ger.TesteValorNegativo(), false);
    }
}
