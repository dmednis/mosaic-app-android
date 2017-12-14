package lv.lu.dmednis.oopandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SketchActivity extends AppCompatActivity {

    SketchView mSketchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sketch);
        mSketchView = (SketchView) findViewById(R.id.sketchview);
    }

    public void onGenerateClick(View view) {
        Intent intent = new Intent(this, MosaicActivity.class);
        intent.putExtra("sketch", mSketchView.getResizedBitmap(200, 200));
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1: {
                mSketchView.reset();
                break;
            }
        }
    }
}
