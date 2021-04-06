/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package case_conversion;
import java.io.*;
/**
 *
 * @author DELL
 */
public class Case_Conversion {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int t=Integer.parseInt(br.readLine());
         String c1="", h="_",s2="";
         char c;
         for(int i1=0;i1<t;i1++)
         {
             String s=br.readLine();
             int l=s.length();
             for(int i=0;i<l;i++ )
             {
                 c=s.charAt(i);
                 int d=(int) c;
                 
                  if(i!=0&&d>=65&&d<=91)
                 { c1=c1+c;
                 c1=c1.toLowerCase();
                 s2=s2+h+c1;
                 c1=" ";
                 }
                else if(d>=65&&d<=91)
                 {
                     c1=c1+c;
                     c1=c1.toLowerCase();
                 s2=s2+c1;
                 c1="";
                 }
                 else
                 s2=s2+c;
             }
             System.out.println(s2);
         }
        // TODO code application logic here
    }
    
}
