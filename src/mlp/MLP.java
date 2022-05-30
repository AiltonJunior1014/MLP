/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mlp;

import java.io.IOException;

/**
 *
 * @author Ailton Junior
 */
public class MLP {

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        net n = new net(6, 5, 0.000001, 1, 0.2);

        n.readArq("C:\\IA\\base_treinamento.csv");
        for(int i=0; i<2000; i++){
            System.out.println("Epoca: " + i);
            n.trainning();
            if(n.getError()<0){
                i = 2001;
            }
            //System.out.println("\n\n\n");
        }
        
            System.out.println("CAbo\n\n\n");
            System.out.println("teste");
            n.test("C:\\IA\\base_teste.csv");

    }
    
}
