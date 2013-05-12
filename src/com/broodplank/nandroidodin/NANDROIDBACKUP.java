package com.broodplank.nandroidodin;


import java.io.IOException;
import java.util.concurrent.TimeoutException;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.widget.Toast;
import com.stericson.RootTools.CommandCapture;
import com.stericson.RootTools.RootTools;



public class NANDROIDBACKUP extends mainActivity {


	
		@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(null);
	        	        
	        
	        NANDROIDBACKUPNOW();

		}
		
		
	
public void NANDROIDBACKUPNOW() {
	
	
	final AlertDialog.Builder builder=new AlertDialog.Builder(this);
    builder.setTitle("Make Nandroid Backup");
    builder.setIcon(android.R.drawable.ic_dialog_alert);
    builder.setMessage("Press OK to make a nandroid backup, this process may take upto 2 minutes.");
   builder.setPositiveButton("OK", new OnClickListener() {


  	   @Override
  	   public void onClick(DialogInterface dialog, int which) {
  		   
  		   
  		 Toast.makeText(getApplicationContext(), 
  			     "Making Nandroid Backup to /sdcard/clockworkmod/backup", Toast.LENGTH_LONG).show();     
  		

  		
  		 CommandCapture command = new CommandCapture(0, "cd /system/bin", "busybox chmod 755 onandroid", "./onandroid -o"); {
  	 		try {
  	// 	
  	 			RootTools.getShell(true).add(command).waitForFinish();
//  	 		
  	//
  	 		} catch (InterruptedException e1) {
  	 			// TODO Auto-generated catch block
  	 			e1.printStackTrace();
  	 		} catch (IOException e1) {
  	 			// TODO Auto-generated catch block
  	 			e1.printStackTrace();
  	 		} catch (TimeoutException e1) {
  	 			// TODO Auto-generated catch block
  	 			e1.printStackTrace();
  	 		}
  	     }
  		 

  			Toast.makeText(getApplicationContext(), 
  				     "Making nandroid backup completed!", Toast.LENGTH_LONG).show();     
  	 
  		 


		 	    	
  		
  		    };
  			    	 
  			    	
  		
  		   });
   

   builder.setNegativeButton("Cancel", new OnClickListener() {

  	   @Override
  	   public void onClick(DialogInterface dialog, int which) {
  		   
  		 
  	    // TODO Auto-generated method stub

  	   }
  	  });

  builder.show();

	
}
	
	

   	 
 	 
}

    		 


