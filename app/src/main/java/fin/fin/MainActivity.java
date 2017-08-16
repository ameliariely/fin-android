package fin.fin;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View containerView = findViewById(R.id.main_activity_layout);

        if (savedInstanceState == null) {
            Fragment newFragment = new ConnectFragment();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.add(containerView.getId(), newFragment).commit();
        }
    }
}
