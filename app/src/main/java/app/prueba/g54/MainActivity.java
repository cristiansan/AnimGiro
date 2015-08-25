package app.prueba.g54;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String pregunta = "esta";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Método botón clickeado.
    public void submitText(View view) {
        displaypregunta(pregunta);

    }

    private void displaypregunta(String pregunta) {
        TextView preguntaTextView = (TextView) findViewById(R.id.pregunta);
        preguntaTextView.setText("aja");
    }

}