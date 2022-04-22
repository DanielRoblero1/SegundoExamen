package bitacora.controlador;

import compras.controlador.*;

public class clsAlumno {
    private int alumnocarnet;
    private String alumnonomb  ;
    private String alumnoestatus;
    private String alumnotelefono;
    private String alumnoemail;
    private String alumnodirec;


    public clsAlumno() {
    }

    public clsAlumno(int alumnocarnet) {
        this.alumnocarnet = alumnocarnet;
    }
    
    public clsAlumno(String alumnonomb, String alumnoestatus) {
        this.alumnonomb = alumnonomb;
        this.alumnoestatus = alumnoestatus;
    }
    
    public clsAlumno(int alumnocarnet, String alumnonomb, String alumnoestatus) {
        this.alumnocarnet = alumnocarnet;
        this.alumnonomb = alumnonomb;
        this.alumnoestatus = alumnoestatus;
    }
    

    public int getalumnocarnet() {
        return alumnocarnet;
    }

    public void setalumnocarnet(int alumnocarnet) {
        this.alumnocarnet = alumnocarnet;
    }

    public String getalumnonomb() {
        return alumnonomb;
    }

    public void setalumnonomb(String alumnonomb) {
        this.alumnonomb = alumnonomb;
    }

    public String getalumnoestatus() {
        return alumnoestatus;
    }

    public void setalumnoestatus(String alumnoestatus) {
        this.alumnoestatus = alumnoestatus;
    }
    
    public String getalumnotelefono() {
        return alumnotelefono;
    }

    public void setalumnotelefono(String alumnotelefono) {
        this.alumnotelefono = alumnotelefono;
    }

    public String getalumnoemail() {
        return alumnoemail;
    }

    public void setalumnoemail(String alumnoemail) {
        this.alumnoemail = alumnoemail;
    }
    public String getalumnodirec() {
        return alumnodirec;
    }

    public void setalumnodirec(String alumnodirec) {
        this.alumnodirec = alumnodirec;
    }
    @Override
    public String toString() {
        return "alumnos{" + "alumnocarnet=" + alumnocarnet + ", alumnonomb=" + alumnonomb + ", alumnoestatus=" + alumnoestatus + ", alumnotelefono=" + alumnotelefono + ", alumnoemail" + alumnoemail + ", alumnodirec" + alumnodirec + '}';
    }
    
    
}
