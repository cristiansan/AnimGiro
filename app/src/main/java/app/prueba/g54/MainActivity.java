package app.prueba.g54;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //más animaciones como: final Animation animShake = AnimationUtils.loadAnimation(this, R.anim.shake);
        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);

        //llamando los botones
        ImageButton btnSmile = (ImageButton) findViewById(R.id.button_smile);
        ImageButton btnRegular = (ImageButton) findViewById(R.id.button_regular);
        ImageButton btnNegative = (ImageButton) findViewById(R.id.button_negative);

        //onclick
        btnSmile.setOnClickListener(new ImageButton.OnClickListener()
        {
            @Override
            public void onClick(View arg0) {
                arg0.startAnimation(animAlpha);
                displaypregunta (getString(R.string.pregunta_segunda));
                }
        });

        btnRegular.setOnClickListener(new ImageButton.OnClickListener()
        {
            @Override
            public void onClick(View arg0) {
                arg0.startAnimation(animAlpha);
                displaypregunta3(getString(R.string.pregunta_tercera));
                }
        });

        btnNegative.setOnClickListener(new ImageButton.OnClickListener()
        {
            @Override
            public void onClick(View arg0) {
                arg0.startAnimation(animAlpha);
                displaypregunta1 (getString(R.string.pregunta_primera));
                }
        });

    }
    //mostrar respuestas
    private void displaypregunta(String pregunta) {
        TextView preguntaTextView = (TextView) findViewById(R.id.pregunta);
        preguntaTextView.setText(R.string.pregunta_segunda);
    }
    private void displaypregunta3(String pregunta) {
        TextView preguntaTextView = (TextView) findViewById(R.id.pregunta);
        preguntaTextView.setText(R.string.pregunta_tercera);
    }
    private void displaypregunta1(String pregunta) {
        TextView preguntaTextView = (TextView) findViewById(R.id.pregunta);
        preguntaTextView.setText(R.string.pregunta_primera);
    }
}