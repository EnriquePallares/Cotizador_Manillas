package com.example.android.cotizador_manillas;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class principal extends Activity {

    private EditText cantidad;
    private TextView res;
    private Spinner cmbMateriales;
    private Spinner cmbDije;
    private Spinner cmbTipo;
    private Spinner cmbTipoMoneda;
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

        cmbMateriales = findViewById(R.id.cmbMateriales);
        cmbDije = findViewById(R.id.cmbDijes);
        cmbTipo = findViewById(R.id.cmbTipos);
        cmbTipoMoneda = findViewById(R.id.cmbMonedas);

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

        cmbMateriales.setAdapter(adapter1);
        cmbDije.setAdapter(adapter2);
        cmbTipo.setAdapter(adapter3);
        cmbTipoMoneda.setAdapter(adapter4);

    }

    public void calcular(View v){
        int cbMateriales, cbDijes, cbTipos, cbTipoMoneda, cant, resultado = 0;

        if (validar()){
            cant = Integer.parseInt(cantidad.getText().toString());
            cbMateriales = cmbMateriales.getSelectedItemPosition();
            cbDijes = cmbDije.getSelectedItemPosition();
            cbTipos = cmbTipo.getSelectedItemPosition();
            cbTipoMoneda = cmbTipoMoneda.getSelectedItemPosition();

            resultado = Metodos.totalCompra(cant, cbMateriales, cbDijes, cbTipos);

            switch (cbTipoMoneda){
                case 1: {
                    res.setText("$" + resultado);
                    break;
                }
                case 2: {
                    res.setText("$" + Metodos.cambiarMoneda(resultado));
                }
            }
        }
    }

    public boolean validar(){
        int mt = cmbMateriales.getSelectedItemPosition();
        int dj = cmbDije.getSelectedItemPosition();
        int tp = cmbTipo.getSelectedItemPosition();
        int tpM = cmbTipoMoneda.getSelectedItemPosition();

        if (cantidad.getText().toString().isEmpty()){
            cantidad.setError(recursos.getString(R.string.errCantidad));
            cantidad.requestFocus();
            return false;
        }
        if (Integer.parseInt(cantidad.getText().toString())==0){
            cantidad.setError(recursos.getString(R.string.errCero));
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

    public void limpiar(View v){
        cantidad.setText("");
        cantidad.requestFocus();
        res.setText("");
        cmbMateriales.setSelection(0);
        cmbDije.setSelection(0);
        cmbTipo.setSelection(0);
        cmbTipoMoneda.setSelection(0);
    }
}
