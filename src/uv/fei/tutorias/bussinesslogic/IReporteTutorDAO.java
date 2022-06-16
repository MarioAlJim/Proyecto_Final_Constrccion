
package uv.fei.tutorias.bussinesslogic;

import java.sql.SQLException;
import java.util.ArrayList;
import uv.fei.tutorias.domain.Asistencia;
import uv.fei.tutorias.domain.ReporteTutor;
import uv.fei.tutorias.domain.ProblematicaReporte;

/**
 *
 * @author Valea
 */
public interface IReporteTutorDAO {

    public ArrayList<Asistencia> obtenerTutoradosParaAsistencia(String cuentaUV, int idProgramaEducativo);

    public void eliminarReporteIncompleto(int idSesion) throws SQLException;

    public int registrarReporte(ReporteTutor reporteTutor) throws SQLException;

    public int obtenerIdReporte(ReporteTutor reporteBuscado) throws SQLException;

    public int registrarAsistencia(Asistencia listaAsistencia, int idSesion) throws SQLException;

    public ArrayList<ReporteTutor> consultarReportesTutor(int idProgramaEducativo) throws SQLException;

    public ReporteTutor encabezadoReporte(int idsesion) throws SQLException;

    public ArrayList<Asistencia> listaAsistencia(int idsesion) throws SQLException;

    public String comentariosGenerales(int idsesion) throws SQLException;

    public ArrayList<ProblematicaReporte> problematicasReportadas(int idsesion) throws SQLException;
      
}
