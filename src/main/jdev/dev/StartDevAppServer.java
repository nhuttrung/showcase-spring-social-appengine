package dev;

import com.google.appengine.tools.development.DevAppServerMain;

public class StartDevAppServer {
  public static void main(String[] args) throws Exception {
    System.setProperty("datastore.default_high_rep_job_policy_unapplied_job_pct", "20");
//    System.setProperty("spring.config.location", "classpath:dev/");
    System.setProperty("spring.config.name", "application-dev");

    args = new String[] { 
//      "--jvm_flag=-Ddatastore.default_high_rep_job_policy_unapplied_job_pct=20",
      "--port=8080"
      , "--disable_update_check"
      , "-a", "127.0.0.1"
      , "." 
    };
    DevAppServerMain.main(args);
  }
}
