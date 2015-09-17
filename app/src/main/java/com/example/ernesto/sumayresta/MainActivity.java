package com.example.ernesto.sumayresta;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

        private View.OnClickListener OKlistener = new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                operacion();
            }
        };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOK = (Button)findViewById(R.id.btnOK);
        btnOK.setOnClickListener(OKlistener);
    }

    private void operacion(){
        EditText etNum = (EditText)findViewById(R.id.tvSuma);
        EditText etNum2 = (EditText)findViewById(R.id.tvSuma2);

        int n1 = Integer.parseInt(etNum.getText().toString());
        int n2 = Integer.parseInt(etNum2.getText().toString());

        int res = n1+n2;

        TextView resultado= (TextView)findViewById(R.id.resultado);
        resultado.setText("El resultado es: " + res);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
