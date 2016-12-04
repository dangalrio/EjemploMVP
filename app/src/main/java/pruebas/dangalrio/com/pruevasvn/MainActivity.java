package pruebas.dangalrio.com.pruevasvn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button boton_flotante_extendido,boton_float_animado,boton_float_transformacion,boton_float_menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton_flotante_extendido = (Button) findViewById(R.id.btn_float_extended);

        boton_flotante_extendido.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),FloatButtonExtendedActivity.class);
                startActivity(i);
            }
        });

        boton_float_animado = (Button) findViewById(R.id.btn_float_animado);
        boton_float_animado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),AnimacionBotonFlotanteActivity.class);
                startActivity(i);
            }
        });

        boton_float_transformacion = (Button) findViewById(R.id.btn_float_transformacion);
        boton_float_transformacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),BotonFlotanteTransformacionActivity.class);
                startActivity(i);
            }
        });

        boton_float_menu = (Button) findViewById(R.id.btn_float_menu);
        boton_float_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),BotonFlotanteMenuActivity.class);
                startActivity(i);
            }
        });
    }
}
