package com.android.tranalhomiller.recyclerviewtrabalho.activity.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.tranalhomiller.recyclerviewtrabalho.R;
import com.android.tranalhomiller.recyclerviewtrabalho.activity.model.Nomes;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Nomes> listName;

    public Adapter(List<Nomes>list) {
        this.listName = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View intemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista,parent, false);

        return new MyViewHolder(intemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Nomes nomes = listName.get(position);

        holder.nome.setText(nomes.getNome());
        holder.cpf.setText(nomes.getCpf());
        holder.ano.setText(nomes.getAno());
    }

    @Override
    public int getItemCount() {
        return listName.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView nome;
        TextView ano;
        TextView cpf;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.textTitulo);
            ano = itemView.findViewById(R.id.textAno);
            cpf = itemView.findViewById(R.id.textGenero);
        }
    }

}
