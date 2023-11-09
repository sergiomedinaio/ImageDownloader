package ar.edu.davinci.imagedownloader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

public class ImageDownloader extends AsyncTask<String, Integer, Bitmap> {
    private ImageView imageView;

    public ImageDownloader(ImageView imageView) {
        this.imageView = imageView;
    }

    @Override
    protected Bitmap doInBackground(String... strings) {
        String URL_consulta = strings[0];
        try {
            URL consulta = new URL(URL_consulta); //preparar la consulta
            InputStream contenido = (InputStream) consulta.getContent();
            return BitmapFactory.decodeStream(contenido);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Bitmap imagenDescargada) {
        super.onPostExecute(imagenDescargada);

        if(imagenDescargada == null) return;

        this.imageView.setImageBitmap(imagenDescargada);
    }
}
