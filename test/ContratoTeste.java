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
import moraqui.entity.GerenciarContrato;

/**
 *
 * @author Jéssica
 */
public class ContratoTeste {
    
    public ContratoTeste() {
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
        GerenciarContrato contrato = new GerenciarContrato();
        contrato.setDataInicioContrato("0000-09-10");
        assertEquals(contrato.testeAnoInexistente(), false);
    }
    
    @Test
    public void teste2(){
        GerenciarContrato contrato = new GerenciarContrato();
        contrato.setDataInicioContrato("2010-15-10");
        assertEquals(contrato.testeMesInexistente(), false);
    }
    
    @Test
    public void teste3(){
        GerenciarContrato contrato = new GerenciarContrato();
        contrato.setDataInicioContrato("2010-09-56");
        assertEquals(contrato.testeDiaInexistente(), false);
    }
    
    @Test
    public void teste4(){
        GerenciarContrato contrato = new GerenciarContrato();
        contrato.setValor("-100");
        assertEquals(contrato.testeValorNegativo(), false);
    }
}
