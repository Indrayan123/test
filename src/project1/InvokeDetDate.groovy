package project1;
@GrabResolver(name='LocalRepo', root='http://127.0.0.1:8060/repository/Local')

@Grab(group='sni.jenkins.wso2',module='wso2-import-export-jar',version=1.1')

import project1.Sample;


public class InvokeDetDate {
   
   public  static String fetchDate()
   {
           
          
          
         String vardate= new Sample().GetDate();
         return vardate;
       
       }
 }
