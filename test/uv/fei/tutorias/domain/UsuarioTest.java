package uv.fei.tutorias.domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {
    
    public UsuarioTest() {
    }

    @org.junit.Test
    public void testSetRol() {
        System.out.println("setRol");
        int rol = 0;
        Usuario instance = new Usuario();
        instance.setRol(rol);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Usuario instance = new Usuario();
        instance.setNombre(nombre);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSetApellidoMaterno() {
        System.out.println("setApellidoMaterno");
        String apellidoMaterno = "";
        Usuario instance = new Usuario();
        instance.setApellidoMaterno(apellidoMaterno);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSetApellidoPaterno() {
        System.out.println("setApellidoPaterno");
        String apellidoPaterno = "";
        Usuario instance = new Usuario();
        instance.setApellidoPaterno(apellidoPaterno);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSetCuentaUV() {
        System.out.println("setCuentaUV");
        String cuentaUV = "";
        Usuario instance = new Usuario();
        instance.setCuentaUV(cuentaUV);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSetContrasenia() {
        System.out.println("setContrasenia");
        String contrasenia = "";
        Usuario instance = new Usuario();
        instance.setContrasenia(contrasenia);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testGetCuentaUV() {
        System.out.println("getCuentaUV");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getCuentaUV();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testGetRol() {
        System.out.println("getRol");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.getRol();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testGetContrasenia() {
        System.out.println("getContrasenia");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getContrasenia();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testGetApellidoPaterno() {
        System.out.println("getApellidoPaterno");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getApellidoPaterno();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testGetApellidoMaterno() {
        System.out.println("getApellidoMaterno");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getApellidoMaterno();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Usuario instance = new Usuario();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
