
public class Jugador{
    String nombre;
    String posicionDeJuego;
    int edad;
    int numeroCamiseta;

	public Jugador(String nombre, String posicionDeJuego, int edad, int numeroCamiseta){
        this.nombre = nombre;
        this.posicionDeJuego = posicionDeJuego;
        this.edad = edad;
        this.numeroCamiseta = numeroCamiseta;
    }


    public void presentacion() {

        System.out.println("El Jugador: " + nombre);
        System.out.println("Juega en la posición:  " + posicionDeJuego + "\nTiene: " + edad + " años." + "\nSu numero de 	camiseta es: "+numeroCamiseta);
        System.out.println(" ");

    }

    public  static void main(String[] args){

        //Valores Quemados

        Jugador jugador1 = new Jugador("Henry Espinosa", "DEL", 18, 14);
        Jugador jugador2 = new Jugador("Paco Montes","DC", 19, 20);
        Jugador jugador3 = new Jugador("Elkin Diaz","MCO", 20, 21);

        jugador1.presentacion();
        jugador2.presentacion();
        jugador3.presentacion();

    }




















        }


