
/**
 * Write a description of class JpuniversitySystem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class JpuniversitySystem
{
    public static void main(String[] args) {
      
          
      Date nacimiento= new Date("02","04","2000");
      Date nacimiento2= new Date("01","05","1990");
      Date nacimiento3= new Date("07","02","2005");
      
      Date asignacion = new Date("18","05","2021");
      Date asignacion2= new Date("12","07","2015");
      Date asignacion3= new Date("11","08","2017");
      
      Date entrega1= new Date("20","06","2021");
      Date entrega2= new Date("22","08","2015");
      Date entrega3= new Date("21","09","2017");
     
      Ayuda ayuda1 = new Ayuda (TipoAyuda.INTERNET,Estado.ENTREGADA,asignacion,entrega1);
      Ayuda ayuda2 = new Ayuda (TipoAyuda.BASICO,Estado.RECHAZADA,asignacion2,entrega2);
      Ayuda ayuda3 = new Ayuda (TipoAyuda.COMPUTADOR,Estado.ENTREGADA,asignacion3,entrega3);
      
      Estudiante estudiante1= new Estudiante ("1152267","1008569745","Millos David",nacimiento,"2","millosdavid@ufps.edu.co",TipoDocumento.CE,ayuda1);
      Estudiante estudiante2= new Estudiante ("1235468","1005786956","Messi Ronaldo",nacimiento2,"1","messironaldo@ufps.edu.co",TipoDocumento.NUIP,ayuda2);
      Estudiante estudiante3= new Estudiante ("1241568","1090508722","Neymar Pele",nacimiento3,"2","neymarpele.edu.co",TipoDocumento.CC,ayuda3);
      
      
        estudiante1.imprimirInformacionEstudiante();
        estudiante1.imprimirRelacionAyudas();
        System.out.println("------------------------------");
        estudiante2.imprimirInformacionEstudiante();
        estudiante2.imprimirRelacionNoAyudas();
        System.out.println("------------------------------");
        estudiante3.imprimirInformacionEstudiante();
        estudiante3.imprimirRelacionAyudas();
     
    } 
}
