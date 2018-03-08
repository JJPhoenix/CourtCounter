package com.jjmarcos.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score_a = 0;
    int score_b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Ingreso a los botones mediante metodos publicos
     * Funcionalidad a botones del team A
     */
    public void free_point_A(View view){
        score_a = score_a +1;
        mostrar_score_A(score_a);
    }

    public void two_point_A(View view){
        score_a = score_a +2;
        mostrar_score_A(score_a);
    }

    public void three_point_A(View view){
        score_a = score_a +3;
        mostrar_score_A(score_a);
    }

    /**
     * Ingreso a los botones mediante metodos publicos
     * Funcionalidad a botones del team B
     */
    public void free_point_B(View view){
        score_b = score_b +1;
        mostrar_score_B(score_b);
    }

    public void two_point_B(View view){ 
        score_b = score_b +2;
        mostrar_score_B(score_b);
    }

    public void three_point_B(View view){
        score_b = score_b +3;
        mostrar_score_B(score_b);
    }

    /**
     * Reiniciar el marcador
     */

    public void reset_game(View view){
        score_b = 0;
        score_a = 0;
        mostrar_score_A(score_a);
        mostrar_score_B(score_b);
    }

    /**
     * Operaciones de los botenes metodos privados
     */
    private void mostrar_score_A(int score){
        TextView scoreView = (TextView) findViewById(R.id.score_a);
        scoreView.setText(String.valueOf(score));
    }

    private void mostrar_score_B(int score){
        TextView scoreView = (TextView) findViewById(R.id.score_b);
        scoreView.setText(String.valueOf(score));
    }
}
