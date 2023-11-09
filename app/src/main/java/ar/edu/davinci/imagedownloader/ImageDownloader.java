package ar.edu.davinci.imagedownloader;

import android.graphics.Bitmap;
import android.os.AsyncTask;

public class ImageDownloader extends AsyncTask<String, Integer, Bitmap> {
    private Bitmap imagenDescargada = null;
    @Override
    protected Bitmap doInBackground(String... strings) {
        return imagenDescargada;
    }
}
