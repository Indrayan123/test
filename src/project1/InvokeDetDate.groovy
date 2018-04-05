package project1;
@GrabResolver(name='LocalRepo', root='http://admin:welcome1@127.0.0.1:8060/repository/Local/')

@Grab('sni.jenkins.wso2:wso2-import-export-jar:1.1')

import project1.Sample;


public class InvokeDetDate {
   
   public  static String fetchDate()
   {
           
          
          
         String vardate= new Sample().GetDate();
         return vardate;
       
       }
 }
