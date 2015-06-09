package aic.zenika.com.login;

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
        this.setContentView(aic.zenika.fr.login.R.layout.activity_main);

        Button button= (Button) findViewById(aic.zenika.fr.login.R.id.login_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView info = (TextView) findViewById(aic.zenika.fr.login.R.id.info);
                EditText username = (EditText) findViewById(aic.zenika.fr.login.R.id.username_input);
                EditText password = (EditText) findViewById(aic.zenika.fr.login.R.id.password_input);

                info.setText("");
                info.setVisibility(View.INVISIBLE);

                if(username.getText().toString().isEmpty()) {
                    info.setText(getResources().getText(aic.zenika.fr.login.R.string.username_error));
                    info.setBackgroundColor(getResources().getColor(aic.zenika.fr.login.R.color.red));
                    info.setVisibility(View.VISIBLE);
                }
                else if(password.getText().toString().isEmpty()) {
                    info.setText(getResources().getText(aic.zenika.fr.login.R.string.password_error));
                    info.setBackgroundColor(getResources().getColor(aic.zenika.fr.login.R.color.red));
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
