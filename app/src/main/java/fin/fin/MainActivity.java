package fin.fin;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View containerView = findViewById(R.id.main_activity_layout);

        if (savedInstanceState == null) {
            Fragment newFragment = new FragmentConnect();
            android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(containerView.getId(), newFragment).commit();
        }
    }
}
