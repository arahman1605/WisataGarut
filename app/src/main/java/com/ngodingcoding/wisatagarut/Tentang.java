package com.ngodingcoding.wisatagarut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ngodingcoding.cardviewandrecyclerview.R;

public class Tentang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        setTitle("Tentang Aplikasi\n");

        TextView judul = (TextView) findViewById(R.id.judul);
        TextView nama = (TextView) findViewById(R.id.nama);
        TextView mk = (TextView) findViewById(R.id.mk);


        Button ok = (Button) findViewById(R.id.oke);
        String namas = "\noleh :\n - Abdul Rahman Saputra (1206003)\n - Saeful Rijal (1306126)";
        String ds = "\nAldy Ri";
        judul.setText(judul.getText().toString());
        nama.setText(namas);


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tentang.this.finish();
            }
        });
    }
}
