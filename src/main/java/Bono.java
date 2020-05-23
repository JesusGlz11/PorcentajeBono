
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus
 */
public class Bono {
     public static void main (String args[]){
        
         Scanner sc = new Scanner (System.in);
         
        
      
          System.out.println("ingrese el bono total");
          double bono = sc.nextInt();
          System.out.println("ingrese la calificacion obtenida en jefe");
          double calificacionJefe  = sc.nextDouble();
          System.out.println("ingrese la calificacion obtenida en comision");
          double calificacionComision = sc.nextDouble();
          System.out.println("ingrese la calificacion obtenida en clima");
          double calificacionClima = sc.nextDouble();
          System.out.println("ingrese la calificacion obtenida en bitacora");
          double calificacionBitacora = sc.nextDouble();
          
          
          
         Double PorcentajeJefe=(calificacionJefe*40)/10;
        Double PorcentaComision=(calificacionComision*10)/10;
        Double PorcentaClima=(calificacionClima*10)/10;
        Double PorcentajeBitacora=(calificacionBitacora*40)/10;
              
        Double CalificaionPorcentaje=(PorcentajeJefe+PorcentaComision+PorcentaClima+PorcentajeBitacora);
        
        Double BonoPorcentajeJefe=(3000*PorcentajeJefe)/100;
        System.out.println(BonoPorcentajeJefe);
        Double BonoPorcentajeComusion=(3000*PorcentaComision)/100;
        Double BonoPorcentajeClima=(3000*PorcentaClima)/100;
        Double BonoPorcentajeBitacora=(3000*PorcentajeBitacora)/100;
        
        Double BonoFinal = BonoPorcentajeJefe + BonoPorcentajeComusion + BonoPorcentajeClima + BonoPorcentajeBitacora;
          
          
         
          
          System.out.println("Obtuvo de Calificacion = "+CalificaionPorcentaje+"%"+"\n Su Bono total es de $ "+BonoFinal);
    }
          
          
         
        
    }
    
    

