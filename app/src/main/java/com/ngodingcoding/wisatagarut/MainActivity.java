package com.ngodingcoding.wisatagarut;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.ngodingcoding.cardviewandrecyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public ImageView menu;
    private RecyclerView recyclerView;
    private AdapterWisata adapter;
    private List<Wisata> daftarWisata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        final ImageView dot = (ImageView) findViewById(R.id.dot);

        dot.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                // Create the instance of Menu
                PopupMenu popup = new PopupMenu(MainActivity.this, dot);
                // Inflating menu using xml file
                popup.getMenuInflater().inflate(R.menu.menu_u, popup.getMenu());

                // registering OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.action_tentang:
                                Intent tentang = new Intent(MainActivity.this, Tentang.class);
                                Toast.makeText(getApplicationContext(), "Memuat..", Toast.LENGTH_SHORT).show();
                                startActivity(tentang);
                                return true;
                            case R.id.action_keluar:
                                new AlertDialog.Builder(MainActivity.this)
                                        .setMessage("Anda yakin ingin Keluar?")
                                        .setCancelable(false)
                                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int id) {
                                                MainActivity.this.finish();
                                            }
                                        })
                                        .setNegativeButton("Tidak", null)
                                        .show();
                                return true;
                            default:
                        }
                        return false;
                    }
                });
                popup.show();
            }
        });
        initCollapsingToolbar();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        daftarWisata = new ArrayList<>();
        adapter = new AdapterWisata(this, daftarWisata);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareDaftar();

        try {
            Glide.with(this).load(R.drawable.cover).into((ImageView) findViewById(R.id.backdrop));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Initializing collapsing toolbar
     * Will show and hide the toolbar title on scroll
     */
    private void initCollapsingToolbar() {


        final CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(" ");
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        appBarLayout.setExpanded(true);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbar.setTitle(getString(R.string.app_name));
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbar.setTitle(" ");
                    isShow = false;
                }
            }
        });
    }

    /**
     * Adding few albums for testing
     */
    private void prepareDaftar() {
        int[] covers = new int[]{
                R.drawable.wisata1,
                R.drawable.wisata2,
                R.drawable.wisata3,
                R.drawable.wisata4,
                R.drawable.wisata5,
                R.drawable.wisata6,
                R.drawable.wisata7,
                R.drawable.wisata8,
                R.drawable.wisata9,
                R.drawable.wisata10};

        Wisata a = new Wisata("Situ Bagendit", "Banyuresmi", covers[0]);
        daftarWisata.add(a);

        a = new Wisata("Kampung Sampireun", "Samarang", covers[1]);
        daftarWisata.add(a);

        a = new Wisata("Kawah Talaga Bodas", "Wanaraja", covers[2]);
        daftarWisata.add(a);

        a = new Wisata("Taman Bunga - Kebun Mawar", "Samarang",covers[3]);
        daftarWisata.add(a);

        a = new Wisata("Candi Cangkuang - Situ Cangkuang - Kampung Pulo", "Leles", covers[4]);
        daftarWisata.add(a);

        a = new Wisata("Curug (Air Terjun) Sang Hyang Taraje", "Pakenjeng", covers[5]);
        daftarWisata.add(a);

        a = new Wisata("Komplek Wisata dan Hotel Cipanas (Wisata air panas)", "Cipanas", covers[6]);
        daftarWisata.add(a);

        a = new Wisata("Curug Orok", "Cikajang", covers[7]);
        daftarWisata.add(a);

        a = new Wisata("Pantai Puncak Guha", "Bungbulang", covers[8]);
        daftarWisata.add(a);

        a = new Wisata("Pantai Santolo", "Cikelet",covers[9]);
        daftarWisata.add(a);

        adapter.notifyDataSetChanged();
    }

    /**
     * RecyclerView item decoration - give equal margin around grid item
     */
    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }
    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Anda yakin ingin Keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("Tidak", null)
                .show();
    }

}