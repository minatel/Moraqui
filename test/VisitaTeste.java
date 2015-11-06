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
import moraqui.entity.MarcarVisita;

/**
 *
 * @author Jéssica
 */
public class VisitaTeste {
    
    public VisitaTeste() {
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

    @Test
    public void teste1(){
        MarcarVisita visita = new MarcarVisita();
        visita.setData("0000-10-09");
        assertEquals(visita.testeAnoInexistente(), false);
    }
    
    @Test
    public void teste2(){
        MarcarVisita visita = new MarcarVisita();
        visita.setData("1993-00-12");
        assertEquals(visita.testeMesInexistente(), false);
    }
    
    @Test
    public void teste3(){
        MarcarVisita visita = new MarcarVisita();
        visita.setData("1993-04-00");
        assertEquals(visita.testeDiaInexistente(), false);
    }
    
    @Test
    public void teste4(){
        MarcarVisita visita = new MarcarVisita();
        visita.setHora("67:19");
        assertEquals(visita.testeHoraInexistente(), false);
    }
    
    @Test
    public void teste5(){
        MarcarVisita visita = new MarcarVisita();
        visita.setHora("13:132");
        assertEquals(visita.testeMinutoInexistente(), false);
    }
}
