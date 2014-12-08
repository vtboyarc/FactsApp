package adamrcarter.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class FunFactsActivity extends Activity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);


        // Declare our view variables and assigned them the views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
              public void onClick(View view) {
                String fact = mFactBook.getFact();


                // Update the label with our dynamic fact
                factLabel.setText(fact);
                factLabel.setMovementMethod(new ScrollingMovementMethod());

                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);


            }
        };
        showFactButton.setOnClickListener(listener);


      // Toast.makeText(this, "yay!", Toast.LENGTH_LONG).show();
        Log.d(TAG, "We are logging from the onCreate() method");

    }
}
