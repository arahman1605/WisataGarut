package com.ngodingcoding.wisatagarut;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.ngodingcoding.cardviewandrecyclerview.R;

import java.util.List;

public class Deskripsi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);
        TextView judul = (TextView) findViewById(R.id.tx_judul);
        TextView deskripsi = (TextView) findViewById(R.id.tx_deskripsi);
        TextView fasilitas = (TextView) findViewById(R.id.tx_fasilitas);
        TextView harga = (TextView) findViewById(R.id.tx_hrg);
        TextView alamat = (TextView) findViewById(R.id.tx_alamat);
        TextView akses = (TextView) findViewById(R.id.tx_akses);

        Bundle extras = getIntent().getExtras();

        judul.setText(extras.getString("wisata"));
        deskripsi.append(extras.getString("deswisata")+"\n");
        fasilitas.append(extras.getString("faswisata")+"\n");
        harga.append(extras.getString("hrgwisata")+"\n");
        alamat.append(extras.getString("alwisata")+"\n");
        akses.append(extras.getString("akwisata"));
    }
}
