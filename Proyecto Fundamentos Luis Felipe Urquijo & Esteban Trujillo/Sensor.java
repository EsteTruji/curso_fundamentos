import java.util.ArrayList;

public class Sensor{
    public static Sensor[] sensores = new Sensor[8];
    public static int tamano = 8;
    public static int posAnadir = 0;
    private String tipo;
    private double valor;
    public static String texto = "";
    
    public Sensor(String t, double v){
        this.tipo = t;
        this.valor = v;
    }
    
    public static void Sensor(Sensor sensor){
        sensores[Sensor.posAnadir] = sensor;
        Sensor.posAnadir++;
    }
    
    public static String toStringSensores(){
        for(int i = 0; i < posAnadir; i++){
            texto = (Sensor.sensores[i]).getTipo() + " " + (Sensor.sensores[i]).getValor() + "// " + texto;
        }
        return texto;
    }
    
    public static String encontrarTipo(){
        String texto = "";
        for(int h = 0; h < posAnadir; h++){
            if((sensores[h].getTipo()).equals("temperatura")){
                texto = sensores[h].toString() + " // "+ texto;
            }
        }
        return texto;
    }
    
    public static ArrayList<Sensor> organizarSensores(){
         ArrayList<Sensor> listaSensores = new ArrayList<Sensor>();
        int cont = 0;
        for(int h = 0; h < posAnadir; h++){
            if((sensores[h].getTipo()).equals("temperatura")){
                listaSensores.add(sensores[h]);
                cont++;
            }
        }
        
        int pos_menor;
        Sensor temp;
        for (int i = 0; i < cont - 1; i++) {
            pos_menor = i;
            for (int j = i + 1; j < cont; j++) {
                if ((listaSensores.get(j)).getValor() < (listaSensores.get(pos_menor)).getValor()){
                    pos_menor = j;
                }
            }
            temp = listaSensores.get(i);
            listaSensores.set(i, listaSensores.get(pos_menor));
            listaSensores.set(pos_menor, temp);
        }
        
        return listaSensores;
    }
    
    public static int cantidadSensores(){
        return Sensor.posAnadir;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public void setValor(double v){
        this.valor = v;
    }
    
    public String toString(){
        return this.tipo + " " + this.valor;
    }
}