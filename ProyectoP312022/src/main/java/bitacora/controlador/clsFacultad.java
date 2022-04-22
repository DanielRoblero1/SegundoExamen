package bitacora.controlador;

import compras.controlador.*;

public class clsFacultad {
    private int facultadcodigo;
    private String facultadnomb  ;
    private String facultadestatus;


    public clsFacultad() {
    }

    public clsFacultad(int facultadcodigo) {
        this.facultadcodigo = facultadcodigo;
    }
    
    public clsFacultad(String facultadnomb, String facultadestatus) {
        this.facultadnomb = facultadnomb;
        this.facultadestatus = facultadestatus;
    }
    
    public clsFacultad(int facultadcodigo, String facultadnomb, String facultadestatus) {
        this.facultadcodigo = facultadcodigo;
        this.facultadnomb = facultadnomb;
        this.facultadestatus = facultadestatus;
    }
    

    public int getfacultadcodigo() {
        return facultadcodigo;
    }

    public void setfacultadcodigo(int facultadcodigo) {
        this.facultadcodigo = facultadcodigo;
    }

    public String getfacultadnomb() {
        return facultadnomb;
    }

    public void setfacultadnomb(String facultadnomb) {
        this.facultadnomb = facultadnomb;
    }

    public String getfacultadestatus() {
        return facultadestatus;
    }

    public void setfacultadestatus(String facultadestatus) {
        this.facultadestatus = facultadestatus;
    }
    
 
    @Override
    public String toString() {
        return "facultades{" + "facultadcodigo=" + facultadcodigo + ", facultadnomb=" + facultadnomb + ", facultadestatus=" +facultadestatus  + '}';
    }
    
    
}
