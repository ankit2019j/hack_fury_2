package ankit.com.hack_fury_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void quickSos(View view){
       Intent intent=new Intent(MainActivity.this,quickSos.class);
       startActivity(intent);

    }
    public void ondescp(View view){
        Intent intent=new Intent(MainActivity.this,descp.class);
        startActivity(intent);
    }
}
