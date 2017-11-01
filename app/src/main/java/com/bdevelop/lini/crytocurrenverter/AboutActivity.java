package com.bdevelop.lini.crytocurrenverter;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Lini on 10/27/2017.
 */

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        TextView contact = (TextView) findViewById(R.id.dev);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Mail = new Intent("android.intent.action.SEND");
                Mail.setType("text/Email");

                Mail.putExtra("android.intent.extra.EMAIL", new String[]{"linibensonjr@gmail.com"});
                startActivity(Mail);
            }

        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    //Menu Items
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.dis:
                AlertDialog.Builder Disclaim = new AlertDialog.Builder(this);
                Disclaim.setTitle("Disclaimer")
                        .setMessage(R.string.disclaimer)
                        .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        });
                Disclaim.show();
                return true;

            case R.id.share:
                Intent share = new Intent(android.content.Intent.ACTION_SEND);
                share.setType("text/plain");

                share.putExtra(android.content.Intent.EXTRA_SUBJECT, "Download the Converter App");

                String shareMessage = "Check out this Crypto Currency Converter";
                share.putExtra(android.content.Intent.EXTRA_TEXT, shareMessage);
                startActivity(Intent.createChooser(share, "Share Using"));

            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
