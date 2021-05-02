package sg.edu.np.madpractical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user1  = new User();
        user1.name = "nyname";
        user1.followed = true;



        Button button =  findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (user1.followed == true){
                    button.setText("follow");
                    user1.followed = false;







                }

                else{
                    button.setText("unfollow");
                    user1.followed = true;




                }
            }



        });

    }
}