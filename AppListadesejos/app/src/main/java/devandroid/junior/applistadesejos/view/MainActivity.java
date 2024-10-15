package devandroid.junior.applistadesejos.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import devandroid.junior.applistadesejos.R;
import devandroid.junior.applistadesejos.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outrapessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

    EditText editPrimeiroNome;
    EditText editsobrenomeAluno;
    EditText editNomedoCurso;
    EditText edittelefonecontato;

    Button btnlimpar;
    Button btnsalvar;
    Button btnfinalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        outrapessoa = new Pessoa();

        //atribuido valores ao Objeto pessoa.
        //conforme O Template(TEMPLATE ESTA EM Pessoa.java)

       // pessoa.setPrimeiroNome("Marco");
       // pessoa.setSobreNome("Ribeiro");
       // pessoa.setNomedoCurso("AndroidApp");
       // pessoa.setTelefonedeContato("1199254985");

        outrapessoa.setPrimeiroNome("Junior");
        outrapessoa.setSobreNome("Antonio");
        outrapessoa.setNomedoCurso("Andoid2024");
        outrapessoa.setTelefonedeContato("11-9989598");

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editsobrenomeAluno = findViewById(R.id.editsobrenomeAluno);
        editNomedoCurso = findViewById(R.id.editNomedoCurso);
        edittelefonecontato=findViewById(R.id.edittelefonecontato);

        btnlimpar = findViewById(R.id.btnlimpar);
        btnsalvar = findViewById(R.id.btnsalvar);
        btnfinalizar = findViewById(R.id.btnfinalizar);


        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editsobrenomeAluno.setText(pessoa.getSobreNome());
        editNomedoCurso.setText(pessoa.getNomedoCurso());
        edittelefonecontato.setText(pessoa.getTelefonedeContato());

        btnlimpar.setOnClickListener(new View.OnClickListener() {

            // criar uma estancia para usar a açaõ do button.

            @Override
            public void onClick(View view) {
                editPrimeiroNome.setText("");
                editsobrenomeAluno.setText("");
                editNomedoCurso.setText("");
                edittelefonecontato.setText("");

            }
        });

        btnfinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Volte Sempre",Toast.LENGTH_LONG).show(); // criaçao da mensagem final.
                finish();
            }
        });



        btnsalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSobreNome(editsobrenomeAluno.getText().toString());
                pessoa.setNomedoCurso(editNomedoCurso.getText().toString());
                pessoa.setTelefonedeContato(edittelefonecontato.getText().toString());
                Toast.makeText(MainActivity.this,"Salvo" +pessoa.toString(),Toast.LENGTH_LONG).show(); // criaçao da mensagem final.



            }
        });





/*      dadosPessoa = " \nPrimeiro nome:\n\n ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " \n\nSobrenome:\n\n ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa +=" \n\nNome do curso:\n\n ";
        dadosPessoa += pessoa.getNomedoCurso();
        dadosPessoa +=" \n\nTelefone Contato:\n\n ";
        dadosPessoa +=pessoa.getTelefonedeContato();


        dadosOutraPessoa = " \nPrimeiro nome:\n\n ";
        dadosOutraPessoa += outrapessoa.getPrimeiroNome();
        dadosOutraPessoa += " \n\nSobrenome:\n\n ";
        dadosOutraPessoa += outrapessoa.getSobreNome();
        dadosOutraPessoa +=" \n\nNome do curso:\n\n ";
        dadosOutraPessoa += outrapessoa.getNomedoCurso();
        dadosOutraPessoa +=" \n\nTelefone Contato:\n\n ";
        dadosOutraPessoa +=outrapessoa.getTelefonedeContato();*/

        Log.i("POOANDROID",pessoa.toString());
        Log.i("POOANDROID",outrapessoa.toString());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
