package com.mojesudoku_v2;


import com.app.mojesudoku.dialog.MyMessage;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

	private MyMessage msgBox = new MyMessage();	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myscreen2);
        
        /* Wiersz 1 */
        EditText editText11 = (EditText) findViewById(R.id.EditText11);
        editText11.setBackgroundResource(R.drawable.edittextlg);
        editText11.setText("3");
        EditText editText12 = (EditText) findViewById(R.id.EditText12);
        editText12.setBackgroundResource(R.drawable.edittextlg);
        EditText editText13 = (EditText) findViewById(R.id.EditText13);
        editText13.setBackgroundResource(R.drawable.edittextlg);
        editText13.setText("6");

        EditText editText14 = (EditText) findViewById(R.id.EditText14);
        editText14.setBackgroundResource(R.drawable.edittextdg);
        editText14.setText("7");
        EditText editText15 = (EditText) findViewById(R.id.EditText15);
        editText15.setBackgroundResource(R.drawable.edittextdg);
        editText15.setText("1");
        EditText editText16 = (EditText) findViewById(R.id.EditText16);
        editText16.setBackgroundResource(R.drawable.edittextdg);

        EditText editText17 = (EditText) findViewById(R.id.EditText17);
        editText17.setBackgroundResource(R.drawable.edittextlg);
        editText17.setText("2");
        EditText editText18 = (EditText) findViewById(R.id.EditText18);
        editText18.setBackgroundResource(R.drawable.edittextlg);
        editText18.setText("8");
        EditText editText19 = (EditText) findViewById(R.id.EditText19);
        editText19.setBackgroundResource(R.drawable.edittextlg);
        editText19.setText("9");

        /* Wiersz 2 */
        EditText editText21 = (EditText) findViewById(R.id.EditText21);
        editText21.setBackgroundResource(R.drawable.edittextlg);
        EditText editText22 = (EditText) findViewById(R.id.EditText22);
        editText22.setBackgroundResource(R.drawable.edittextlg);
        EditText editText23 = (EditText) findViewById(R.id.EditText23);
        editText23.setBackgroundResource(R.drawable.edittextlg);

        EditText editText24 = (EditText) findViewById(R.id.EditText24);
        editText24.setBackgroundResource(R.drawable.edittextdg);
        EditText editText25 = (EditText) findViewById(R.id.EditText25);
        editText25.setBackgroundResource(R.drawable.edittextdg);
        EditText editText26 = (EditText) findViewById(R.id.EditText26);
        editText26.setBackgroundResource(R.drawable.edittextdg);

        EditText editText27 = (EditText) findViewById(R.id.EditText27);
        editText27.setBackgroundResource(R.drawable.edittextlg);
        EditText editText28 = (EditText) findViewById(R.id.EditText28);
        editText28.setBackgroundResource(R.drawable.edittextlg);
        EditText editText29 = (EditText) findViewById(R.id.EditText29);
        editText29.setBackgroundResource(R.drawable.edittextlg);
        
        /* Wiersz 3 */
        EditText editText31 = (EditText) findViewById(R.id.EditText31);
        editText31.setBackgroundResource(R.drawable.edittextlg);
        EditText editText32 = (EditText) findViewById(R.id.EditText32);
        editText32.setBackgroundResource(R.drawable.edittextlg);
        EditText editText33 = (EditText) findViewById(R.id.EditText33);
        editText33.setBackgroundResource(R.drawable.edittextlg);

        EditText editText34 = (EditText) findViewById(R.id.EditText34);
        editText34.setBackgroundResource(R.drawable.edittextdg);
        EditText editText35 = (EditText) findViewById(R.id.EditText35);
        editText35.setBackgroundResource(R.drawable.edittextdg);
        EditText editText36 = (EditText) findViewById(R.id.EditText36);
        editText36.setBackgroundResource(R.drawable.edittextdg);

        EditText editText37 = (EditText) findViewById(R.id.EditText37);
        editText37.setBackgroundResource(R.drawable.edittextlg);
        EditText editText38 = (EditText) findViewById(R.id.EditText38);
        editText38.setBackgroundResource(R.drawable.edittextlg);
        EditText editText39 = (EditText) findViewById(R.id.EditText39);
        editText39.setBackgroundResource(R.drawable.edittextlg);

        /* Wiersz 4 */
        EditText editText41 = (EditText) findViewById(R.id.EditText41);
        editText41.setBackgroundResource(R.drawable.edittextdg);
        EditText editText42 = (EditText) findViewById(R.id.EditText42);
        editText42.setBackgroundResource(R.drawable.edittextdg);
        EditText editText43 = (EditText) findViewById(R.id.EditText43);
        editText43.setBackgroundResource(R.drawable.edittextdg);

        EditText editText44 = (EditText) findViewById(R.id.EditText44);
        editText44.setBackgroundResource(R.drawable.edittextlg);
        EditText editText45 = (EditText) findViewById(R.id.EditText45);
        editText45.setBackgroundResource(R.drawable.edittextlg);
        EditText editText46 = (EditText) findViewById(R.id.EditText46);
        editText46.setBackgroundResource(R.drawable.edittextlg);

        EditText editText47 = (EditText) findViewById(R.id.EditText47);
        editText47.setBackgroundResource(R.drawable.edittextdg);
        EditText editText48 = (EditText) findViewById(R.id.EditText48);
        editText48.setBackgroundResource(R.drawable.edittextdg);
        EditText editText49 = (EditText) findViewById(R.id.EditText49);
        editText49.setBackgroundResource(R.drawable.edittextdg);
        
        
        Button buttonWyczysc = (Button)findViewById(R.id.button1);
        buttonWyczysc.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				msgBox.show("Moje Sudoku", "Wszystkie pola zosta³y wyczyszczone", v);
				
				//editText01 = (EditText) findViewById(R.id.EditTextxx);
				//editText01.setText("");
		        EditText editText11 = (EditText) findViewById(R.id.EditText11);
		        editText11.setText("");
		        EditText editText12 = (EditText) findViewById(R.id.EditText12);
		        editText12.setText("");
		        EditText editText13 = (EditText) findViewById(R.id.EditText13);
		        editText13.setText("");

		        EditText editText14 = (EditText) findViewById(R.id.EditText14);
		        editText14.setText("");
		        EditText editText15 = (EditText) findViewById(R.id.EditText15);
		        editText15.setText("");
		        EditText editText16 = (EditText) findViewById(R.id.EditText16);
		        editText16.setText("");

		        EditText editText17 = (EditText) findViewById(R.id.EditText17);
		        editText17.setText("");
		        EditText editText18 = (EditText) findViewById(R.id.EditText18);
		        editText18.setText("");
		        EditText editText19 = (EditText) findViewById(R.id.EditText19);
		        editText19.setText("");
			}
        });
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
