package com.example.android.mlkitbaseapis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imgTextRecognition,imgFaceDetection,imgBarcodeScanning,imgImageLabeling,imgLandmarkRecognition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgTextRecognition = findViewById(R.id.imgTextRecognition);
        imgBarcodeScanning = findViewById(R.id.imgBarcodeScanning);
        imgImageLabeling = findViewById(R.id.imgImageLabeling);
        imgFaceDetection = findViewById(R.id.imgFaceDetection);
        imgLandmarkRecognition = findViewById(R.id.imgLandmarkRecognition);

        imgTextRecognition.setOnClickListener(this);
        imgLandmarkRecognition.setOnClickListener(this);
        imgBarcodeScanning.setOnClickListener(this);
        imgFaceDetection.setOnClickListener(this);
        imgImageLabeling.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.imgTextRecognition : {startActivity(new Intent(getBaseContext(),TextRecognition.class));
                                               break;}

            case R.id.imgBarcodeScanning : { startActivity(new Intent(getBaseContext(),BarcodeScanning.class));
            break;
            }
            case R.id.imgFaceDetection : { startActivity(new Intent(getBaseContext(),FaceDetection.class));
                break;
            }
            case R.id.imgLandmarkRecognition : { startActivity(new Intent(getBaseContext(),LandmarkRecognition.class));
                break;
            }
            case R.id.imgImageLabeling : { startActivity(new Intent(getBaseContext(),ImageLabelling.class));
                break;
            }


        }

    }
}
