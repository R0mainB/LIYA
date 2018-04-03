package adventure.liya.mgr.com.liya.ecran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import adventure.liya.mgr.com.liya.R;
import adventure.liya.mgr.com.liya.model.Aventure;

public class SelectionAventureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_aventure);

        ListView lv = findViewById(R.id.lst_select_aventure);

        List<Aventure> aventures = new ArrayList<>();
        aventures.add(new Aventure("Aventure 1","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent ultricies neque nec felis tempor, ut gravida tellus auctor. Vivamus eleifend enim odio, nec elementum quam egestas non. Duis erat quam, semper vitae nisl ac, dictum accumsan elit. Nam eget dignissim risus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eget rutrum nunc, eget ornare risus. Fusce semper ipsum non sodales facilisis. Aliquam urna lorem, rutrum in ipsum at, ullamcorper dapibus orci. Maecenas sit amet mauris ut nisl eleifend venenatis. Mauris lorem elit, luctus vel scelerisque at, euismod et eros. Morbi sit amet sem aliquet, accumsan purus vitae, euismod justo."));
        aventures.add(new Aventure("Aventure 2","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent ultricies neque nec felis tempor, ut gravida tellus auctor. Vivamus eleifend enim odio, nec elementum quam egestas non. Duis erat quam, semper vitae nisl ac, dictum accumsan elit. Nam eget dignissim risus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eget rutrum nunc, eget ornare risus. Fusce semper ipsum non sodales facilisis. Aliquam urna lorem, rutrum in ipsum at, ullamcorper dapibus orci. Maecenas sit amet mauris ut nisl eleifend venenatis. Mauris lorem elit, luctus vel scelerisque at, euismod et eros. Morbi sit amet sem aliquet, accumsan purus vitae, euismod justo."));
        aventures.add(new Aventure("Aventure 3","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent ultricies neque nec felis tempor, ut gravida tellus auctor. Vivamus eleifend enim odio, nec elementum quam egestas non. Duis erat quam, semper vitae nisl ac, dictum accumsan elit. Nam eget dignissim risus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eget rutrum nunc, eget ornare risus. Fusce semper ipsum non sodales facilisis. Aliquam urna lorem, rutrum in ipsum at, ullamcorper dapibus orci. Maecenas sit amet mauris ut nisl eleifend venenatis. Mauris lorem elit, luctus vel scelerisque at, euismod et eros. Morbi sit amet sem aliquet, accumsan purus vitae, euismod justo."));
        aventures.add(new Aventure("Aventure 4","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent ultricies neque nec felis tempor, ut gravida tellus auctor. Vivamus eleifend enim odio, nec elementum quam egestas non. Duis erat quam, semper vitae nisl ac, dictum accumsan elit. Nam eget dignissim risus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eget rutrum nunc, eget ornare risus. Fusce semper ipsum non sodales facilisis. Aliquam urna lorem, rutrum in ipsum at, ullamcorper dapibus orci. Maecenas sit amet mauris ut nisl eleifend venenatis. Mauris lorem elit, luctus vel scelerisque at, euismod et eros. Morbi sit amet sem aliquet, accumsan purus vitae, euismod justo."));


        AventureAdapter adapter = new AventureAdapter(SelectionAventureActivity.this,aventures);
        lv.setAdapter(adapter);

    }
}