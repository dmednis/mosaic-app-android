package lv.lu.dmednis.mosaicapp;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

public class MosaicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mosaic);

        Bitmap sketch = getIntent().getParcelableExtra("sketch");
        GridLayout mosaic = (GridLayout) findViewById(R.id.mosaic);

        for (int i = 0; i < 16; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setImageBitmap(sketch);
            mosaic.addView(imageView, i);
        }
    }

    public void onResetClick(View view) {
        finish();
    }
}
