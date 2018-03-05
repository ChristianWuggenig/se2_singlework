package se2.aau.at.se2_singleproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void onClickBtnCheckString(View view) {
        EditText etxInput = this.findViewById(R.id.etxInput);

        TextView txvMessage = this.findViewById(R.id.txvMessage);

        if(etxInput.getText().toString().equals(""))
            txvMessage.setText(R.string.msgNoInput);
        else {
            if(etxInput.getText().toString().length() < 5)
                txvMessage.setText(R.string.msgLengthError);
            else {
                if(isPalindrome(etxInput.getText().toString()))
                    txvMessage.setText(R.string.msgSuccess);
                else
                    txvMessage.setText(R.string.msgNoPalindrome);
            }
        }

    }

    private static boolean isPalindrome(String string) {
        return string.equals(new StringBuilder(string).reverse().toString());
    }
}
