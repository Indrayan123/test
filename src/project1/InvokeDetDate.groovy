package project1;
@GrabResolver(name='internal', root='http://127.0.0.1:8060/repository/internal')

@Grab('org.jenkins.wso2:import-export-jar:1.0')

import project1.Sample;


public class InvokeDetDate {
   
   public  static String fetchDate()
   {
           
          
          
         String vardate= new Sample().GetDate();
         return vardate;
       
       }
 }
