/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package uv.fei.tutorias.bussinesslogic;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import uv.fei.tutorias.domain.ProblematicaAcademica;
import uv.fei.tutorias.domain.ProblematicaReporte;

/**
 *
 * @author Valea
 */
public class ProblematicaAcademicaDAOTest {
    
    public ProblematicaAcademicaDAOTest() {
    }

    /**
     * Test of actualizarProblematica method, of class ProblematicaAcademicaDAO.
     */
    @Test
    public void testActualizarProblematica() throws Exception {
        System.out.println("actualizarProblematica");
        ProblematicaAcademica problematicaAcademica = new ProblematicaAcademica();
        problematicaAcademica.setIdProblematicaAcademica(5);
        problematicaAcademica.setDescripcion("AHacer planas");
        problematicaAcademica.setTitulo("Compñaero molestoso");
        problematicaAcademica.setCantidadTutorados(12);
        problematicaAcademica.setIdDocenteEePrograma(11);
        ProblematicaAcademicaDAO instance = new ProblematicaAcademicaDAO();
        int expResult = 1;
        
        int result=instance.actualizarProblematica(problematicaAcademica);

        assertEquals(expResult, result);
       
               
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        System.out.print(result);
    }

    /**
     * Test of consultarTodasLasProblematicasPorProgramaEducativoCuenta method, of class ProblematicaAcademicaDAO.
     */
    @Test
    public void testConsultarTodasLasProblematicasPorProgramaEducativoCuenta() throws Exception {
        System.out.println("consultarTodasLasProblematicasPorProgramaEducativoCuenta");
       
        ProblematicaAcademicaDAO instance = new ProblematicaAcademicaDAO();
        
        ArrayList<ProblematicaReporte> result = instance.consultarTodasLasProblematicasPorProgramaEducativoCuenta(2,"arivera");
        int expResult=3;
       //System.out.print(result.size());
        
        assertEquals(expResult, result.size());
        
    }

    /**
     * Test of eliminarProblematica method, of class ProblematicaAcademicaDAO.
     */
    @Test
    public void testEliminarProblematica() throws Exception {
        System.out.println("eliminarProblematica");
        ProblematicaAcademica problematicaAcademica = new ProblematicaAcademica();
        problematicaAcademica.setIdProblematicaAcademica(5);
        problematicaAcademica.setDescripcion("");
        problematicaAcademica.setSolucion("");
        problematicaAcademica.setCantidadTutorados(12);
         problematicaAcademica.setIdDocenteEePrograma(11);
   
        ProblematicaAcademicaDAO instance = new ProblematicaAcademicaDAO();
        int expResult = 1;
        int result = instance.eliminarProblematica(problematicaAcademica);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminarProblematicaSesiones method, of class ProblematicaAcademicaDAO.
     */
    @Test
    public void testEliminarProblematicaSesiones() throws Exception {
        System.out.println("eliminarProblematicaSesiones");
        ProblematicaAcademica problematicaAcademica = new ProblematicaAcademica();
        problematicaAcademica.setIdProblematicaAcademica(5);
        problematicaAcademica.setDescripcion("");
        problematicaAcademica.setSolucion("");
        problematicaAcademica.setCantidadTutorados(12);
         problematicaAcademica.setIdDocenteEePrograma(11);
        ProblematicaAcademicaDAO instance = new ProblematicaAcademicaDAO();
        int expResult = 1;
        int result = instance.eliminarProblematicaSesiones(problematicaAcademica);
        assertEquals(expResult, result);
    }
    
}
