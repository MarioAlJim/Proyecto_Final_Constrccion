/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package uv.fei.tutorias.bussinesslogic;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import uv.fei.tutorias.domain.ProgramaEducativo;

/**
 *
 * @author Valea
 */
public class DocenteEEProgramasDAOTest {
    
    public DocenteEEProgramasDAOTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of asignarEEProfesor method, of class DocenteEEProgramasDAO.
     */
    @Test
    public void testAsignarEEProfesor() throws Exception {
        System.out.println("consultarTodasLasProblematicasPorProgramaEducativoCuenta");
        int expResult = 1;
        int nrc=66;
        int numpersonal=45678;
        int programa=4;
        DocenteEEProgramasDAO instance = new DocenteEEProgramasDAO();
        int  result = instance.asignarEEProfesor(nrc, numpersonal,programa);

        assertEquals(expResult, result);
    }

    /**
     * Test of consultarProgramas method, of class DocenteEEProgramasDAO.
     */
    @Test
     public void testConsultarProgramas() throws Exception {
        System.out.println("consultarTodasLasProblematicasPorProgramaEducativoCuenta");
       
        DocenteEEProgramasDAO instance = new DocenteEEProgramasDAO();
        
        ArrayList<ProgramaEducativo> result = instance.consultarProgramas();
        int expResult=3;
       //System.out.print(result.size());
        
        assertEquals(expResult, result.size());
        
    }

    /**
     * Test of consultarPeriodos method, of class DocenteEEProgramasDAO.
     */
    @Test
    public void testConsultarPeriodos() throws Exception {
        
        
    }

    /**
     * Test of consultarProgramaSeleccionado method, of class DocenteEEProgramasDAO.
     */
    @Test
    public void testConsultarProgramaSeleccionado() throws Exception {
        
        String programa = "Estadística";
        DocenteEEProgramasDAO instance = new DocenteEEProgramasDAO();
        int expResult = 3;
        int  result = instance.consultarProgramaSeleccionado(programa);
        assertEquals(expResult, result);
    }
    
}
