package sni;
@Library('JenkinsWso2Migrator')
import sni.jenkins.wso2.api.APIMigrationUtil;
import sni.jenkins.wso2.app.MigrateApplication;

public class ImportAndExportWrapper {
   
   public  static HashMap<String, String> ExecuteAPIExport(String Env, String Base64Authorization, String hostNport, String ExportToolJarName, String ExportfileLocation, String ControlFilePath)
   {
           
          
          
          HashMap<String, String> exportAPI= new APIMigrationUtil().ExportAPI(Env, Base64Authorization, hostNport, ExportToolJarName, ExportfileLocation, ControlFilePath);
         return exportAPI;
       
       }
   
   public  static HashMap<String, String> ReplaceEndptAlias(String UnzippedFilepath, String ControlFilePath, String env, String LookupFilePath)
   {
           
                 
          HashMap<String, String> endptURL= new APIMigrationUtil().ReplaceAliasWithUrl(UnzippedFilepath, ControlFilePath, env, LookupFilePath);
        return endptURL;
       
       }
   
   public  static HashMap<String, String> ExecuteAPIImport(String Env, String Base64Authorization, String hostNport, String ImportToolJarName, String ImportfileLocation, String ControlFilePath, String TagdiffFile, String EntityFile)
   {
           
                 
          HashMap<String, String> importAPI= new APIMigrationUtil().ImportFilteredAPIs(Env, Base64Authorization, hostNport, ImportToolJarName, ImportfileLocation, ControlFilePath, TagdiffFile, EntityFile);
        return importAPI;
       
       }
   	public  static void ExecuteAPPMigration(String ControlFilePath,String SourceDBURL,String SourceDBUser,String SourceDBUserPass,String TargetDBURL,String TargetDBUser,String TargetDBUserPass,String EnvRepoLoc)
   {
           
                 
          new MigrateApplication().migrateApp( ControlFilePath, SourceDBURL, SourceDBUser, SourceDBUserPass, TargetDBURL, TargetDBUser, TargetDBUserPass, EnvRepoLoc);
        
       
       }
   
}
