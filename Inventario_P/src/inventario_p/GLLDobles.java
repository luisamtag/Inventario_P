
package inventario_p;


public class GLLDobles {
    static NDvds primero;
    static NDvds ultimo;
    
    public static void nuevaLLD(){
        primero= null;
        ultimo= null;
    }
    public static boolean vacio (){
        if (primero == null && ultimo == null){
            return true;
        }else{
            return false;
        }
    }
        public static void ingresar(NDvds nuevo){
        if(vacio()){
            nuevo.derecha=null;
            nuevo.izquierda=null;
            primero= nuevo;
            ultimo=nuevo;
        }else{
            nuevo.derecha=primero;
            primero.izquierda=nuevo;
            nuevo.izquierda=null;
            primero=nuevo;
        }
        
    }
    public static void ingresarOrden(NDvds nuevo){
        if(vacio()){
            nuevo.izquierda=null;
            nuevo.derecha=null;
            primero=nuevo;
            ultimo=nuevo;
            System.out.println("Inserto unico");
        }else{
            if(nuevo.getCodigo()<= ultimo.getCodigo()){
                ingresar(nuevo);
                System.out.println("Inserto al principio");
            }else{
                NDvds actual = primero;
                     while(actual!=null){
                         if(nuevo.getCodigo()<=actual.getCodigo()){
                             nuevo.derecha= actual;
                             nuevo.izquierda= actual.izquierda;
                             if(actual.izquierda!=null){
                                 actual.izquierda.derecha=nuevo;
                             }else {
                                 primero=nuevo;
                             }
                           actual.izquierda=nuevo;
                           return;
                         }
                         actual = actual.derecha;
                     }
                     ultimo.derecha=nuevo;
                     nuevo.izquierda=ultimo;
                     nuevo.derecha= null;
                     ultimo= nuevo;
                }
            }
        }
    public static NDvds eliminar (double codigo){
        NDvds actual=primero;
        
      while(actual!=null&& actual.getCodigo()!=codigo){
          actual=actual.derecha;
      }
      if(actual==null){
          System.out.println("No se encontro ningun DVDs con el siguiente codigo: "+ codigo);
          return primero;
      }
      if(actual.izquierda!=null){
          actual.izquierda.derecha=actual.derecha;
      }else{
          primero= actual.derecha;
      }
      if(actual.derecha!= null){
          actual.derecha.izquierda=actual.izquierda;
      }
      return primero;
    }
    public static void Buscar (double codigo){
     while(primero!=null){
         if (primero.getCodigo()== codigo){
             System.out.println("El DVD ha sido encontrado");
         }
         primero= primero.derecha;
     }
    }
    public static void ImpInventario(){
        NDvds actual=primero;
       while(actual!=null) {
           System.out.println(actual.getNombre()+", "+actual.getGenero()+", "+actual.getCantidad()+", "+actual.getCodigo());
           actual =actual.derecha;
       }
       if(primero==null){
        System.out.println("La lista esta vacia");
       }
    }
}
