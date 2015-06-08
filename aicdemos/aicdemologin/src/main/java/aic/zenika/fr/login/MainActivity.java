package aic.zenika.fr.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        Button button= (Button) findViewById(R.id.login_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView info = (TextView) findViewById(R.id.info);
                EditText username = (EditText) findViewById(R.id.username_input);
                EditText password = (EditText) findViewById(R.id.password_input);

                info.setText("");
                info.setVisibility(View.INVISIBLE);

                if(username.getText().toString().isEmpty()) {
                    info.setText(getResources().getText(R.string.username_error));
                    info.setBackgroundColor(getResources().getColor(R.color.red));
                    info.setVisibility(View.VISIBLE);
                }
                else if(password.getText().toString().isEmpty()) {
                    info.setText(getResources().getText(R.string.password_error));
                    info.setBackgroundColor(getResources().getColor(R.color.red));
                    info.setVisibility(View.VISIBLE);
                }
                else {
                    info.setVisibility(View.INVISIBLE);
                    Intent intent = new Intent(getApplicationContext(),RegisterActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
