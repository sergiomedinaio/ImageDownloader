package ar.edu.davinci.imagedownloader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;

import java.io.InputStream;
import java.net.URL;

public class ImageDownloader extends AsyncTask<String, Integer, Bitmap> {
    private Bitmap imagenDescargada = null;
    @Override
    protected Bitmap doInBackground(String... strings) {
        String URL_consulta = strings[0];
        try {
            URL consulta = new URL(URL_consulta); //preparar la consulta
            InputStream contenido = (InputStream) consulta.getContent();
            this.imagenDescargada = BitmapFactory.decodeStream(contenido);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return imagenDescargada;
    }
}
