package es.usj.task104;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import es.usj.libcalculos.Calculos;

public class MainActivity extends AppCompatActivity {

    private EditText etValor1, etValor2;
    private TextView tvResultado;
    private RadioButton rbSumar, rbRestar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValor1=(EditText)findViewById(R.id.etValor1);
        etValor2=(EditText)findViewById(R.id.etValor2);
        tvResultado=(TextView)findViewById(R.id.tvResultado);
        rbSumar=(RadioButton)findViewById(R.id.rbSumar);
        rbRestar=(RadioButton)findViewById(R.id.rbRestar);
    }

    public void operar(View view) {

        String valor1 = etValor1.getText().toString();
        String valor2 = etValor2.getText().toString();

        if (rbSumar.isChecked()) {

            tvResultado.setText(Calculos.Sumar(new String[]{valor1, valor2}));
        }
        else
        if (rbRestar.isChecked()) {

            tvResultado.setText(Calculos.Restar(new String []{valor1, valor2}));
        }

    }

}
