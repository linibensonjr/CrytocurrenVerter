package com.bdevelop.lini.crytocurrenverter.eth;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.bdevelop.lini.crytocurrenverter.R;
import com.bdevelop.lini.crytocurrenverter.calngn;

/**
 * Created by Lini on 10/23/2017.
 */

public class Chinese_R  extends Naira {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.btc_chinese);
        editText1 = (EditText)findViewById(R.id.btc);
        resultsText = (TextView)findViewById(R.id.tvx);
        currency = findViewById(R.id.cu);

        // Instantiates a TextWatcher, to observe your EditTexts' value changes
        // and trigger the result calculation
        TextWatcher textWatcher = new TextWatcher() {
            public void afterTextChanged(Editable s) {
                calculateResult();
            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after){}
            public void onTextChanged(CharSequence s, int start, int before, int count){}
        };

        // Adds the TextWatcher as TextChangedListener to both EditTexts
        editText1.addTextChangedListener(textWatcher);
        currency.setText(R.string.nav_eth);
    }

    public void calculateResult() throws NumberFormatException {
        // Gets the EditText control's Editable value
        Editable editableValue1 = editText1.getText();


        double amt,
                result;

        try {
            amt = Double.parseDouble(editableValue1.toString());
            // Calculates the result
            result = amt * 2035.76;

            // Displays the calculated result

            resultsText.setText(Double.toString(result) + " " + "Chinese Ren");
        }
        //Handles error if editText field is empty
        catch (NumberFormatException e) {
            resultsText.setText(" ");
        }
    }
}
