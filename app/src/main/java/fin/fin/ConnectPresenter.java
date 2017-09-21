package fin.fin;

import android.content.Context;
import android.support.annotation.NonNull;

public class ConnectPresenter implements BasePresenter<ConnectFragment> {

    private ConnectFragment fragment;
    private Context context;

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
        fragment = null;
    }

}
