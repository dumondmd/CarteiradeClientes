package com.example.dumon.carteiradeclientes;

import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dumon.carteiradeclientes.dominio.entidades.Cliente;

import java.sql.ClientInfoStatus;
import java.util.List;

/**
 * Created by dumon on 19/03/18.
 */

public class ClienteAdapter extends RecyclerView.Adapter <ClienteAdapter.ViewHolderCliente>{

    private List<Cliente> dados;

    public ClienteAdapter(List<Cliente>dados){
        this.dados = dados;
    }

    @Override
    public ViewHolderCliente onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.linha_clientes, parent, false);

        ViewHolderCliente holderCliente = new ViewHolderCliente(view);
        return holderCliente;
    }

    @Override
    public void onBindViewHolder(ViewHolderCliente holder, int position) {
        if ((dados != null) && (dados.size() > 0)) {

            Cliente cliente = dados.get(position);

            holder.txtNome.setText(cliente.nome);
            holder.txtTelefone.setText(cliente.telefone);
        }
    }

    @Override
    public int getItemCount() {
        return dados.size();
    }

    public class ViewHolderCliente extends RecyclerView.ViewHolder{

        public TextView txtNome;
        public TextView txtTelefone;

        public ViewHolderCliente(View itemView) {
            super(itemView);

            txtNome = (TextView)itemView.findViewById(R.id.txtNome);
            txtTelefone = (TextView)itemView.findViewById(R.id.txtTelefone);
        }
    }
}
