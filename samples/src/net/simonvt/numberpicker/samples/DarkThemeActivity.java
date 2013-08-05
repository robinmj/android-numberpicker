package net.simonvt.numberpicker.samples;

import net.simonvt.numberpicker.LogarithmicNumberPicker;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author Simon Vig Therkildsen <simonvt@gmail.com>
 */
public class DarkThemeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dark);

        LogarithmicNumberPicker np = (LogarithmicNumberPicker) findViewById(R.id.numberPicker);
        np.setNegativeNumbersAllowed(false);
        np.setSigFigs(2);
        np.setMaxDecimalPlaces(2);
        np.setMaxDigits(4);
        np.setFocusable(true);
        np.setFocusableInTouchMode(true);
    }
}
