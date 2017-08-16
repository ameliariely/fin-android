package fin.fin;

import android.app.Fragment;
import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.Button;

public class ConnectPresenter implements BasePresenter<ConnectFragment> {

    private Fragment fragment;
    private Context context;
    private Button button;

    public ConnectPresenter(Context context) {
        this.context = context;
    }

    public void connect() {

    }

    @Override
    public void attach(@NonNull ConnectFragment fragment) {
        this.fragment = fragment;
    }

    @Override
    public void detach() {
        button = null;
    }

}
