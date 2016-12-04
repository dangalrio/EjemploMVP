package pruebas.dangalrio.com.pruevasvn;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.github.fafaldo.fabtoolbar.widget.FABToolbarLayout;

public class BotonFlotanteTransformacionActivity extends AppCompatActivity implements View.OnClickListener{

    private FABToolbarLayout fabToolbarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton_flotante_transformacion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_transformacion);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_transformacion);
        fabToolbarLayout = (FABToolbarLayout) findViewById(R.id.fabtoolbar);

        View uno,dos,tres,cuatro;

        uno = findViewById(R.id.uno);
        dos = findViewById(R.id.dos);
        tres = findViewById(R.id.tres);
        cuatro = findViewById(R.id.cuatro);

        fab.setOnClickListener(this);
        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tres.setOnClickListener(this);
        cuatro.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.fab_transformacion){
            fabToolbarLayout.show();
        }

        fabToolbarLayout.hide();
    }
}
