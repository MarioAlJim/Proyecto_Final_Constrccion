/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package uv.fei.tutorias.bussinesslogic;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import uv.fei.tutorias.domain.Docente;

public class DocenteDAOTest {
    
    public DocenteDAOTest() {
    }

    @Test
    public void testRecuperarDocentesPorProgramaEducativo() throws Exception {
        System.out.println("recuperarDocentesPorProgramaEducativo");
        int idPrograma = 0;
        DocenteDAO instance = new DocenteDAO();
        ArrayList<Docente> expResult = null;
        ArrayList<Docente> result = instance.recuperarDocentesPorProgramaEducativo(idPrograma);
        assertEquals(expResult, result);
    }
    
}
