package ar.edu.davinci.imagedownloader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void download(View v) {
        ImageView imageView = findViewById(R.id.imageView);
        ImageDownloader descarga = new ImageDownloader(imageView);
        descarga.execute("https://www.muycomputer.com/wp-content/uploads/2019/12/android.jpg");
    }
}