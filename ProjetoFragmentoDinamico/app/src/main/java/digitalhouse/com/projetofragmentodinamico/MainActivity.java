package digitalhouse.com.projetofragmentodinamico;

import android.support.v4.app.Fragment;
import  android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.button);

        fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction()
                .add(R.id.Frame1, new Frag1())
                .commit();

        fragmentManager.beginTransaction()
                .add(R.id.Frame2, new Frag2())
                .commit();

        fragmentManager.beginTransaction()
                .replace(R.id.Frame1, new Frag2())
                .addToBackStack(null)
                .commit();

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.Frame2);
                if(fragment != null)
                    fragmentManager.
                            beginTransaction().
                            remove(fragment).
                            commit();
                Toast.makeText(v.getContext(), "Você está no Fragmento 2",Toast.LENGTH_LONG).show();

            }
        });
    }
}
