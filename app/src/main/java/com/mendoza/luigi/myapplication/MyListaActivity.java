package com.mendoza.luigi.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mendoza.luigi.myapplication.adapters.AnimeAdapter;
import com.mendoza.luigi.myapplication.entities.Anime;

import java.util.ArrayList;
import java.util.List;

public class MyListaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_lista);
        RecyclerView rv = findViewById(R.id.rvPalabras);
        rv.setLayoutManager(new LinearLayoutManager(MyListaActivity.this));
        List<Anime>animes = GetAnimes();
        AnimeAdapter adapter= new AnimeAdapter(animes);
        rv.setAdapter(adapter);
    }
    public List<Anime> GetAnimes(){
        List<Anime>animes = new ArrayList<>();
        animes.add(new Anime("One Piece","Es un Manga y A nime del autor Eiichirō Oda",R.drawable.op));
        animes.add(new Anime("Naruto","Anime de un niño que se convierte en Hokage",R.drawable.naruto));
        animes.add(new Anime("Dragon Ball","Anime de luchas contra el mal, la mejor a nivel mundial",R.drawable.dragon_ball));
        animes.add(new Anime("SuperCampeones","Anime donde se juega Futbol Profesional",R.drawable.sp));
        animes.add(new Anime("Titanes","Anime donde existen gigantes que comena  la gente",R.drawable.at));
        animes.add(new Anime("Pokemon","Anime de Criaturas que aparecen para ser tus compañeros",R.drawable.pokemon));
        animes.add(new Anime("Digimon","Anime de criaturas que se fusionan con el humano ",R.drawable.digimon));
        animes.add(new Anime("Yu Gi Oh","Anime de invocaciones de Cartas",R.drawable.yu_gi_ho));
        animes.add(new Anime("Kings Raid","Anime de busca de la espada de la Salvacion",R.drawable.king_raid));
        animes.add(new Anime("Caballeros del zodiaco","Anime donde cuidan a una Diosa unos caballeros ",R.drawable.cz));
        return  animes;
    }
}