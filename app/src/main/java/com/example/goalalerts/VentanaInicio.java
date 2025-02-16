package com.example.goalalerts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class VentanaInicio extends AppCompatActivity {

    private FloatingActionButton fabAddPartido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ventana_inicio);

        // Configurar el botón de agregar partido
        fabAddPartido = findViewById(R.id.fabAddPartido);
        fabAddPartido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar PartidoManagementActivity al hacer clic en el botón
                Intent intent = new Intent(VentanaInicio.this, PartidoManagementActivity.class);
                startActivity(intent);
            }
        });

        // Manejar los márgenes de los bordes del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
