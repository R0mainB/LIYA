package adventure.liya.mgr.com.liya.ecran;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import adventure.liya.mgr.com.liya.model.Aventure;
import adventure.liya.mgr.com.liya.R;

public class AventureAdapter extends ArrayAdapter<Aventure> {

    public AventureAdapter(@NonNull Context context, @NonNull List<Aventure> aventures) {
        super(context, 0, aventures);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.ligne_aventure,parent, false);
        }

        AventureViewHolder viewHolder = (AventureViewHolder) convertView.getTag();
        if(viewHolder==null){
            viewHolder = new AventureViewHolder();
            viewHolder.nomAventure = (TextView) convertView.findViewById(R.id.txt_nom_aventure);
            viewHolder.description = (TextView) convertView.findViewById(R.id.txt_description_aventure);
            convertView.setTag(viewHolder);
        }
        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Aventure aventure = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.nomAventure.setText(aventure.getLibelle());
        viewHolder.description.setText(aventure.getDescription());

        return convertView;
    }

    private class AventureViewHolder{
        public TextView nomAventure;
        public TextView description;
    }
}
