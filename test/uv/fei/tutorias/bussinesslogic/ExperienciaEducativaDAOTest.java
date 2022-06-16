/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package uv.fei.tutorias.bussinesslogic;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import uv.fei.tutorias.domain.ExperienciaEducativa;

/**
 *
 * @author Valea
 */
public class ExperienciaEducativaDAOTest {
    
    public ExperienciaEducativaDAOTest() {
    }

    /**
     * Test of consultarExperienciasNoAsignadas method, of class ExperienciaEducativaDAO.
     */
    @Test
    public void testConsultarExperienciasNoAsignadas() throws Exception {
        System.out.println("consultarExperienciasNoAsignadas");
        ExperienciaEducativaDAO instance = new ExperienciaEducativaDAO();
        int expResult = 4;
        ArrayList<ExperienciaEducativa> result = instance.consultarExperienciasNoAsignadas();
        assertEquals(expResult, result.size());
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
