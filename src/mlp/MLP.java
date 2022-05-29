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
        net n = new net(0.0,0,0,0,0,0);

        n.readArq("C:\\IA\\base_teste.csv");
        n.exibe();

    }
    
}
