package fin.fin;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import javax.inject.Inject;

import dagger.android.DaggerFragment;

public class ConnectFragment extends DaggerFragment {

    Button button;

    @Inject
    public ConnectFragment(){
    }

    @Inject
    ConnectPresenter connectPresenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_connect, container, false);
        button = (Button) root.findViewById(R.id.connectButton);
        return root;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onResume() {
        super.onResume();
        initScreen();
    }

    private void initScreen() {
        connectPresenter.attach(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                connectPresenter.connect();
            }
        });
    }


    @Override
    public void onDestroyView() {
        connectPresenter.detach();
        super.onDestroyView();
    }

}
