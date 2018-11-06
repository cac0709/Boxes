package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edLength;
    private EditText edWidth;
    private EditText edHight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
    }

    private void findView() {
        edLength = findViewById(R.id.ed_length);
        edWidth = findViewById(R.id.ed_width);
        edHight = findViewById(R.id.ed_height);
    }

    public void check(View view) {
        float length = Float.parseFloat(edLength.getText().toString());
        float width = Float.parseFloat(edWidth.getText().toString());
        float hight = Float.parseFloat(edHight.getText().toString());

        if(length <= 23 && width<= 14 && hight<=13){
            Intent intent = new Intent(this,Box3Activity.class);
            startActivity(intent);
        }else{
            Intent intent2 = new Intent(this,Box5Activity.class);
            startActivity(intent2);

        }



    }
}
