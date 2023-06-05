
package K_Means;

import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;
import java.util.Arrays;

public final class K_Means {
    
    //atributos
    
    public int k,x,y,clases,items,limite,anchoPlano,altoPlano,pertenece;
    
    public Random r;
    
    public ArrayList<Item>  itemsArray; 
        
    public K_Means(int k, int clases , int items , int x, int y , int anchoPlano, int altoPlano){
    
        this.k = k;
        this.x = x;
        this.y = y;
        this.clases = clases;
        this.items = items;
        this.anchoPlano = anchoPlano;
        this.altoPlano = altoPlano;
        
        this.r = new Random();
        this.itemsArray = new ArrayList();
        this.limite=20;
        
        generaClases();
        imprimeClases();
    }
    
    public void generaClases(){
    
        if(this.clases >= 0 && this.clases <= this.limite ){
        
            for(int i=0; i<this.clases; i++){
                
                int base1 = r.nextInt(anchoPlano-70) + 70;
                int base2 = r.nextInt(altoPlano-70) + 70;
                
                for(int j=0; j<this.items; j++){
                    
                    int a = r.nextInt(70);
                    int b = r.nextInt(70);
                    
                    
                    Item nuevo = new Item(""+i,base1 - a,base2 - b);
                    itemsArray.add(nuevo);
                }
            
            }
        
        }else{
        
            System.out.println("No es posible generar tantas clases");
        
        }
        
    }
    
    public void calculaCercano(){
            
        double aux;
        
        for(int i=0; i< itemsArray.size();i++){
        
            aux = Math.sqrt( Math.pow( (itemsArray.get(i).x - this.x),2) +  Math.pow( (itemsArray.get(i).y - this.y),2) );
            itemsArray.get(i).distancia = aux;
            
        }
        for(int i=0; i< itemsArray.size();i++){
        
            System.out.println("Original: " + itemsArray.get(i).tipo);
            
        }
        //ordenar de mayor a menor las distancias 
        for(int i=0; i< itemsArray.size()-1;i++){
        
            for(int l=0; l< itemsArray.size()-1;l++){
        
                if(itemsArray.get(l).distancia>itemsArray.get(l+1).distancia){
                    Item aux2 = itemsArray.get(l+1);
                    itemsArray.remove(l+1);
                    itemsArray.add(l,aux2);
                }
            }

        }
        
        for(int i=0; i< itemsArray.size();i++){
        
            System.out.println("Ordenado: " + itemsArray.get(i).tipo);
            
        }
        
        int[] repetidos = new int[this.clases]; 
        
        for (int j =0; j<this.clases;j++){
        
            repetidos[j] = 0;
        
        }
        //   [ 0,   0,   0 ]
        
        for (int j =0; j<this.k;j++){
        
            repetidos[ Integer.parseInt(itemsArray.get(j).tipo) ] ++;
        
        }
        int maxNum = repetidos[0];
        
        for (int j : repetidos) {
            if (j > maxNum)
                maxNum = j;
        }
        
        for (int j : repetidos) {
        
            System.out.println("repetidos: " + j);
            
        }
        
        System.out.println("Max Num: " + maxNum);
        
        int indice=0;
        
        for (int j : repetidos) {
            
            if( j  == maxNum){
                break;
            }
            indice++;
            
        }
        
        System.out.println("\nLa clase " + indice + " es a la que pertenece" );
        this.pertenece = indice;
    }
    
    public void imprimeClases(){
        
        for(int i=0; i< itemsArray.size();i++){
    
            System.out.println(""+i + ": " + itemsArray.get(i).x + ","+ itemsArray.get(i).y);
        
        }
    
    }
    
}
