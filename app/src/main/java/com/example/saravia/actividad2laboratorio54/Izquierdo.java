package com.example.saravia.actividad2laboratorio54;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Izquierdo extends Fragment {

  
   View rootView;
   Button boton;
   EditText campo;

   @Override

   public View onCreateView(LayoutInflater inflater,
      ViewGroup container, Bundle savedInstanceState) {

      rootView= inflater.inflate (R.layout.izquierdo, container, false);
      final enviarMensaje EM = null;
      campo = (EditText) rootView.findViewById(R.id.campotxt);
      boton= (Button) rootView.findViewById(R.id.boton);
      boton.setOnClickListener(new View.OnClickListener() {

         @Override
         public void onClick(View v) {
            String mensaje;
            mensaje = campo.getText().toString();
            EM.enviarDatos(mensaje);
         }
      });
      return rootView;
   }
    public void onAttach(Activity activity){
      super.onAttach(activity);
      try{
         enviarMensaje EM = (enviarMensaje) activity;
      } catch (ClassCastException e) {
         throw new ClassCastException ("Necesitas implementar mensaje");
      }
   }
}
