package com.bdevelop.lini.crytocurrenverter;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.bdevelop.lini.crytocurrenverter.R.layout.btc_ngn;

/**
 * Created by Lini on 10/14/2017.
 */

public class calngn extends AppCompatActivity {
    public EditText editText1;
    public TextView resultsText;
    TextView currency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(btc_ngn);

// Obtains references to your components, assumes you have them defined
// within your Activity's layout file
        editText1 = (EditText)findViewById(R.id.btc);
        resultsText = (TextView)findViewById(R.id.tvx);
        currency = (TextView) findViewById(R.id.cu);

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
        currency.setText(R.string.nav_btc);
    }
    // The function called to calculate and display the result of the multiplication
        public void calculateResult() throws NumberFormatException {
            // Gets the two EditText controls' Editable values
            Editable editableValue1 = editText1.getText();

            // Initializes the double values and result
            double value1, result;

            // If the Editable values are not null, obtains their double values by parsing
            if (editableValue1 != null) {
                try {
                    value1 = Double.parseDouble(editableValue1.toString());

                    result = value1 * 2086365.15;

                    // Displays the calculated result
                    resultsText.setText(Double.toString(result) + " " + "Nigerian Naira");
                }
                //Handles error if editText field is empty
                catch (NumberFormatException e) {
                    resultsText.setText(" ");

                }
            }
        }
}
