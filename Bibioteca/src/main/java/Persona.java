public class Persona {
    String name;
    String lastname;
    int identificacion;
    String ocupacion;

    public Persona(String name, String lastname, int identificacion, String ocupacion) {
        this.name = name;
        this.lastname = lastname;
        this.identificacion = identificacion;
        this.ocupacion = ocupacion;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getlastname() {
        return lastname;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}
