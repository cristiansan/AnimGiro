package app.prueba.g54;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //más animaciones como: final Animation animShake = AnimationUtils.loadAnimation(this, R.anim.shake);
        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);

        //llamando los botones
        FrameLayout btnSmile = (FrameLayout) findViewById(R.id.frame_left);
        FrameLayout btnRegular = (FrameLayout) findViewById(R.id.frame_midle);
        FrameLayout btnNegative = (FrameLayout) findViewById(R.id.frame_right);

        //onclick
        btnSmile.setOnClickListener(new FrameLayout.OnClickListener()
        {
            @Override
            public void onClick(View arg0) {
                arg0.startAnimation(animAlpha);
                displaypregunta3(getString(R.string.pregunta_tercera));
                displayrespuesta3(getString(R.string.pregunta_tercera));

                }
        });

        btnRegular.setOnClickListener(new FrameLayout.OnClickListener()
        {
            @Override
            public void onClick(View arg0) {
                arg0.startAnimation(animAlpha);
                displaypregunta2(getString(R.string.pregunta_primera));
                displayrespuesta2(getString(R.string.pregunta_tercera));
                }
        });

        btnNegative.setOnClickListener(new FrameLayout.OnClickListener()
        {
            @Override
            public void onClick(View arg0) {
                arg0.startAnimation(animAlpha);
                displaypregunta1(getString(R.string.pregunta_segunda));
                displayrespuesta1(getString(R.string.pregunta_tercera));
                }
        });

    }

    //mostrar respuestas
    private void displaypregunta2(String string) {
        TextView preguntaTextView = (TextView) findViewById(R.id.pregunta);
        preguntaTextView.setText(R.string.pregunta_tercera);
    }
    private void displaypregunta3(String pregunta) {
        TextView preguntaTextView = (TextView) findViewById(R.id.pregunta);
        preguntaTextView.setText(R.string.pregunta_primera);
    }
    private void displaypregunta1(String pregunta) {
        TextView preguntaTextView = (TextView) findViewById(R.id.pregunta);
        preguntaTextView.setText(R.string.pregunta_segunda);
    }

    private void displayrespuesta3(String string) {
        TextView respuestaTextView = (TextView) findViewById(R.id.resp_izquierda);
        respuestaTextView.setText(R.string.respuesta_buena);
        TextView respuesta2TextView = (TextView) findViewById(R.id.resp_central);
        respuesta2TextView.setText(R.string.respuesta_regular);
        TextView respuesta3TextView = (TextView) findViewById(R.id.resp_derecha);
        respuesta3TextView.setText(R.string.respuesta_buena);
    }

    private void displayrespuesta2(String string) {
        TextView respuestaTextView = (TextView) findViewById(R.id.resp_izquierda);
        respuestaTextView.setText(R.string.respuesta_si);
        TextView respuesta2TextView = (TextView) findViewById(R.id.resp_central);
        respuesta2TextView.setText(R.string.respuesta_mas_o_menos);
        TextView respuesta3TextView = (TextView) findViewById(R.id.resp_derecha);
        respuesta3TextView.setText(R.string.respuesta_no);
    }

    private void displayrespuesta1(String string) {
        TextView respuestaTextView = (TextView) findViewById(R.id.resp_izquierda);
        respuestaTextView.setText(R.string.respuesta_buena);
        TextView respuesta2TextView = (TextView) findViewById(R.id.resp_central);
        respuesta2TextView.setText(R.string.respuesta_regular);
        TextView respuesta3TextView = (TextView) findViewById(R.id.resp_derecha);
        respuesta3TextView.setText(R.string.respuesta_buena);
    }

}