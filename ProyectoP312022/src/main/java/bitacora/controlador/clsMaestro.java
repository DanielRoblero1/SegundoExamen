package bitacora.controlador;

import compras.controlador.*;

public class clsMaestro {
    private int maestrocodigo;
    private String maestronomb  ;
    private String maestroestatus;
    private String maetrotelefono;
    private String maestroemail;
    private String maestrodirec;


    public clsMaestro() {
    }

    public clsMaestro(int maestrocodigo) {
        this.maestrocodigo = maestrocodigo;
    }
    
    public clsMaestro(String maestronomb, String maestroestatus) {
        this.maestronomb = maestronomb;
        this.maestroestatus = maestroestatus;
    }
    
    public clsMaestro(int maestrocodigo, String maestronomb, String maestroestatus) {
        this.maestrocodigo = maestrocodigo;
        this.maestronomb = maestronomb;
        this.maestroestatus = maestroestatus;
    }
    

    public int getmaestrocodigo() {
        return maestrocodigo;
    }

    public void setmaestrocodigo(int maestrocodigo) {
        this.maestrocodigo = maestrocodigo;
    }

    public String getmaestronomb() {
        return maestronomb;
    }

    public void setmaestronomb(String maestronomb) {
        this.maestronomb = maestronomb;
    }

    public String getmaestroestatus() {
        return maestroestatus;
    }

    public void setmaestroestatus(String maestroestatus) {
        this.maestroestatus = maestroestatus;
    }
    
    public String getmaetrotelefono() {
        return maetrotelefono;
    }

    public void setmaetrotelefono(String maetrotelefono) {
        this.maetrotelefono = maetrotelefono;
    }

    public String getmaestroemail() {
        return maestroemail;
    }

    public void setmaestroemail(String maestroemail) {
        this.maestroemail = maestroemail;
    }
    public String getmaestrodirec() {
        return maestrodirec;
    }

    public void setmaestrodirec(String maestrodirec) {
        this.maestrodirec = maestrodirec;
    }
    @Override
    public String toString() {
        return "maestros{" + "maestrocodigo=" + maestrocodigo + ", maestronomb=" + maestronomb + ", maestroestatus=" + maestroestatus + ", maetrotelefono=" + maetrotelefono + ", maestroemail" + maestroemail + ", maestrodirec" + maestrodirec + '}';
    }
    
    
}
