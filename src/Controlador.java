public class Controlador {
    // <>=
    private static String[] jugadas =new String[10];
    private static String[] opciones = new String[3];
    public static String jugadaAl(){
        int aleatorio ;
        opciones[0] = "Piedra";
        opciones[1] = "Papel";
        opciones[2] = "Tijera";
        aleatorio = (int)(Math.random() * opciones.length);
        return opciones[aleatorio];
    }

    public int muestraEstadisticas(){
    return  5;
    }

    public  String calculaGanador(){
        return "Usuario";
    }

    public static void main(String[] args) {
        int k = 1;
        //Empezamas genenardo la jugada de la IA.
        for (int i = 0; i  < 10; i++){
            jugadas[i] = jugadaAl();
        }
        for(int j = 0; j <10; j+=2){

                System.out.println("Jugada de j i k" + j +".."+ k);
                System.out.println("Jugador: " + jugadas[j]);
                System.out.println("IA: " + jugadas[k]);

                if (jugadas[j].equals(jugadas[k])){
                    System.out.println("Empate.");
                }
                else if(jugadas[j].equals("Piedra")){
                        if(jugadas[k].equals("Papel")){
                            System.out.println("Victoria IA");
                        }else{//tijera
                            System.out.println("Victoria Jugador");
                        }
                }else if(jugadas[j].equals("Papel")){
                    if(jugadas[k].equals("Piedra")){
                        System.out.println("Victoria Jugador");
                    }else{ // tijera
                        System.out.println("Victoria IA");
                    }
                }else if(jugadas[j].equals("Tijera")){
                    if(jugadas[k].equals("Piedra")){
                        System.out.println("Victoria IA");
                    }else{
                        System.out.println("Victoria Jugador");
                    }
                }
            k = k+2;
            }

        }




    }


