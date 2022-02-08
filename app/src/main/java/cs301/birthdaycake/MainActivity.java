package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    CakeView cakeView;
    CakeController cakeController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        cakeView = findViewById(R.id.cakeview);
        cakeController = new CakeController(cakeView);
        Button blowOut = findViewById(R.id.button);
        blowOut.setOnClickListener(cakeController);
        CompoundButton toggleCandles = findViewById(R.id.switch2);
        toggleCandles.setOnCheckedChangeListener(cakeController);
        SeekBar changeCandles = findViewById(R.id.seekBar);
        changeCandles.setOnSeekBarChangeListener(cakeController);
    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
    }

}
