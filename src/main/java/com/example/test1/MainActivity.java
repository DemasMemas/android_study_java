package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("counter")) {
            counter = savedInstanceState.getInt("counter");
            TextView counterView = findViewById(R.id.txt_counter);
            counterView.setText(counter.toString());
            TextView bublicView = findViewById(R.id.bublic_text);
            char counterLastSymbol = counter.toString().charAt(counter.toString().length() - 1);
            if (counterLastSymbol == '1' & !counter.toString().equals("11")){
                bublicView.setText("БУБЛИК");
            }
            else if((counterLastSymbol == '2' | counterLastSymbol == '3' | counterLastSymbol == '4')
                    & !counter.toString().equals("12") & !counter.toString().equals("13") & !counter.toString().equals("14")){
                bublicView.setText("БУБЛИКА");
            }
            else{
                bublicView.setText("БУБЛИКОВ");
            }
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter", counter);
    }

    public void onClickBtnAddStudents(View view) {
        counter++;
        TextView counterView = findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
        TextView bublicView = findViewById(R.id.bublic_text);
        char counterLastSymbol = counter.toString().charAt(counter.toString().length() - 1);
        if (counterLastSymbol == '1' & !counter.toString().equals("11")){
            bublicView.setText("БУБЛИК");
        }
        else if((counterLastSymbol == '2' | counterLastSymbol == '3' | counterLastSymbol == '4')
                & !counter.toString().equals("12") & !counter.toString().equals("13") & !counter.toString().equals("14")){
            bublicView.setText("БУБЛИКА");
        }
        else{
            bublicView.setText("БУБЛИКОВ");
        }
    }
}