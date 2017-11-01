package com.bdevelop.lini.crytocurrenverter.eth;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.bdevelop.lini.crytocurrenverter.R;

import static com.bdevelop.lini.crytocurrenverter.R.layout.btc_ngn;

/**
 * Created by Lini on 10/23/2017.
 */

public class Naira extends Activity {

    TextView currency;

    public EditText editText1;
    public TextView resultsText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(btc_ngn);


        // Obtains references to your components, assumes you have them defined
        // within your Activity's layout file
        editText1 = findViewById(R.id.btc);
        resultsText = findViewById(R.id.tvx);
        currency = findViewById(R.id.cu);

        // Instantiates a TextWatcher, to observe EditText value changes
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



    // The function called to calculate and display the result of the multiplication
    public void calculateResult() throws NumberFormatException {
        // Gets the two EditText controls' Editable values
        Editable editableValue1 = editText1.getText();

        // Initializes the double values and result
        double amt,
               result;

       try {
           amt = Double.parseDouble(editableValue1.toString());

           // Calculates the result
           result = amt * 104805;
           // Displays the calculated result
           resultsText.setText(Double.toString(result) + " " +  "Nigerian Naira");
       }

       //Handles error if editText field is empty
       catch (NumberFormatException e) {
            resultsText.setText(" ");
       }
    }

}
