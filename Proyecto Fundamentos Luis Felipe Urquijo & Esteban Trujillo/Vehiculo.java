public class Vehiculo{
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;

    public static Vehiculo[] vehiculos = new Vehiculo[10];
    public static int tamano = 10;
    public static int posAnadir = 0;

    public static void ubicarVehiculo(Vehiculo veh){
        vehiculos[posAnadir] = veh;
        Vehiculo.posAnadir++;
    }

    public Vehiculo(int mo, String ma, double va){
        this(mo, ma, va, "verde");
    }

    public Vehiculo(int mo, String ma, double va, String co){
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va;
        this.color = co;
    }

    public int getModelo(){
        return this.modelo;
    }

    public String getMarca(){
        return this.marca;
    }

    public double getValorComercial(){
        return this.valorComercial;
    }

    public String getColor(){
        return this.color;
    }

    public void setModelo(int mo){
        this.modelo = mo;
    }

    public void setMarca(String ma){
        this.marca = ma;
    }

    public void setValorComercial(double va){
        this.valorComercial = va;
    }

    public void setColor(String co){
        this.color = co;
    }

    public String toString(){
        return this.modelo +" " + this.marca +" "+ this.valorComercial +" "+ this.color + " // ";
    }

    public static String toStringVehiculos(){
        String informacion = "";
        for(int i = 0; i<Vehiculo.posAnadir; i++){
            informacion = vehiculos[i].toString() + " // "+ informacion;
        }
        return informacion;
    }

    public static int cantidadVehiculos(){
        return Vehiculo.posAnadir;
    }
    
    public static String encontrarColor(){
        String texto = "";
        for(int h = 0; h < posAnadir; h++){
            if((vehiculos[h].getColor()).equals("verde")){
                texto = vehiculos[h].toString() + " // "+ texto;
            }
        }
        return texto;
    }

}