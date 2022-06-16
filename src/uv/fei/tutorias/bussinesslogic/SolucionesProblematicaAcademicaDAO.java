/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uv.fei.tutorias.bussinesslogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import uv.fei.tutorias.dataaccess.DataBaseConnection;
import uv.fei.tutorias.domain.ProblematicaAcademica;
import org.apache.log4j.Logger;
import uv.fei.tutorias.domain.Problematica;


/**
 *
 * @author Valea
 */
public class SolucionesProblematicaAcademicaDAO implements ISolucionesProblematicaAcademicaDAO{
    
    final static Logger log = Logger.getLogger( SolucionesProblematicaAcademicaDAO.class);
    
    
  
    
   /* @Override 
    public int actualizarSolucionProblematica(ProblematicaAcademica problematicaAcademica) {
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        int filasActualizadas = 0;
        try(Connection connection=dataBaseConnection.getConnection()){
            int idProblematicaAcademica = problematicaAcademica.getIdProblematicaAcademica();
            
            String solucion = problematicaAcademica.getSolucion();
            
            String query;
            query = 
                    ("UPDATE tutoriasproblematicasacademicas SET solucion = '" + solucion +
                     " WHERE IdProblemaAcademica = " + idProblematicaAcademica);
            PreparedStatement statement = connection.prepareStatement(query);
            filasActualizadas = statement.executeUpdate();
            System.out.println(filasActualizadas + " filas modificadas");
        } catch (SQLException ex) {
                log.fatal(ex);
                
        }
        return filasActualizadas;
    } */    

    @Override
    public int registrarSolucion(String solucion, int idProblematicaA)throws SQLException {
         DataBaseConnection dataBaseConnection = new DataBaseConnection();
        int filasInsertadas = 0;
        Connection connection=dataBaseConnection.getConnection();
            int idProblematicaAcademica = idProblematicaA;
            //String Solucion = solucion;
            String query =
               
                   ("UPDATE tutoriasproblematicasacademicas SET solucion= ?  WHERE IdProblemaAcademica = ?"  );
            
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,solucion);
            statement.setInt(2,idProblematicaAcademica);
            
            filasInsertadas = statement.executeUpdate();
            System.out.println(filasInsertadas + " Fila insertada ");
        
        return filasInsertadas;
    }

    @Override
    public ArrayList<Problematica> consultarProblematicasSinSolucion(int idProgramaEducativo) throws SQLException {
        ArrayList<Problematica> problematicasAcademicas= new ArrayList<>();
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        Connection connection=dataBaseConnection.getConnection();
            
            String query=(" select p.idproblemaacademica, p.titulo, p.solucion,p.descripcion, ee.nombre as experiencia , concat(d.nombre, ' ', d.ApellidoPaterno, ' ', d.ApellidoMaterno) as docente, pe.nombre as programa, t.fechatutoria, concat(periodo.fechainicio, ' - ', periodo.fechafin) as periodo "
                    + " from tutoriasproblematicassesiones ps "
                    + " inner join tutoriasproblematicasacademicas p on ps.idproblemaacademica=p.idproblemaacademica"
                    + " inner join sesion s on ps.idsesion=s.idsesion"
                    + " inner join docenteseeprogramas dep on p.iddocenteseeprogramas=dep.iddocenteeeprograma"
                    + " inner join experienciaseducativas ee on ee.nrc=dep.nrc"
                    + " inner join docentes  d on d.numpersonal=dep.numpersonal"
                    + " inner join tutorias t on s.idtutoria=t.idtutoria"
                    + " inner join periodo on periodo.idperiodo=t.idperiodo"
                    + " inner join programaseducativos pe on s.idprogramaeducativo=pe.idprogramaeducativo where p.solucion is null and s.idprogramaeducativo=?;");
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setInt(1,idProgramaEducativo);
            ResultSet resultSet=statement.executeQuery();
            if (resultSet.next()){
                
            
                int idProblematicaAcademica;
                String titulo;
                String descripcion;
                String solucion;
                String experiencia;
                String docente;
                String programa;
                String fechatutoria;  
                
                do {
                    idProblematicaAcademica = resultSet.getInt("IdProblemaAcademica");
                    titulo = resultSet.getString("titulo");
                    descripcion = resultSet.getString("Descripcion");
                    solucion = resultSet.getString("Solucion");
                    experiencia = resultSet.getString("Experiencia");
                    docente = resultSet.getString("docente");
                    programa = resultSet.getString("Experiencia");
                    fechatutoria = resultSet.getString("fechatutoria");
                    Problematica problematicaAcademica = new Problematica();
                    problematicaAcademica.setIdproblemaacademica(idProblematicaAcademica);
                    problematicaAcademica.setTitulo(titulo);
                    problematicaAcademica.setDescripcion(descripcion);
                    problematicaAcademica.setSolucion(solucion);
                    problematicaAcademica.setExperiencia(experiencia);
                    problematicaAcademica.setDocente(docente);
                    problematicaAcademica.setPrograma(programa);
                    problematicaAcademica.setFechatutoria(fechatutoria);
                    
                   
                    problematicasAcademicas.add(problematicaAcademica);
                }while (resultSet.next());
            }
       
        return problematicasAcademicas;
        
    }

    @Override
    public ArrayList<Problematica> consultarSoluciones(int idProgramaEducativo) throws SQLException {
         int idprogramaeducativo=idProgramaEducativo;
         ArrayList<Problematica> problematicasAcademicas= new ArrayList<>();
         DataBaseConnection dataBaseConnection = new DataBaseConnection();
         Connection connection=dataBaseConnection.getConnection();
            
            String query=("select p.idproblemaacademica, p.titulo, p.solucion,p.descripcion, ee.nombre as experiencia , concat(d.nombre, ' ', d.ApellidoPaterno, ' ', d.ApellidoMaterno) as docente, pe.nombre as programa, t.fechatutoria, concat(periodo.fechainicio, '-', periodo.fechafin) as periodo "
                    + " from tutoriasproblematicassesiones ps "
                    + " inner join tutoriasproblematicasacademicas p on ps.idproblemaacademica=p.idproblemaacademica"
                    + " inner join sesion s on ps.idsesion=s.idsesion"
                    + " inner join docenteseeprogramas dep on p.iddocenteseeprogramas=dep.iddocenteeeprograma"
                    + " inner join experienciaseducativas ee on ee.nrc=dep.nrc"
                    + " inner join docentes  d on d.numpersonal=dep.numpersonal"
                    + " inner join tutorias t on s.idtutoria=t.idtutoria"
                    + " inner join periodo on periodo.idperiodo=t.idperiodo"
                    + " inner join programaseducativos pe on s.idprogramaeducativo=pe.idprogramaeducativo where p.solucion is not null and s.idprogramaeducativo=?;");
            
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setInt(1,idprogramaeducativo);
            ResultSet resultSet=statement.executeQuery();
            if (resultSet.next()){
                
            
                int idProblematicaAcademica;
                String titulo;
                String descripcion;
                String solucion;
                String experiencia;
                String docente;
                String programa;
                String fechatutoria;  
                
                do {
                    idProblematicaAcademica = resultSet.getInt("IdProblemaAcademica");
                    titulo = resultSet.getString("titulo");
                    descripcion = resultSet.getString("Descripcion");
                    solucion = resultSet.getString("Solucion");
                    experiencia = resultSet.getString("Experiencia");
                    docente = resultSet.getString("docente");
                    programa = resultSet.getString("Experiencia");
                    fechatutoria = resultSet.getString("fechatutoria");
                    Problematica problematicaAcademica = new Problematica();
                    problematicaAcademica.setIdproblemaacademica(idProblematicaAcademica);
                    problematicaAcademica.setTitulo(titulo);
                    problematicaAcademica.setDescripcion(descripcion);
                    problematicaAcademica.setSolucion(solucion);
                    problematicaAcademica.setExperiencia(experiencia);
                    problematicaAcademica.setDocente(docente);
                    problematicaAcademica.setPrograma(programa);
                    problematicaAcademica.setFechatutoria(fechatutoria);
                    
                   
                    problematicasAcademicas.add(problematicaAcademica);
                }while (resultSet.next());
            }
       
        return problematicasAcademicas;
        
    }
    

   

    
}
