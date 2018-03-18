package shurinovlev.custom_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        MyCustom mycustom= new MyCustom(this);
        setContentView(mycustom);

    }
}



