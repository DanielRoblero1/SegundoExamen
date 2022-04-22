/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitacora.modelo;

import bitacora.controlador.clsAlumno;
import bitacora.controlador.clsFacultad;
import compras.modelo.*;
import compras.vista.frmMantenimientoProveedor;
import compras.controlador.clsProveedor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import seguridad.modelo.clsConexion;

/**
 *
 * @author visitante
 */
public class daoFacultad {

    private static final String SQL_SELECT2 = "SELECT facultadcodigo, facultadnomb ,facultadestatus FROM facultades";
    private static final String SQL_INSERT = "INSERT INTO facultades(facultadnomb,facultadestatus) VALUES(?,?)";
    private static final String SQL_UPDATE = "UPDATE facultades SET alumnonomb = ?, alumnonomb = ?, alumnodirec = ?, alumnotelefono = ?, alumnoemail = ?, alumnoestatus = ? WHERE tbl_proveedor.provid = ?";
    private static final String SQL_DELETE = "DELETE FROM facultades WHERE facultades.facultadcodigo = ?";
    private static final String SQL_QUERY = "SELECT provid, provnombre, provestado, provtelefono, provdireccion FROM tbl_proveedor WHERE provid = ?";

    public List<clsFacultad> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        clsFacultad usuario = null;
        List<clsFacultad> usuarios = new ArrayList<clsFacultad>();
        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT2);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int facultadcodigo = rs.getInt("facultadcodigo");
                String  facultadnomb = rs.getString("facultadnomb");
                String facultadestatus = rs.getString("facultadestatus");
   


                usuario = new clsFacultad();
                usuario.setfacultadcodigo(facultadcodigo);
                usuario.setfacultadnomb(facultadnomb);
                usuario.setfacultadestatus(facultadestatus);
   

                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(rs);
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return usuarios;
    }

    public int insert(clsFacultad facultad) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, facultad.getfacultadnomb());
            stmt.setString(2, facultad.getfacultadestatus());



            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return rows;
    }

    public int update(clsProveedor proveedor) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = clsConexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, proveedor.getprovnombre());
            stmt.setString(2, proveedor.getprovestado());
            //stmt.setString(3, proveedor.getprovtelefono());
            stmt.setString(4, proveedor.getprovtdireccion());
            stmt.setInt(5, proveedor.getprovid());



            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return rows;
    }

    public int delete(clsFacultad perfil) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, perfil.getfacultadcodigo());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return rows;
    }

    public clsProveedor query(clsProveedor proveedor) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = clsConexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setInt(1, proveedor.getprovid());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int provid = rs.getInt("provid");
                String provnombre = rs.getString("provnombre");
                String provestado = rs.getString("provestado");
                int provtelefono = rs.getInt("provtelefono");
                String provdireccion = rs.getString("provdireccion");

                proveedor = new clsProveedor();
                proveedor.setprovid(provid);
                proveedor.setprovnombre(provnombre);
                proveedor.setprovestado(provestado);
                proveedor.setprovtelefono(provtelefono);
                proveedor.setprovtdireccion(provdireccion);
            }
            //System.out.println("Registros buscado:" + persona);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(rs);
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        //return personas;  // Si se utiliza un ArrayList
        return proveedor;
    }

    public void insert(clsProveedor vendedorAInsertar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
