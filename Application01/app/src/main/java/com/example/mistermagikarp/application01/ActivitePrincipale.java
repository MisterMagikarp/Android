package com.example.mistermagikarp.application01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ActivitePrincipale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("L'application vient d'être crée");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    protected void onStart(){
        super.onStart();
        System.out.println("L'application vient d'être lancée");
    }

    protected void onStop(){
        super.onStop();
        System.out.println("L'application vient d'être arrêtée");
    }

    protected void onRestart(){
        super.onRestart();
        System.out.println("L'application vient d'être redémarrée");
    }

    protected void onResume(){
        super.onResume();
        System.out.println("L'application vient d'être reprise");
    }

    protected void onPause(){
        super.onPause();
        System.out.println("L'application vient d'être mise en pause");
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

    protected void onSaveInstanceState(Bundle outState){
        System.out.println("Une instance de l'application vient d'être enregistrée");
    };

    protected void onRestoreInstanceState(Bundle savedInstanceState){
        System.out.println("Une instance de l'application vient d'être récupérée");
    };
}
