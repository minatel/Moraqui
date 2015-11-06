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
import moraqui.entity.GerenciarUsuario;

/**
 *
 * @author Thayna
 */
public class UsuarioTeste {
    
    public UsuarioTeste() {
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
    public void TesteCepInvalido() {
        GerenciarUsuario ger = new GerenciarUsuario();
        ger.setCep("-1");
        assertEquals(ger.TesteCepNegativo(), false);
    }
    @Test
    public void TesteRgInvalido() {
        GerenciarUsuario ger = new GerenciarUsuario();
        ger.setRg("-1");
        assertEquals(ger.TesteRgNegativo(), false);
    }
    @Test
    public void TesteCpfInvalido() {
        GerenciarUsuario ger = new GerenciarUsuario();
        ger.setCpf("-1");
        assertEquals(ger.TesteCpfNegativo(), false);
    }
    @Test
    public void TesteSexoInvalido() {
        GerenciarUsuario ger = new GerenciarUsuario();
        ger.setSexo("joao");
        assertEquals(ger.TesteSexoErrado(), false);
    }
    @Test
    public void TesteTipoInvalido() {
        GerenciarUsuario ger = new GerenciarUsuario();
        ger.setSexo("vizinho");
        assertEquals(ger.TesteTipoDiferente(), false);
    }   
    @Test
    public void TesteAnoDataInvalido() {
        GerenciarUsuario ger = new GerenciarUsuario();
        ger.setDataNascimento("0000-01-01");
        assertEquals(ger.TesteAnoDataNascZero(), false);
    } 
    @Test
    public void TesteMesDataInvalido() {
        GerenciarUsuario ger = new GerenciarUsuario();
        ger.setDataNascimento("2000-13-01");
        assertEquals(ger.TesteMesDataNascZero(), false);
    } 
    @Test
    public void TesteDiaDataInvalido() {
        GerenciarUsuario ger = new GerenciarUsuario();
        ger.setDataNascimento("2000-12-40");
        assertEquals(ger.TesteDiaDataNascZero(), false);
    } 
}
