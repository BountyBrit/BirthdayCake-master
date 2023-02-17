package cs301.birthdaycake;

import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener {

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

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        cakeModel.x = motionEvent.getX();
        cakeModel.y = motionEvent.getY();
        cakeView.invalidate();
        return true;
    }


}
