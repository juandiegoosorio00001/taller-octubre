public class Administrador extends Persona{

    public Administrador(String name, String lastname, int identificacion, String ocupacion) {
        super(name, lastname, identificacion, ocupacion);
    }
    
    public void crearpersona(){
       System.out.println("Bienvenido administrador: "+name +" "+ lastname + ocupacion +" id: "+ identificacion );
    }
}
