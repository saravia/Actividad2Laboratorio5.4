package com.example.saravia.actividad2laboratorio54;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Derecha extends Fragment{
   View rootView;
   TextView txt;
   @Override
   public View onCreateView(LayoutInflater inflater,
      ViewGroup container, Bundle savedInstanceState) {

      /*return inflater.inflate(
      R.layout.fragment_two, container, false);*/

      rootView= inflater.inflate (R.layout.fragment_two, container, false);
      txt = (TextView) rootView.findViewById(R.id.txt);
      return rootView;
   }
   public void obtenerDatos(String mensaje){

      txt.setText(mensaje);
   }
}
