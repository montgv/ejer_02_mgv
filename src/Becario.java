import java.io.Serializable;

public class Becario implements Serializable {
    private String nombreCompleto;
    private String sexo;
    private int edad;
    private int numSuspensos;
    private String residenciaFamiliar;
    private int ingresosAnuales;

    public Becario(String nombreCompleto, String sexo, int edad, int numSuspensos, String residenciaFamiliar, int ingresosAnuales) {
        this.nombreCompleto = nombreCompleto;
        this.sexo = sexo;
        this.edad = edad;
        this.numSuspensos = numSuspensos;
        this.residenciaFamiliar = residenciaFamiliar;
        this.ingresosAnuales = ingresosAnuales;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumSuspensos() {
        return numSuspensos;
    }

    public void setNumSuspensos(int numSuspensos) {
        this.numSuspensos = numSuspensos;
    }

    public String getResidenciaFamiliar() {
        return residenciaFamiliar;
    }

    public void setResidenciaFamiliar(String residenciaFamiliar) {
        this.residenciaFamiliar = residenciaFamiliar;
    }

    public int getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(int ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }

    @Override
    public String toString() {
        return "Becario {" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", sexo='" + sexo + '\'' +
                ", edad=" + edad +
                ", numSuspensos=" + numSuspensos +
                ", residenciaFamiliar='" + residenciaFamiliar + '\'' +
                ", ingresosAnuales=" + ingresosAnuales +
                '}';
    }
}
