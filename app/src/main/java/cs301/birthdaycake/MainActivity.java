package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView viewById = findViewById(R.id.cakeview);
        CakeController CakeObj = new CakeController(viewById);

        Button BlowOutButton = findViewById(R.id.button);
        BlowOutButton.setOnClickListener(CakeObj);

        CompoundButton candleSwitch = findViewById(R.id.switch2);
        candleSwitch.setOnCheckedChangeListener(CakeObj);
    }

    public void goodbye(View button) {
        Log.i("button2", "Goodbye");
        finishAffinity();
    }
}
