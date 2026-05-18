package mch.ifsuldeminas.edu.constraint_layout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // 1. Mapeia os botões criados no arquivo XML
        Button btnOpenBlogPost = findViewById(R.id.btnOpenBlogPost);
        Button btnOpenNetflix = findViewById(R.id.btnOpenNetflix);
        Button btnOpenTextCompetition = findViewById(R.id.btnOpenTextCompetition);

        // 2. Clique para abrir a tela do Blog Post
        btnOpenBlogPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BlogPostActivity.class);
                startActivity(intent);
            }
        });

        // 3. Clique para abrir a tela da Netflix
        btnOpenNetflix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NetflixActivity.class);
                startActivity(intent);
            }
        });

        // 4. Clique para abrir a tela de Competição de Texto (Note o nome exato da sua classe)
        btnOpenTextCompetition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TextCompetitionActitity.class);
                startActivity(intent);
            }
        });
    }
}