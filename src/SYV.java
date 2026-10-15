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
    int [] enemi2 = {trump.fuerza, epstein.fuerza, netan.fuerza};
    int [] enemi3 = {trump.resistencia , epstein.resistencia , netan.resistencia };
    int [] enemi4 = {trump.vida_hp, epstein.vida_hp, netan.vida_hp};
    String [] enemi5 = {trump.imagen, epstein.imagen, netan.imagen};

    String [] equi1 = {steve.nombre, leon.nombre, link.nombre};
    int [] equi2 = {steve.fuerza, leon.fuerza, link.fuerza};
    int [] equi3 = {steve.resistencia, leon.resistencia, link.resistencia};
    int [] equi4 = {steve.vida_hp, leon.vida_hp, link.vida_hp};

    int Enemigos =3;
    int Equipo = 3;

    System.out.println("SALVA A LOS NIÑOS");
    System.out.println("");
    System.out.println("Presiona ENTER para comezar");
    vacio = teclado.nextLine();

    System.out.println("El objetivo de tu equipo es rescatar a los niños de una isla en el caribe");
    System.out.println("");
    System.out.println("Para salvar los niños necesitamos derrotar a quienes lo custodian");

    Thread.sleep(4500);





    while (Enemigos != 0) {
        double daño_recibido;
        int e=0;
        int t=0;
        System.out.println("Ahora te enfrentas a "+enemi1[e]);
        System.out.println("");
        Thread.sleep(1500);
        System.out.println(enemi5[e]);
        System.out.println("");
        System.out.println("");

        System.out.println("Controlas a "+equi1[t]);

        
        System.out.println("escoja la habilidad");

        System.out.println("1. ATACAR");
        System.out.println("2. FORTALECER");
        System.out.println("3. CURAR");
        System.out.println("4. AUMENTAR ATAQUE");
        System.out.println("5. MOSTRAR ESTADISTICAS");
        int accion = teclado.nextInt();
        
        switch (accion) {
            case 1:
               System.out.println("escojistes atacar");
                break;
                daño_recibido=
            case 2:
                System.out.println("escojistes fortalecer");
                break;
            case 3:
                System.out.println("escojistes curar");
                break;
            case 4:
                System.out.println("escojistes aumentar ataque");
                break;
            case 5:
                System.out.println("escojistes mostrar estadisticas");
                System.out.println("TU EQUIPO");
                System.out.println("Nombre: "+equi1[t]);
                System.out.println("Fuerza: "+equi2[t]);
                System.out.println("Resistencia: "+equi3[t]);
                System.out.println("Salud: "+equi4[t]);
                System.out.println("");
                System.out.println("");
                System.out.println("PEDOFILOS");
                System.out.println("Nombre: "+enemi1[e]);
                System.out.println("Fuerza: "+enemi2[e]);
                System.out.println("Resistencia: "+enemi3[t]);
                System.out.println("Salud: "+enemi4[e]);

                Thread.sleep(6000);

                break;
            default:
                System.out.println("valor no valido");
                break;
        }





    }        

    teclado.close();
    }
}
