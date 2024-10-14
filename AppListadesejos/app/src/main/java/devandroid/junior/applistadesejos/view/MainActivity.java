package devandroid.junior.applistadesejos.view;

import android.os.Bundle;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        outrapessoa = new Pessoa();

        //atribuido valores ao Objeto pessoa.
        //conforme O Template(TEMPLATE ESTA EM Pessoa.java)

        pessoa.setPrimeiroNome("Marco");
        pessoa.setSobreNome("Ribeiro");
        pessoa.setNomedoCurso("AndroidApp");
        pessoa.setTelefonedeContato("1199254985");

        outrapessoa.setPrimeiroNome("Junior");
        outrapessoa.setSobreNome("Antonio");
        outrapessoa.setNomedoCurso("Andoid2024");
        outrapessoa.setTelefonedeContato("11-9989598");

        dadosPessoa = " \nPrimeiro nome:\n\n ";
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
        dadosOutraPessoa +=outrapessoa.getTelefonedeContato();

        int parada = 0;


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
