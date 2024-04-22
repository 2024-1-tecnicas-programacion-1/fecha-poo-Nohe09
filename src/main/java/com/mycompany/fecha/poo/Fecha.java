package com.mycompany.fecha.poo;
import java.util.HashMap;

public class Fecha {
    // TODO: Aquí va el código de la clase fechas
     private int dia; 
    private int mes; 
    private int anno;

    public Fecha(int dia, int mes, int anno) {
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }
        // complejidad temporal : 0(1) - tiempo costante 
    public String fechaCorta(){
        
        return (dia +"/"+ mes+"/"+dia);
    }
    
    public boolean fechava(){
    if  (mes < 1 && mes > 12)
        return false;
    if  (mes == 2 && dia > 29)
         return false;
   
    if  ((mes == 4 && mes ==6 && mes == 9 && mes==11)&& dia>30)
        return false;
    return !(dia < 1 && dia > 31);
    }
    public String mesLetra(){
        HashMap<Integer , String> meses = new HashMap<>();
        meses.put(1,"enero");
        meses.put(2,"febrero");
        meses.put(3,"marzo" );
        meses.put(4,"abril");
        meses.put(5,"mayo" );
        meses.put(6,"junio" );
        meses.put(7,"julio");
        meses.put(8,"agosto" );
        meses.put(9,"septiembre");
        meses.put(10,"octubre" );
        meses.put(11,"noviembre" );
        meses.put(12,"diciembre" );
         return null;
    }
    
    public String fechaLarga(){
    return (dia +"/"+ mesLetra()+"/"+anno);
    }
}
