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
        //#region trump
        Villano trump = new Villano("Donald Trump", 32, 4, 108,"                                                       \r\n" + //
                        "                                                       \r\n" + //
                        "                                                       \r\n" + //
                        "                  ··············####···                \r\n" + //
                        "             ···##··        ···  ······#·              \r\n" + //
                        "            ··   ·######··#·  ·#·  ·#··#·#·            \r\n" + //
                        "          ·##·     ··####···#· ··· ··######·           \r\n" + //
                        "           ·#·      ··######·###··· ·######·#·         \r\n" + //
                        "          ·#·   ···· ···##############·###····         \r\n" + //
                        "          ··  ···#··##··##########·####·· · #·         \r\n" + //
                        "         ··   ·##·      ···####···       ##···         \r\n" + //
                        "         ··  ·###·                      ·###·#         \r\n" + //
                        "        ··  ·###·                        ·#····        \r\n" + //
                        "        ·#······   ·#######··#···#####·· ·#· ··        \r\n" + //
                        "         ·· ··#·  ·##·· ·····#········#· ·#  ··        \r\n" + //
                        "          ··#···   ········   ·········· ····#         \r\n" + //
                        "          ····#·     ···#·    ·· ·#···   ·····         \r\n" + //
                        "           ·····  ·        ·  ···      · ····          \r\n" + //
                        "            ····   ··    ···  ····   ··  ··#           \r\n" + //
                        "              ··   ··   ·····#····   ··  #·            \r\n" + //
                        "               #·      ··         ··    ·#             \r\n" + //
                        "                #·     ····#######·    ··              \r\n" + //
                        "                 ··       ·#####·      #·              \r\n" + //
                        "                  ··                 ··                \r\n" + //
                        "                    ··#·         ·····                 \r\n" + //
                        "                        ··········                     \r\n" + //
                        "                                                       \r\n" + //
                        "                                                       ");
        //#endregion

        //#region epstein
        Villano epstein = new Villano("Jeffrey Epstein", 35, 20, 130,"                       .::.                            \r\n" + //
                        "                    :+..--:  .#*=-:                    \r\n" + //
                        "              .+%++#+-:=*-=##*+==-%*.                  \r\n" + //
                        "            --%--+*=+=-#-.==*=%#.-#*%+.                \r\n" + //
                        "         :. =*+. =:.=-:::.. -::*%#%:-*#-               \r\n" + //
                        "        .- .%@=-.*#=-*%#+#=:##%@@@@@@#*+               \r\n" + //
                        "       .++:%@-=-*:. ::.     ..+@@*%@@*-+=              \r\n" + //
                        "        *- .#-=                *@@*+@%@##+             \r\n" + //
                        "        =.*:.**              .:=@@@-%*-%#+             \r\n" + //
                        "       .*+--= ::               .+@@=+@+=%++            \r\n" + //
                        "        +* ..-  .         :    -:....+@#=%+-           \r\n" + //
                        "        -.  .* .*      .. + :#%@@@%@%.*%-.*            \r\n" + //
                        "        :#:.. +@: :*@#*@@%: :%@#+%##%*.%*.=            \r\n" + //
                        "         -*+  -#  --++*##=   #@%: .-::: -#@.           \r\n" + //
                        "          :%+::*      .::    :@@=    %%  %#.           \r\n" + //
                        "           .=.##      .       =*#:   @@- *:            \r\n" + //
                        "            = *         :-   :@@@=*. #@= +=            \r\n" + //
                        "             -- .      .+    -=#@@+:#..@-:             \r\n" + //
                        "              ::+-     *.      .=%@@@#.#-%             \r\n" + //
                        "                 -.   *-..-*#=%#++**@%- -@:            \r\n" + //
                        "                  -   .      .=%@@@@@@+.#@+            \r\n" + //
                        "                   :-         +@@@@@@= *@@+            \r\n" + //
                        "                   : ::          .:@@.#@@@#            \r\n" + //
                        "                   .=  .-        *@%:%@@@@:            \r\n" + //
                        "                   .%-    .::-+**#*%@@@@%.             \r\n" + //
                        "                     =.      :%@@@@@@@#-               \r\n" + //
                        "                               -@*--.                  \r\n" + //
                        "                                                       ");
        //#endregion

       //#region netan
        Villano netan = new Villano("Benjamin Netanyahu", 49, 25, 150,"                                                       \r\n" + //
                        "                                                       \r\n" + //
                        "                      ..:----:...                      \r\n" + //
                        "                  .---::######::::---.                  \r\n" + //
                        "               .--.::.:##:.........-=:--.              \r\n" + //
                        "             .--.:.-:  :=+=:.     :=:--.--             \r\n" + //
                        "            .=..:.:--.              -:::.-:            \r\n" + //
                        "           .+.::=-                   -:.. +.           \r\n" + //
                        "          -- .--:                    .= .. +           \r\n" + //
                        "         .- ...:        .             :-   *:.         \r\n" + //
                        "         :- . ::    ......:#::.        :: =.:--        \r\n" + //
                        "         .=.# .:      ..        .+##*=  -:=-:.-.       \r\n" + //
                        "          =.   :.   ..:.      -#+:..    ::#..=-        \r\n" + //
                        "          :+:. ::  +*+=+++=.  -.=+.-+    :+-.=-        \r\n" + //
                        "         --::--:-. .:+-.*- :. - :.        ==--:        \r\n" + //
                        "          =.- -==.    .  - .. -           .= -:        \r\n" + //
                        "           =:: :=.    ..   .:              +--         \r\n" + //
                        "            --::+:        .:.   ::-.       -:          \r\n" + //
                        "             :=.:-       :---. ::: .-      :-          \r\n" + //
                        "               -+*      .:           .:    +.          \r\n" + //
                        "                 :=     :  ..:.:-----.    --           \r\n" + //
                        "                  :=     .:--..::::.     -:            \r\n" + //
                        "                   .-:        .:-:.     -:             \r\n" + //
                        "                     :=.              :=.              \r\n" + //
                        "                       .--:         --.                \r\n" + //
                        "                          .:=====-::                   \r\n" + //
                        "                                                       \r\n" + //
                        "                                                       ");
//#endregion

    String vacio;
    SuperHero steve = new SuperHero("Steve", 25, 14, 100,"");
    SuperHero leon = new SuperHero("Leon Scott Kennedy", 40, 17, 125,"");
    SuperHero link = new SuperHero("Link el Heroe del Tiempo", 42, 30, 135,"");
    String [] enemi1 = {trump.nombre, epstein.nombre, netan.nombre};
    String [] enemi2 = {trump.imagen, epstein.imagen, netan.imagen};
    String [] equi = {steve.nombre, leon.nombre, link.nombre};

    int Enemigos =3;
    int Equipo = 3;

    System.out.println("SALVA A LOS NIÑOS");
    System.out.println("");
    System.out.println("");
    System.out.println("Presiona ENTER para comezar");
    vacio= teclado.next();
    
    System.out.println("El objetivo de tu equipo es rescatar a los niños de una isla en el caribe");
    System.out.println("");
    System.out.println("Para salvar los niños necesitamos derrotar a quienes lo custodian");






    while (Enemigos != 0) {
        int q=0;

        System.out.println("Ahora te enfrentas a "+enemi1[q]);
        System.out.println("");
        Thread.sleep(3000);
        System.out.println(enemi2[q]);
        System.out.println("");
        System.out.println("escoja la habilidad");
        int habilidad = teclado.nextInt();
        
        switch (habilidad) {
            case 1:

                break;
            
                default:
                break;
            }





    }        

    teclado.close();
    }
}
