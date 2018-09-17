package digitalhouse.com.projetofragmentestatico;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import static digitalhouse.com.projetofragmentestatico.R.layout.fragment_fragment2;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {

    private Button btnFrag2;

    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(fragment_fragment2, container, false );

        btnFrag2 = (Button) view.findViewById(R.id.btn_frag2);

        btnFrag2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getBaseContext(), "Você está no Fragment 2",Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }

}