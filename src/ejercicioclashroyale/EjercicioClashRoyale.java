/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclashroyale;

/**
 *
 * @author rojo5
 */
public class EjercicioClashRoyale {

    public static boolean chequeaAtaque(int[][] piezas, int ataque) {
        int posX = 0, posY = 0, puntosDaño = 0;

        for (int i = 0; i < piezas.length; i++) {

            if (piezas[i][0] == 257) {
                posX = piezas[i][2];
                posY = piezas[i][3];
                puntosDaño = piezas[i][1];
            }
        }

        if (piezas[ataque][0] > 255) {
            return false;
        } else {

            if (piezas[ataque][6] == 1) {
                return false;
            } else {

                if (piezas[ataque][2] == posX && piezas[ataque][3] == posY) {

                    piezas[ataque][1] = piezas[ataque][1] - (4 * puntosDaño);
                    if (piezas[ataque][1] <= 0) {
                        return true;
                    }

                }else if(posY-1>=1 &&piezas[ataque][2] == posX && piezas[ataque][3] == posY-1){
                        
                    piezas[ataque][1] = piezas[ataque][1] - (2 * puntosDaño);
                    if (piezas[ataque][1] <= 0) {
                        return true;
                    }
                    
                }else if(posY+1<=14 &&piezas[ataque][2] == posX && piezas[ataque][3] == posY+1){
                        
                    piezas[ataque][1] = piezas[ataque][1] - (2 * puntosDaño);
                    if (piezas[ataque][1] <= 0) {
                        return true;
                    }
                    
                }else if(posX-1>=1 &&piezas[ataque][2] == posX-1 && piezas[ataque][3] == posY){
                        
                    piezas[ataque][1] = piezas[ataque][1] - (2 * puntosDaño);
                    if (piezas[ataque][1] <= 0) {
                        return true;
                    }
                    
                }else if(posX+1<=18 &&piezas[ataque][2] == posX+1 && piezas[ataque][3] == posY){
                        
                    piezas[ataque][1] = piezas[ataque][1] - (2 * puntosDaño);
                    if (piezas[ataque][1] <= 0) {
                        return true;
                    }
                    
                }else if(piezas[ataque][2] == posX-1 && piezas[ataque][3] == posY-1){
                        
                    piezas[ataque][1] = piezas[ataque][1] - puntosDaño;
                    if (piezas[ataque][1] <= 0) {
                        return true;
                    }
                    
                }else if(piezas[ataque][2] == posX+1 && piezas[ataque][3] == posY-1){
                        
                    piezas[ataque][1] = piezas[ataque][1] - puntosDaño;
                    if (piezas[ataque][1] <= 0) {
                        return true;
                    }
                    
                }else if(piezas[ataque][2] == posX-1 && piezas[ataque][3] == posY+1){
                        
                    piezas[ataque][1] = piezas[ataque][1] - puntosDaño;
                    if (piezas[ataque][1] <= 0) {
                        return true;
                    }
                    
                }else if(piezas[ataque][2] == posX+1 && piezas[ataque][3] == posY+1){
                        
                   piezas[ataque][1] = piezas[ataque][1] - puntosDaño;
                    if (piezas[ataque][1] <= 0) {
                        return true;
                    } 
                    
                }
                

            }
        }

        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] cartas = {{2, 211, 10, 4, 1, 1, 0},
        {67, 950, 10, 11, 1, 1, 1},
        {257, 100, 9, 4, 0, 0, 0}
        };

        System.out.println(chequeaAtaque(cartas, 0));
        System.out.println(cartas[0][1]);
    }
}
