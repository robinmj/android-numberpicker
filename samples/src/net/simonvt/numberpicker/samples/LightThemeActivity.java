package net.simonvt.numberpicker.samples;

import net.simonvt.numberpicker.LogarithmicNumberPicker;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author Simon Vig Therkildsen <simonvt@gmail.com>
 */
public class LightThemeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_light);

        LogarithmicNumberPicker np = (LogarithmicNumberPicker) findViewById(R.id.numberPicker);
        np.setNumberConstraints(1,2,3,true);
        np.setFocusable(true);
        np.setFocusableInTouchMode(true);
    }
}
