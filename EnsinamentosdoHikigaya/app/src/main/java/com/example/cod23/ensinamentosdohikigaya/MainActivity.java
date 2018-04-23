package com.example.cod23.ensinamentosdohikigaya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //Evento do botao
    Random ran = new Random();
    @Override
    public void onClick(View v) {

        int i = ran.nextInt(6);

        frase.setText(frases[i]);
    }


    private TextView frase;



    String[] frases = {
            "O passado faz você morrer de arrependimento e o futuro faz você se deprimir em ansiedade, então por eliminação o presente é provavelmente o momento mais feliz.",
            "Eu sempre acabo com expectativas, eu sempre acabo com um mal-entendido e antes de eu perceber, perco as esperanças.",
            "Problema: O Mundo nunca irá mudar. Você pode mudar a si próprio. Como ira se mudar? Resposta: Se tornando o Deus do Novo Mundo.",
            "Como um veterano nesse campo de batalha da vida, me acostumei a perder. É por isso que eu sempre odeio garotas gentis.",
            "A realidade é cruel, então tenho certeza que mentiras são um tipo de bondade. Por isso, eu digo que a própria bondade é uma mentira.",
            "Eu odeio garotas gentis. Uma simples troca de cumprimentos com elas fará com que você as tenha em mente; comece conversar por mensagens com ela, e isso fará o seu coração mole. Se elas telefonarem para você, é o seu fim. Deleite-se a ver o seu histórico do telefone e rir que nem um bobo. Porém, eu não serei feito de idiota novamente.",
            "E se você pudesse voltar de onde parou para alterar a sua escolha anterior, como em um jogo? Isso mudaria sua vida? A resposta é um não retumbante."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frase = (TextView) findViewById(R.id.txt_id);


        Button aprender = (Button) findViewById(R.id.bt_id);

        aprender.setOnClickListener(this);


        frase.setText(". . .");
    }
}
