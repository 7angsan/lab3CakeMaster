package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    private CakeView viewCake;
    private CakeModel modelCake;

    public CakeController(CakeView ref) {
        viewCake = ref;
        modelCake = viewCake.getCakeModel();
    }

    public void onClick(View v) {
        //Log.d("Button", "It works man!");
        modelCake.changeLit();
        viewCake.invalidate();
    }

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        modelCake.toggleCandles();
        viewCake.invalidate();
    }

    public void onProgressChanged(SeekBar seekbar, int progress, boolean fromUser) {
        modelCake.setCandles(progress);
        viewCake.invalidate();
    }

    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
