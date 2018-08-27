package com.example.android.cotizador_manillas;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class principal extends Activity {

    private EditText cantidad;
    private TextView res;
    private Spinner materiales;
    private Spinner dije;
    private Spinner tipo;
    private Spinner tipoMonedas;
    private Resources recursos;
    private String mat[];
    private String dje[];
    private String tpo[];
    private String tpoMon[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cantidad = findViewById(R.id.txtCantidad);
        res = findViewById(R.id.txtResultado);

        materiales = findViewById(R.id.cmbMateriales);
        dije = findViewById(R.id.cmbDijes);
        tipo = findViewById(R.id.cmbTipos);
        tipoMonedas = findViewById(R.id.cmbMonedas);

        recursos = this.getResources();

        mat = recursos.getStringArray(R.array.materiales);
        dje = recursos.getStringArray(R.array.dijes);
        tpo = recursos.getStringArray(R.array.tipos);
        tpoMon = recursos.getStringArray(R.array.monedas);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, mat);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, dje);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, tpo);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, tpoMon);

        materiales.setAdapter(adapter1);
        dije.setAdapter(adapter2);
        tipo.setAdapter(adapter3);
        tipoMonedas.setAdapter(adapter4);

    }

    public boolean validar(){
        int mt = materiales.getSelectedItemPosition();
        int dj = dije.getSelectedItemPosition();
        int tp = tipo.getSelectedItemPosition();
        int tpM = tipoMonedas.getSelectedItemPosition();

        if (cantidad.getText().toString().isEmpty()){
            cantidad.setError(recursos.getString(R.string.errCantidad));
            cantidad.requestFocus();
            return false;
        }
        if (mt == 0){
            Toast.makeText(this, recursos.getString(R.string.errMaterial),
                    Toast.LENGTH_SHORT).show();
            return false;
        }
        if (dj == 0){
            Toast.makeText(this, recursos.getString(R.string.errDije),
                    Toast.LENGTH_SHORT).show();
            return false;
        }
        if (tp == 0){
            Toast.makeText(this, recursos.getString(R.string.errTipo),
                    Toast.LENGTH_SHORT).show();
            return false;
        }
        if (tpM == 0){
            Toast.makeText(this, recursos.getString(R.string.errTipoMoneda),
                    Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
