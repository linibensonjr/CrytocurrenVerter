package com.bdevelop.lini.crytocurrenverter;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class ETHcurrency extends Fragment implements View.OnClickListener {


    public ETHcurrency() {
        // Required empty public constructor
    }

    View view;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_ethcurrency, container, false);

        //Binding the various button to their ids
        Button go1 = view.findViewById(R.id.b1);
        go1.setOnClickListener(this);
        Button go2 = view.findViewById(R.id.b2);
        go2.setOnClickListener(this);
        Button go3 = view.findViewById(R.id.b3);
        go3.setOnClickListener(this);
        Button go4 = view.findViewById(R.id.b4);
        go4.setOnClickListener(this);
        Button go5 = view.findViewById(R.id.b5);
        go5.setOnClickListener(this);
        Button go6 = view.findViewById(R.id.b6);
        go6.setOnClickListener(this);
        Button go7 = view.findViewById(R.id.b7);
        go7.setOnClickListener(this);
        Button go8 = view.findViewById(R.id.b8);
        go8.setOnClickListener(this);
        Button go9 = view.findViewById(R.id.b9);
        go9.setOnClickListener(this);
        Button go10 = view.findViewById(R.id.b10);
        go10.setOnClickListener(this);
        Button go11 = view.findViewById(R.id.b11);
        go11.setOnClickListener(this);
        Button go12 = view.findViewById(R.id.b12);
        go12.setOnClickListener(this);
        Button go13 = view.findViewById(R.id.b13);
        go13.setOnClickListener(this);
        Button go14 = view.findViewById(R.id.b14);
        go14.setOnClickListener(this);
        Button go15 = view.findViewById(R.id.b15);
        go15.setOnClickListener(this);
        Button go16 = view.findViewById(R.id.b16);
        go16.setOnClickListener(this);
        Button go17 = view.findViewById(R.id.b17);
        go17.setOnClickListener(this);
        Button go18 = view.findViewById(R.id.b18);
        go18.setOnClickListener(this);
        Button go19 = view.findViewById(R.id.b19);
        go19.setOnClickListener(this);
        Button go20 = view.findViewById(R.id.b20);
        go20.setOnClickListener(this);
        return view;

    }

    //Handling button clicks
    @Override
    public void onClick(View v) {
        //do what you want to do when button is clicked
        switch (v.getId()) {
            case R.id.b1:
                Intent us = new Intent(getActivity(),com.bdevelop.lini.crytocurrenverter.eth.USDollar.class);
                startActivity(us);
                break;
            case R.id.b2:
                Intent ng = new Intent(getActivity(),com.bdevelop.lini.crytocurrenverter.eth.Naira.class);
                startActivity(ng);
                break;

            case R.id.b3:
                Intent yen = new Intent(getActivity(),com.bdevelop.lini.crytocurrenverter.eth.Yen.class);
                startActivity(yen);
                break;

            case R.id.b4:
                Intent gbp = new Intent(getActivity(),com.bdevelop.lini.crytocurrenverter.eth.Pound.class);
                startActivity(gbp);
                break;

            case R.id.b5:
                Intent eu = new Intent(getActivity(),com.bdevelop.lini.crytocurrenverter.eth.Euro.class);
                startActivity(eu);
                break;

            case R.id.b6:
                Intent ghc = new Intent(getActivity(),com.bdevelop.lini.crytocurrenverter.eth.Cedee.class);
                startActivity(ghc);
                break;

            case R.id.b7:
                Intent sar = new Intent(getActivity(),com.bdevelop.lini.crytocurrenverter.eth.Rand.class);
                startActivity(sar);
                break;

            case R.id.b8:
                Intent cad = new Intent(getActivity(),com.bdevelop.lini.crytocurrenverter.eth.CanDollar.class);
                startActivity(cad);
                break;

            case R.id.b9:
                Intent rup = new Intent(getActivity(),com.bdevelop.lini.crytocurrenverter.eth.Rupee.class);
                startActivity(rup);
                break;

            case R.id.b10:
                Intent rus = new Intent(getActivity(),com.bdevelop.lini.crytocurrenverter.eth.Rushruble.class);
                startActivity(rus);
                break;

            case R.id.b11:
                Intent col = new Intent(getActivity(),com.bdevelop.lini.crytocurrenverter.eth.C_Peso.class);
                startActivity(col);
                break;

            case R.id.b12:
                Intent nzd = new Intent(getActivity(),com.bdevelop.lini.crytocurrenverter.eth.NewZDollar.class);
                startActivity(nzd);
                break;

            case R.id.b13:
                Intent swf = new Intent(getActivity(),com.bdevelop.lini.crytocurrenverter.eth.SFranc.class);
                startActivity(swf);
                break;

            case R.id.b14:
                Intent hkd = new Intent(getActivity(),com.bdevelop.lini.crytocurrenverter.eth.HKDollar.class);
                startActivity(hkd);
                break;

            case R.id.b15:
                Intent mex = new Intent(getActivity(),com.bdevelop.lini.crytocurrenverter.eth.MexPeso.class);
                startActivity(mex);
                break;

            case R.id.b16:
                Intent real = new Intent(getActivity(),com.bdevelop.lini.crytocurrenverter.eth.BraReal.class);
                startActivity(real);
                break;

            case R.id.b17:
                Intent chr = new Intent(getActivity(),com.bdevelop.lini.crytocurrenverter.eth.Chinese_R.class);
                startActivity(chr);
                break;

            case R.id.b18:
                Intent skwon = new Intent(getActivity(),com.bdevelop.lini.crytocurrenverter.eth.SKWon.class);
                startActivity(skwon);
                break;

            case R.id.b19:
                Intent sin = new Intent(getActivity(),com.bdevelop.lini.crytocurrenverter.eth.SingDollar.class);
                startActivity(sin);
                break;

            case R.id.b20:
                Intent nor = new Intent(getActivity(),com.bdevelop.lini.crytocurrenverter.eth.NorKrone.class);
                startActivity(nor);
                break;
            default:
        }
        return;
    }
}
