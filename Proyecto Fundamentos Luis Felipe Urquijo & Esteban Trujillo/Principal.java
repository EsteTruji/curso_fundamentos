import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Principal.mostrarMenu();
    }
    
    public static void mostrarMenu(){
            Scanner entrada = new Scanner(System.in);
        while(true){
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("/-----------------------------------------/ MENU /----------------------------------------/");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|| *Ingrese una de los siguientes números para:*                                         ||");
            System.out.println("|| --------------                                                                        ||");
            System.out.println("|| ( 0 ) - Para finalizar la ejecución del programa.                                     ||");
            System.out.println("|| --------------                                                                        ||");
            System.out.println("|| ( 1 ) - Para añadir un nuevo vehículo.                                                ||");
            System.out.println("|| --------------                                                                        ||");
            System.out.println("|| ( 2 ) - Para visualizar los datos de los vehículos creados.                           ||");
            System.out.println("|| --------------                                                                        ||");
            System.out.println("|| ( 3 ) - Para visualizar el número de vehículos creados.                               ||");
            System.out.println("|| --------------                                                                        ||");
            System.out.println("|| ( 4 ) - Para encontrar todos lo vehículos ingresados con color verde.                 ||");
            System.out.println("|| --------------                                                                        ||");
            System.out.println("|| ( 5 ) - Para añadir un nuevo sensor.                                                  ||");
            System.out.println("|| --------------                                                                        ||");
            System.out.println("|| ( 6 ) - Para visualizar los datos de los sensores creados.                            ||");
            System.out.println("|| --------------                                                                        ||");
            System.out.println("|| ( 7 ) - Para visualizar la cantidad de sensores creados.                              ||");
            System.out.println("|| --------------                                                                        ||");
            System.out.println("|| ( 8 ) - Para encontrar todos los sensores ingresados con tipo temperatura.            ||");
            System.out.println("|| --------------                                                                        ||");
            System.out.println("|| ( 666 ) - Para organizar y visualizar los sensores ingresados de menor a mayor valor. ||");
            System.out.println("|| --------------                                                                        ||");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            int num = entrada.nextInt();
            if(num == 0){
                System.out.println("------ Hasta pronto. Gracias por usar el programa!! :)");
                System.out.println("    ");
                System.out.println("    ");
                System.out.println("              ||||           ||||            ");
                System.out.println("              ||||           ||||            ");
                System.out.println("              ||||           ||||            ");
                System.out.println("              ||||           ||||            ");
                System.out.println("              ||||           ||||            ");
                System.out.println("              ||||           ||||            ");
                System.out.println("                                                 ");
                System.out.println("     ||||                             ||||    ");
                System.out.println("     ||||                             ||||    ");
                System.out.println("     ||||                             ||||    ");
                System.out.println("      ||||                           ||||    ");
                System.out.println("       ||||                        ||||    ");
                System.out.println("         ||||                    ||||    ");
                System.out.println("            ||||              ||||    ");
                System.out.println("               ||||||||||||||||     ");
                break;
            }else if(num == 1){
                if(Vehiculo.posAnadir < Vehiculo.tamano){
                    System.out.println("--- Ingrese un modelo (int):");
                    int mod = entrada.nextInt();
                    System.out.println("--- Ingrese una marca (String):");
                    String mar = entrada.next();
                    System.out.println("--- Ingrese un valor (double):");
                    double val = entrada.nextDouble();
                    Vehiculo vehiculo = new Vehiculo(mod,mar,val);
                    Vehiculo.ubicarVehiculo(vehiculo);
                    
                }else{
                    System.out.println("Error base de datos llena");
                }
            }else if(num == 2){
                if(Vehiculo.cantidadVehiculos() > 0){
                    System.out.println(Vehiculo.toStringVehiculos());
                }else{
                    System.out.println("--- No se han ingresado vehículos aún.");
                    System.out.println("--- Por favor, primero añada vehículos para después visualizarlos.");
                }
            }else if(num == 3){
                System.out.println("--- La cantidad de vehículos ingresados es: "+ Vehiculo.cantidadVehiculos()+".");
            }else if(num == 4){
                if(Vehiculo.cantidadVehiculos() > 0){
                    System.out.println(Vehiculo.encontrarColor());
                }else{
                    System.out.println("--- No se han ingresado vehículos aún.");
                    System.out.println("--- Por favor, primero añada vehículos para después visualizar los de un color específico.");
                }
            }else if(num == 5){
                if(Sensor.posAnadir < Sensor.tamano){
                    System.out.println("--- Ingrese un tipo (String):");
                    String t = entrada.next();
                    System.out.println("--- Ingrese un valor (double):");
                    int v = entrada.nextInt();
                    Sensor sensor = new Sensor(t,v);
                    Sensor.Sensor(sensor);
                    
                }else{
                    System.out.println("Error base de datos llena");
                }
            }else if(num == 6){
                if(Sensor.cantidadSensores() > 0){
                    System.out.println(Sensor.toStringSensores());
                }else{
                    System.out.println("--- No se han ingresado sensores aún.");
                    System.out.println("--- Por favor, primero añada sensores para después visualizarlos.");
                }       
            }else if(num == 7){
                System.out.println("--- La cantidad de sensores ingresados es: "+Sensor.cantidadSensores()+".");
            }else if(num == 8){
                if(Sensor.cantidadSensores() > 0){
                    System.out.println(Sensor.encontrarTipo());
                }else{
                    System.out.println("--- No se han ingresado sensores aún.");
                    System.out.println("--- Por favor, primero añada sensores para después visualizar los de un tipo específico.");
                }   
            }else if(num == 666){
                if(Sensor.cantidadSensores() > 0){
                    System.out.println(Sensor.organizarSensores());
                }else{
                    System.out.println("--- No se han ingresado sensores aún.");
                    System.out.println("--- Por favor, primero añada sensores para después organizar los de");
                    System.out.println("    los de un tipo específico y visualizarlos posteriormente.");
                }   
            }
        }
    }
}
