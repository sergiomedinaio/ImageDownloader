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
        ImageView imageView2 = findViewById(R.id.imageView2);

        ImageDownloader descarga = new ImageDownloader(imageView);
        descarga.execute("https://www.muycomputer.com/wp-content/uploads/2019/12/android.jpg");

        ImageDownloader descarga2 = new ImageDownloader(imageView2);
        descarga2.execute("https://cdn.computerhoy.com/sites/navi.axelspringer.es/public/media/image/2022/10/android-2832529.jpg");
    }
}