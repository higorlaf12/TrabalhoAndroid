package com.android.tranalhomiller.recyclerviewtrabalho.activity.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.tranalhomiller.recyclerviewtrabalho.R;
import com.android.tranalhomiller.recyclerviewtrabalho.activity.adapter.Adapter;
import com.android.tranalhomiller.recyclerviewtrabalho.activity.model.Nomes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Nomes>nomesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de nomes
        this.criarNomes();

        //Configurar adapter
        Adapter adapter = new Adapter(nomesList);

        //Configurar Recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

    }

    public void criarNomes(){
        Nomes nomes = new Nomes("Higor","376.310.506-94","1996");
        Nomes nomes1 = new Nomes("Murilo Yago Calebe Ribeiro","570.123.610-26","1996");
        Nomes nomes2 = new Nomes("Samuel César Sebastião Dias","338.678.681-23","1995");
        Nomes nomes3 = new Nomes("Vitor Geraldo Tiago Baptista","398.006.705-05","1996");
        Nomes nomes4 = new Nomes("Fernando Giovanni Ribeiro","432.338.526-90","2009");
        Nomes nomes5 = new Nomes("Manoel Benedito Thiago Silveira","640.407.359-51","2001");
        Nomes nomes6 = new Nomes("Anderson Vicente Nelson Pereira","089.030.487-41","2000");
        Nomes nomes7 = new Nomes("Tomás Marcos Manoel Cardoso","832.166.440-73","1997");
        Nomes nomes8 = new Nomes("Tomás Marcos Manoel Cardoso","832.166.440-73","1997");
        Nomes nomes9 = new Nomes("Tomás Marcos Manoel Cardoso","832.166.440-73","1997");
        Nomes nomes10 = new Nomes("Tomás Marcos Manoel Cardoso","832.166.440-73","1997");

        this.nomesList.addAll(Arrays.asList(nomes,nomes1,nomes2,nomes3,nomes4,nomes5,nomes6,nomes7,
                nomes8,nomes9,nomes10));
    }

}
