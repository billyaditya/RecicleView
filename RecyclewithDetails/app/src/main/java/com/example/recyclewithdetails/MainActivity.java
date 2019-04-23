package com.example.recyclewithdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String title = "Mode List";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mImageDet = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        mImageUrls.add("https://e00-marca.uecdn.es/assets/multimedia/imagenes/2019/01/22/15481845087218.jpg");
        mNames.add("Lionel Messi");
        mDesc.add("Barcelona");
        mImageDet.add("Lionel Andrés \"Leo\" Messi (pengucapan bahasa Spanyol: [ljoˈnel anˈdɾes ˈmesi], lahir di Rosario, 24 Juni 1987; umur 31 tahun) adalah seorang pemain sepak bola Argentina yang saat ini bermain untuk FC Barcelona dan merupakan kapten tim nasional sepak bola Argentinadan FC Barcelona, bermain sebagai penyerang.");

        mImageUrls.add("https://sportshub.cbsistatic.com/i/r/2019/02/18/26859afd-b778-4b66-a05f-4935590e1b44/thumbnail/1200x675/3b5a25a26c39a916e83c4eadc2101971/ronaldo.jpg");
        mNames.add("Ronaldo");
        mDesc.add("Juventus");
        mImageDet.add("Cristiano Ronaldo dos Santos Aveiro, OIH (Portugis: [kɾiʃˈtjɐnu ʁoˈnaɫdu] lahir di Funchal, Madeira, Portugal, 5 Februari 1985; umur 34 tahun) atau lebih dikenal Cristiano Ronaldo merupakan seorang pemain sepak bola Portugal.");

        mImageUrls.add("https://cdn1-production-images-kly.akamaized.net/gHnuam4mZDdzT6cNKkfad__XedU=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2011358/original/052107500_1521466561-000_12P7QS.jpg");
        mNames.add("M. Salah");
        mDesc.add("Liverpool");
        mImageDet.add("Mohamed Salah Ghaly , lahir 15 Juni 1992) adalah pemain sepak bola profesional Mesir yang bermain sebagai penyerang untuk klub Inggris Liverpool dan timnas Mesir.");

        mImageUrls.add("http://bola.rakyatku.com/thumbs/img_660_442_kabar-tawa_1530600074orts.JPG");
        mNames.add("Neymar");
        mDesc.add("Paris Saint Germain");
        mImageDet.add("Neymar da Silva Santos Júnior  lahir 5 Februari 1992; umur 27 tahun) yang umumnya dikenal sebagai Neymar atau Neymar Jr, adalah pemain sepak bola profesional Brasil yang bermain untuk klub Prancis Paris Saint-Germain. Dia bermain sebagai penyerang atau pemain sayap.");

        mImageUrls.add("https://imagesvc.timeincapp.com/v3/mm/image?url=https%3A%2F%2Fcdn-s3.si.com%2Fs3fs-public%2Fstyles%2Fmarquee_large_2x%2Fpublic%2F2018%2F10%2F07%2Fkylian-mbappe-four-goals-video.jpg%3Fitok%3DDHsORxqa&w=1000&q=70");
        mNames.add("K.Mbappe");
        mDesc.add("Paris Saint Germain");
        mImageDet.add("lahir 20 Desember 1998) adalah seorang pemain sepak bola profesional Prancis yang bermain sebagai penyerang untuk Paris Saint-Germain dan tim nasional Prancis.\n" +
                "\n" +
                "Mbappé sudah menonjol pada usia dini, ia menjadi bintang bagi akademi remaja di AS Bondy, INF Clairefontaine, dan Monaco, klub terakhir ini membuat debutnya sebagai seorang pemain profesional untuk tim cadangan.");

        mImageUrls.add("https://images2.minutemediacdn.com/image/upload/c_fill,w_912,h_516,f_auto,q_auto,g_auto/shape/cover/sport/arsenal-fc-v-chelsea-fc-premier-league-5c444f3edeb6eeba6a000001.jpg");
        mNames.add("Eden Hazard");
        mDesc.add("Chelsea");
        mImageDet.add("Eden Hazard merupakan pemain sepakbola yang lahir di Belgia.");

        mImageUrls.add("https://img.maximummedia.ie/joe_co_uk/eyJkYXRhIjoie1widXJsXCI6XCJodHRwOlxcXC9cXFwvbWVkaWEtam9lY291ay5tYXhpbXVtbWVkaWEuaWUuczMuYW1hem9uYXdzLmNvbVxcXC93cC1jb250ZW50XFxcL3VwbG9hZHNcXFwvMjAxOFxcXC8wMVxcXC8xNzEzMjIxNVxcXC9HZXR0eUltYWdlcy04OTg3OTA3MTIuanBnXCIsXCJ3aWR0aFwiOjc2NyxcImhlaWdodFwiOjQzMSxcImRlZmF1bHRcIjpcImh0dHBzOlxcXC9cXFwvd3d3LmpvZS5jby51a1xcXC9hc3NldHNcXFwvaW1hZ2VzXFxcL2pvZWNvdWtcXFwvbm8taW1hZ2UucG5nP3Y9MjJcIixcIm9wdGlvbnNcIjpbXX0iLCJoYXNoIjoiYTI1YTNlYzczYmI2ZmI0MTE3MTY5MTdlYzdmOWExNThmZDJlZTlkMyJ9/gettyimages-898790712.jpg");
        mNames.add("Roberto Firmino");
        mDesc.add("Liverpool");
        mImageDet.add("Roberto Firmino merupakan pemain sepakbola yang lahir di Brazil.");

        mImageUrls.add("https://i0.wp.com/metro.co.uk/wp-content/uploads/2019/03/GettyImages-1136277683.jpg?quality=90&strip=all&zoom=1&resize=644%2C429&ssl=1");
        mNames.add("Paul Pogba");
        mDesc.add("Manchester United");
        mImageDet.add("Pogba merupakan pemain sepakbola yang lahir di Prancis.");

        initRecyclerView();

    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, mNames, mImageUrls, mDesc, mImageDet);
        recyclerView.setAdapter(adapter);
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames, mImageUrls, mDesc, mImageDet);
        recyclerView.setAdapter(adapter);

    }

    private void showRecyclerGrid() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridActivity adapter = new GridActivity(this, mImageUrls);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_list:
                setActionBarTitle("Mode List");
                showRecyleList();
                break;
            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Mode Card View");
                initRecyclerView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);

    }
}