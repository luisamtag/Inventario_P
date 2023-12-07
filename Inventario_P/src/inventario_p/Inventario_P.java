package inventario_p;
import java.io.*;

public class Inventario_P {
        public static String lea(String men){
        String dato="";
        InputStreamReader objFlujo = new InputStreamReader(System.in);
        BufferedReader objleer = new BufferedReader(objFlujo);
        try{
            System.out.println(men);
            dato= objleer.readLine();
        }catch(IOException e){
            System.out.println("Error de lectura");  
        }
        return dato;
    }
        public static NDvds lea(){
        nombre= lea("Por favor digite el nombre");
        genero = lea("Ingrese el genero del DVDs");
        cantidad = Integer.parseInt(lea("Ingrese la cantidad de DVDs"));
        codigo = Integer.parseInt(lea("Ingrese el codigo del DvDs"));
        NDvds nuevo = new NDvds(nombre, genero, cantidad, codigo);
        return nuevo;
    }   
    static String genero="";
    static String nombre="";
    static int cantidad=0;
    static int codigo=0;

    public Inventario_P() {
    }
    
    public static void main(String[] args) {
       int op=0;
        GLLDobles.nuevaLLD();
        do{
            op= Integer.parseInt(lea("Menu principal\n"+
                "1.Ingresar un DVDs \n2.Eliminar un DVD del inventario\n"+
                "3.Mostrar los DVDs que hay en el inventario \n4.Buscar un DVD\n"+
                "0.Salir"));
            switch(op){
                case 1:
                   GLLDobles.ingresarOrden(lea());
                break;
                case 2:
                   codigo = Integer.parseInt(lea("Ingrese el codigo del DVD que desea eliminar"));
                   GLLDobles.eliminar(codigo);
                break;
                case 3:
                    GLLDobles.ImpInventario();
                break;
                case 4:
                    codigo = Integer.parseInt(lea("Ingrese el codigo del DVD que desea buscar"));
                    GLLDobles.Buscar(codigo);
                break;
                case 0:
                    System.out.println("Fin del programa");
                break;
                default:
                    System.out.println("Error opcion no valida");
                break;
            }
        }while(op!=0);
    }
    
}
