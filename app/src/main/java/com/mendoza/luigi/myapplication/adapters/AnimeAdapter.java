package com.mendoza.luigi.myapplication.adapters;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.mendoza.luigi.myapplication.R;
import com.mendoza.luigi.myapplication.entities.Anime;

import java.util.List;

import static com.mendoza.luigi.myapplication.R.drawable.ic_launcher_background;

public class AnimeAdapter extends  RecyclerView.Adapter<AnimeAdapter.PalabraViewHolder>{
    List<Anime> animes;
    public AnimeAdapter (List<Anime>animes){
        this.animes = animes;
    }
    @Override
    public AnimeAdapter.PalabraViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_anime,parent,false);
        return new AnimeAdapter.PalabraViewHolder(view);
    }

    @Override
    public void onBindViewHolder( PalabraViewHolder holder, int position) {
        View view = holder.itemView;
        Anime anime =animes.get(position);
        TextView tvNombre = view.findViewById(R.id.tvNombre);
        TextView tvDescripcion= view.findViewById(R.id.tvDescripcion);
        ImageView  iview = view.findViewById(R.id.iv);
        ImageView  iv = view.findViewById(R.id.imagen);
        tvNombre.setText(anime.Nombre);
        tvDescripcion.setText (anime.Descripcion);
        iview.setImageResource(anime.Im);

        iv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction())
                {
                    case MotionEvent.ACTION_DOWN :
                        iv.setImageResource(R.drawable.imagen_2);
                        break;
                    case MotionEvent.ACTION_UP :
                        iv.setImageResource(R.drawable.imagen_1);
                        break;
                }
                return true;
            }
        });


    }

    @Override
    public int getItemCount() {
        return animes.size();
    }

    public  class PalabraViewHolder extends RecyclerView.ViewHolder{

        public PalabraViewHolder( View itemView) {
            super(itemView);
        }
    }
}
