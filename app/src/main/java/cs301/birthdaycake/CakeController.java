package cs301.birthdaycake;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

    private CakeView cakeView;
    private CakeModel cakeModel;

    public CakeController(CakeView e) {
        cakeView = e;
        cakeModel = cakeView.getCakeModel();
    }
    public void onClick(View button){
        cakeModel.isLit = false;
        cakeView.invalidate();
        //Log.i("button", "blow out");
    }



    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        cakeModel.hasCandles = b;
        cakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        cakeModel.numCandles = i;
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }


}
