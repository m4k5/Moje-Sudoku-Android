package com.app.mojesudoku.dialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;

public class MyMessage {
	
	public MyMessage() {
		// TODO Auto-generated constructor stub
	}

		public void show(String title, String message, View v) {

	    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(v.getContext());
    	dlgAlert.setTitle(title);
    	dlgAlert.setMessage(message);
    	dlgAlert.setPositiveButton("OK", null);
    	dlgAlert.setCancelable(true);
    	dlgAlert.setPositiveButton("Ok",
    		    new DialogInterface.OnClickListener() {
    		        public void onClick(DialogInterface dialog, int which) {
    		          //dismiss the dialog 
    		        	dialog.dismiss();
    		        }
    		    });    	
    	dlgAlert.create().show();   
	}

}
