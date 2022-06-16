/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uv.fei.tutorias.bussinesslogic;

import java.sql.SQLException;
import uv.fei.tutorias.domain.DocenteEEPrograma;
import uv.fei.tutorias.domain.ProgramaEducativo;
import uv.fei.tutorias.domain.Periodo;
import java.util.ArrayList;
import java.util.List;

public interface IDocenteEEProgramasDAO {
    
    public int obtenerIdDocenteEEPrograma (int numPersonal, int nrc) throws SQLException;
    
    public List<DocenteEEPrograma> obtenerOfertaAcademicaGeneral();

    public List<DocenteEEPrograma> consultarOfertaAcademicaPorProgramaEducativo(String programaEducativo);
    
    public int asignarEEProfesor(int nrc, int numpersonal, int idprogramaeducativo) throws SQLException;

    public ArrayList<ProgramaEducativo> consultarProgramas() throws SQLException;

    public ArrayList<Periodo> consultarPeriodos() throws SQLException;

    public int consultarProgramaSeleccionado(String programa) throws SQLException;
}
