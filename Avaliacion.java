
package media1ª;
    import java.util.Scanner;
/**
 *
 * @author sverdecadilla
 */
public class Avaliacion {
    private String nome;
    private int mediaP, mediaT, mediaB;
    private int Puntos=0;
    Scanner sc = new Scanner(System.in);
    
    public void pedirNome(){
       System.out.println("El nombre es..");
         nome = sc.nextBoolean()
    }
    
    public boolean pruebaNome (){
        
        if ("fin".equals(nome))
               return true;
        else   return false;
    }
    
    public void mediaTeorico(){
        float nota1 = 0,nota2 = 0;
            System.out.println("Nota 1 es..");
            nota1 = sc.nextInt();
            System.out.println("Nota 2 es..");
            nota2 = sc.nextInt();
        while (nota1<0 && nota2<0)

            System.out.println("Nota 1 es..");
            nota1 = sc.nextInt();
            System.out.println("Nota 2 es..");
            nota2 = sc.nextInt();            

        
        mediaT=(int) ((nota1+nota2)/2 * 0.4);
        System.out.println(mediaT + "Es la media del Teorico");
        
        switch(mediaT) {
            case 1:
                Puntos++;
                
                System.out.println(Puntos);
            break;
            case 2:
                Puntos++;Puntos++;
                
                System.out.println(Puntos);
            break;
            case 3:
                Puntos++;Puntos++;Puntos++;
                
                System.out.println(Puntos);
            break;
            case 4:
                Puntos++;Puntos++; Puntos++;Puntos++;
                
                System.out.println(Puntos);
            break;
        default:
            System.out.println(Puntos);
            System.out.println("Mas suerte la proxima vez");
}
        
    }
    
    public void mediaPratico(){
        int notaP = 0;
            System.out.println("Nota P es..");
            notaP = sc.nextInt();
        while (notaP<0)
            System.out.println("Nota P es..");
            notaP = sc.nextInt();

        mediaP=(int) (notaP* 0.4);
        System.out.println(mediaP + "Es la media del practico");
        switch(mediaP) {
            case 1:
                Puntos++;
                
                System.out.println(Puntos);
            break;
            case 2:
                Puntos++;Puntos++;
                
                System.out.println(Puntos);
            break;
            case 3:
                Puntos++;Puntos++;Puntos++;
                
                System.out.println(Puntos);
            break;
            case 4:
                Puntos++;Puntos++;Puntos++;Puntos++;
                
                System.out.println(Puntos);
            break;
        default:
            System.out.println(Puntos);
            System.out.println("Mas suerte la proxima vez");
}
    }
     public void mediaBoletin(){
         int Boletins;
         do{
            System.out.println("Cuantos Boletines tienes..");
            Boletins = sc.nextInt();
            
        }while(Boletins<0 && Boletins>15);
         
         switch(Boletins) {
            case 12: case 13: case 14: case 15:
                Puntos++;Puntos++;
                
                System.out.println(Puntos);
            break;
            case 11: case 10: case 9: case 8:
                Puntos++;

                System.out.println(Puntos);
            break;
            case 7: case 6: case 5: case 4: case 3: case 2: case 1: case 0:
                System.out.println("Mas suerte la proxima vez");
                System.out.println(Puntos);
            break;            
        default:
            System.out.println(Puntos);
            System.out.println("Mas suerte la proxima vez");
    }
  }
  
    public void Trimestre(){
        pruebaNome();
        while (pruebaNome()==false){
            pruebaNome();
        }
        mediaTeorico();
        mediaPratico();
        mediaBoletin();
        System.out.println(Puntos);
    }
    
}
