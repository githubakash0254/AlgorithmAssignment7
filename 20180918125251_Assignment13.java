/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment13;
import java.util.Scanner;
/**
 *
 * @author 1794147
 */
public class Assignment13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int markCount;
        float average=0;
        float av2;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("How many marks for this student? ");
        markCount=keyboard.nextInt();
        
        int[] marks=new int[markCount];
        for(int i=0;i<markCount;i++)
        {
            System.out.print("Please enter mark"+ (i+1)+": ");
            marks[i]=keyboard.nextInt();
        }
        System.out.print("The marks are: ");
        for(int j=0;j<markCount;j++)
        {
            System.out.print( marks[j] );
            if(j<markCount-1){
                System.out.print(",");
            }
            
        }
        
        for(int k=0;k<markCount;k++)
        {
            average=average+marks[k];
        }
        System.out.println(" ");
        av2=average/markCount;
        System.out.println("The average is: "+ av2 + "%");
    }
    
}
