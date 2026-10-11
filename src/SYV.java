import java.util.Scanner;
// Clase base del personaje
class Personaje {
    String nombre;
    int fuerza;
    int resistencia;
    int vida_hp;
    String imagen;
    // Definir constructor
    public Personaje(
            String nombre,
            int fuerza,
            int resistencia,
            int vida_hp,
            String imagen)
             {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.vida_hp = vida_hp;
        this.imagen = imagen;
    }
}
class SuperHero extends Personaje {
    // definir el constructor
    public SuperHero(
        String nombre,
        int fuerza,
        int resistencia,
        int vida_hp,
        String imagen)
        {
        super(nombre, fuerza, resistencia, vida_hp,imagen);
    }
}
class Villano extends Personaje {
    // definir el constructor
    public Villano(
        String nombre,
        int fuerza,
        int resistencia,
        int vida_hp,
        String imagen){
            super(nombre, fuerza, resistencia, vida_hp,imagen);
    }
}
public class SYV {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Villano trump = new Villano("Donald Trump", 32, 4, 108,"");
        
        //#region epstein
        Villano epstein = new Villano("Jeffrey Epstein", 35, 16, 130,"                                                                   \n" + //
                        "                            ▓▒      ███                            \n" + //
                        "                    ░▒█▓███▒█░▒▓ ░░  ▓█▒▓██                        \n" + //
                        "                 ▒██▒███▒ ░░░░░ ░▒█████   ██                       \n" + //
                        "               ░▓██▒█▓▓▒█▓▓███ ████░███░█▓████░                    \n" + //
                        "           ░░ ░███   █░ ░█▒░▒░    ▓░ ▓████▓ ▒██▓                   \n" + //
                        "          ░█  ▓███▓░ █▒▒ ▒▒██▓███ ████████████▒█                   \n" + //
                        "         ▒█  ▓███▓█▓▒█▓  ██▓░░░ ▓░░██████████░▓██▓                 \n" + //
                        "         ▒██ ▓███░▒▒                  ████▓███████                 \n" + //
                        "          █▓  ▓▓ █                    ████▓██▓█████                \n" + //
                        "          ▒ ██ ░██░                  ░█████▓██▒████                \n" + //
                        "         ░██▒██░ ░▓                    ████░███▒██▓█░              \n" + //
                        "          ██    ▒                     ▒█▓▓░  ███▒██▓▓              \n" + //
                        "          ▒  ▒  █               █    ▒███████▓██▓ ░ ░              \n" + //
                        "          ▒▓▓  ▓  ██▒    ░███████  █████░░░░   ██░ █               \n" + //
                        "           ███▓  ███  ████▓█████   ████▒██▓███ ▒██▒█               \n" + //
                        "            ██░  ░█▓  ░░██▓▓███    ▒███▓  ▒▓  ░░ ░███              \n" + //
                        "             ██▒  █▓         ▒░     ███▒     ██▒  ██▓              \n" + //
                        "              █░░██▓        ▒       ░███     ███  █▓░              \n" + //
                        "              ▓░ █░▒          ░░    ░████▓   ███  ██               \n" + //
                        "               ▓ ░▓          ▒█ ██░██████░▓▒ ███▓ ▒                \n" + //
                        "                 ▓           █      ░ ████▓██▒ ▓█░▓                \n" + //
                        "                  ▓░█░      █          ░██████ ▓█ █                \n" + //
                        "                     ▓     █▓    █████████████▓  ▓█░               \n" + //
                        "                      █    ░░░▓░     ░▒████████  ███               \n" + //
                        "                                    ▓█████████░ ████               \n" + //
                        "                       ░ ▒░         ██████████ █████               \n" + //
                        "                        ▒  ░             ▒███ ██████░              \n" + //
                        "                        ▒▒   ▒░         ████░██████▒               \n" + //
                        "                        ██      ▓    ░████▓███████░                \n" + //
                        "                         █▓        ▒█████████████                  \n" + //
                        "                          ░        ░██████████░                    \n" + //
                        "                                      ██▒                          \n" + //
                        "                                                               ");
        //#endregion
       
        Villano netan = new Villano("Benjamin Netanyahu", 49, 20, 150,"");

        SuperHero george = new SuperHero("George Pig", 12, 8, 75,"");
        SuperHero leon = new SuperHero("Leon Scott Kennedy", 40, 17, 125,"");
        SuperHero link = new SuperHero("Link el Heroe del Tiempo", 42, 30, 135,"");

       
        System.out.println(epstein.imagen);















































































    teclado.close();
    }
}
